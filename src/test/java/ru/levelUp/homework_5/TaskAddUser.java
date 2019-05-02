package ru.levelUp.homework_5;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsNull.notNullValue;
import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class TaskAddUser extends BaseTest {

    @Test
    public void testAddUser(){
//        Проверка ниличия меню
        WebElement leftMenu = driver.findElement(By.id("menu-toggler"));
        assertThat(leftMenu, notNullValue());


//      Открыть пункт меню "Manage"
        driver.findElement(By.partialLinkText("Manage")).click();

//      Выбрать вклатку "Manage Users"
        driver.findElement(By.partialLinkText("Manage Users")).click();

//        Найти кнопку Create Account, проверить, что она есть

        WebElement btnCreateAccount = driver.findElement(By.xpath("//div[@class='pull-left']/a"));
        assertThat(btnCreateAccount, notNullValue());

//        Нажать кнопку Create Account

        btnCreateAccount.click();

//        Проверка полей Create Account

        List<WebElement> projectField = driver.findElements(By.xpath("//td[@class='category']"));
        List<String> actualFields = new ArrayList<>();
        for ( WebElement countField : projectField) {
            actualFields.add(countField.getText());
        }
        System.out.println(actualFields);

        List<String> storageField = new ArrayList<>();
        storageField.add("Username");
        storageField.add("Real Name");
        storageField.add("E-mail");
        storageField.add("Password");
        storageField.add("Verify Password");
        storageField.add("Access Level");
        storageField.add("Enabled");
        storageField.add("Protected");

        // TODO В hamcrest есть метод для проверки коллекций

        assertThat(actualFields, equalTo(storageField));

        //      Заполнить поля для создания проекта

        String username = RandomStringUtils.randomAlphabetic(10);
        String password = RandomStringUtils.randomAlphabetic(5);
//        Заполнить Username и Real Name
        driver.findElement(By.id("user-username")).sendKeys(username);
        driver.findElement(By.id("user-realname")).sendKeys(username);

//        Заполнить E-mail
        driver.findElement(By.id("email-field")).sendKeys(username + "@mail.com");

//        Заполнить и подтвердить пароль
        driver.findElement(By.id("user-password")).sendKeys(password);
        driver.findElement(By.name("password_verify")).sendKeys(password);

//        Выбрать Access Level
        Select accessLevel = new Select(driver.findElement(By.name("access_level")));
        accessLevel.selectByVisibleText("reporter");


//        Проставить галочки: Enable = true, Protected = false

        // TODO А для каких целей использовано == false??
        if(driver.findElement(By.name("enabled")).isSelected()){

        }else{
            driver.findElement(By.xpath("//span[@class='lbl']")).click();
        }

        if(driver.findElement(By.name("protected")).isSelected()){
            driver.findElement(By.xpath("//span[@class='lbl']")).click();
        }

//        Нажать Create User
        driver.findElement(By.xpath("//input[@type='submit']"))
                .click();
//        Logout
        driver.findElement(By.className("user-info")).click();
        driver.findElement(By.partialLinkText("Logout")).click();

//        Login As Created User
        LoginVoid loginVoid = new LoginVoid(driver);
        loginVoid.login(username, password);

//        Check that created user loggeg in
        WebElement name = driver.findElement(By.partialLinkText(username));
        String actualName = name.getText();
        assertEquals(username, actualName);


    }

}
