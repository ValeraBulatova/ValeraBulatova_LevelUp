package ru.levelUp.homework_5;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.testng.AssertJUnit.assertEquals;

public class BaseTest {


    protected WebDriver driver;
    private ChromeOptions options;

    @BeforeSuite (alwaysRun = true)
    protected void setUpSuite() {
       WebDriverManager.chromedriver().setup();
    }

    @BeforeClass (alwaysRun = true)
    public void setUpClassTest() {
        options = new ChromeOptions();
    }
    @BeforeMethod(alwaysRun = true)
    protected void setUpTest() {
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        driver.manage().timeouts().pageLoadTimeout(10000, TimeUnit.MILLISECONDS);
        driver.manage().timeouts().setScriptTimeout(15000, TimeUnit.MILLISECONDS);
        // 1. Открыть MantisBT: http://khda91.fvds.ru/mantisbt/
        driver.get("http://khda91.fvds.ru/mantisbt/");
//      check Title
        String actualTitle = driver.getTitle();
        String expectedTitle = "MantisBT";
        assertEquals(expectedTitle, actualTitle);
//        Login as administrator
        LoginVoid loginVoid = new LoginVoid(driver);
        loginVoid.login("administrator", "root");

        //  Проверить, что пользователь авторизован
        assertThat(driver.getTitle(), equalTo("My Account - MantisBT"));

//      Проверить имя администратор
        WebElement name = driver.findElement(By.partialLinkText("administrator"));
        String expectedName = "administrator";
        String actualName = name.getText();
        assertEquals(expectedName, actualName);
    }

    @AfterMethod
    protected void closeBrowser() {
        // разлогиниться
        driver.findElement(By.className("user-info")).click();
        driver.findElement(By.partialLinkText("Logout")).click();
        //  9. Закрыть браузер
        driver.close();
    }

}
