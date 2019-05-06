package ru.levelUp.homework_6;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import ru.levelUp.qa.homework_6.*;
import ru.levelUp.qa.homework_6.enums.MenuItem;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.core.IsNull.notNullValue;
import static org.junit.Assert.assertThat;

public class BeforeTest extends BaseTest{

    HomePage homePage;
    ManagePage managePage;
    ViewIssues viewIssues;
    LoginPage loginPage;
    ProjectPage projectPage;

    @BeforeMethod(alwaysRun = true)
    @Override
    protected void setUpTest() {
        super.setUpTest();
        loginPage = new LoginPage(driver);
        homePage  = PageFactory.initElements(driver, HomePage.class);
        managePage = new ManagePage(driver);
        viewIssues = new ViewIssues(driver);
        projectPage = new ProjectPage(driver);
        assertThat(loginPage.getPageTitle(), equalTo(MenuItem.LOGIN_PAGE.getValue()));
//        Login
        loginPage.login(properties.getProperty("admin.username"), properties.getProperty("admin.password"));
//        Assert "administrator" name
        assertThat(homePage.getPageTitle(), equalTo(MenuItem.HOME_PAGE.getValue()));
//        Assert Leftside menu
        assertThat(homePage.getLeftMenu(), notNullValue());

    }
}
