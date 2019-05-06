package ru.levelUp.homework_6;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import ru.levelUp.qa.homework_6.LoginPage;
import ru.levelUp.qa.homework_6.enums.MenuItem;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.testng.AssertJUnit.assertEquals;

public class BaseTest {


    protected WebDriver driver;
    private ChromeOptions options;
    protected Properties properties;
//    protected LoginPage loginPage;


    @BeforeSuite(alwaysRun = true)
    protected void setUpSuite() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeClass(alwaysRun = true)
    public void setUpClassTest() {
        options = new ChromeOptions();
    }

    @BeforeMethod(alwaysRun = true)
    protected void setUpTest() {
        driver = new ChromeDriver(options);

        System.setProperty("webdriver.chrome.driver","libs/chromedriver.exe");
        properties = new Properties();

        try {
            properties.load(new FileInputStream(new File("src/test/issueValues.properties")));
            properties.load(new FileInputStream(new File("src/test/projectValues.properties")));
        } catch (IOException e){
            e.printStackTrace();
        }
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        driver.manage().timeouts().pageLoadTimeout(10000, TimeUnit.MILLISECONDS);
        driver.manage().timeouts().setScriptTimeout(15000, TimeUnit.MILLISECONDS);
        // 1. Открыть MantisBT: http://khda91.fvds.ru/mantisbt/
        driver.get("http://khda91.fvds.ru/mantisbt/");

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

