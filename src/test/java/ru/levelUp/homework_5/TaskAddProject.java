package ru.levelUp.homework_5;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsNull.notNullValue;



public class TaskAddProject extends BaseTest {


    @Test
    public void addProjectTest() {

//        Проверка ниличия меню
        WebElement leftMenu = driver.findElement(By.id("menu-toggler"));
        assertThat(leftMenu, notNullValue());


//      Открыть пункт меню "Manage"
        driver.findElement(By.partialLinkText("Manage")).click();

//      Выбрать вклатку "Manage Project"
        driver.findElement(By.partialLinkText("Manage Project")).click();

//      Check New project button
        String projectName = RandomStringUtils.randomAlphabetic(10);

        WebElement newProjButton = driver.findElement(By.xpath("//button[@type='submit']"));
        assertThat(newProjButton, notNullValue());

//        кликнуть New Project
        newProjButton.click();

//        Проверить наличие полей для создания проекта

        List<WebElement> projectField = driver.findElements(By.xpath("//td[@class='category']"));
        List<String> actualFields = new ArrayList<>();
        for ( WebElement countField : projectField) {
            actualFields.add(countField.getText());
        }
        System.out.println(actualFields);

        List<String> storageField = Arrays.asList(new String[]{"* Project Name",
                "Status", "Inherit Global Categories", "View Status",
                "Description"});

        assertThat(actualFields, equalTo(storageField));


//      Заполнить поля для создания проекта
        driver.findElement(By.id("project-name")).sendKeys(projectName);

        Select status = new Select(driver.findElement(By.id("project-status")));
        status.selectByVisibleText("development");

        Select statusView = new Select(driver.findElement(By.id("project-view-state")));
        statusView.selectByVisibleText("public");

        if(driver.findElement(By.id("project-inherit-global")).isSelected()){
            driver.findElement(By.xpath("//span[@class='lbl']")).click();
        }

        String description = RandomStringUtils.randomAlphabetic(20);
        driver.findElement(By.id("project-description"))
                .sendKeys(description);

//        Нажать кнопку для создания
        driver.findElement(By.xpath("//input[@type='submit']"))
                .click();

    }
}
