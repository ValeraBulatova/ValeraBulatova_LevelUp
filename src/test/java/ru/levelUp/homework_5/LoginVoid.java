package ru.levelUp.homework_5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class LoginVoid {

    public WebDriver driver;
    public LoginVoid (WebDriver driver){
        this.driver = driver;
    }

    public void login(String username, String password) {
        // 2. Авторизоваться admin:admin
        driver.findElement(By.id("username")).sendKeys(username);
        WebElement loginBtn = driver.findElement(By.cssSelector(".btn-success"));
        loginBtn.click();

        WebElement passwordTextField = driver.findElement(By.id("password"));
        passwordTextField.sendKeys(password);
        driver.findElement(By.cssSelector(".btn-success")).click();

    }
}
