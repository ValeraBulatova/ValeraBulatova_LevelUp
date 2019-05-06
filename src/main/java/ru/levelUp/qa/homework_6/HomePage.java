package ru.levelUp.qa.homework_6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.levelUp.qa.homework_6.base.BasePage;

public class HomePage extends BasePage {


    @FindBy(id = "menu-toggler")
    WebElement leftMenu;
    @FindBy(partialLinkText = "View Issues")
    private WebElement viewIssue;
    @FindBy(partialLinkText = "Manage")
    private WebElement manage;


    public static final String PAGE_TITLE = "MantisBT";

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void viewIssuesClick(){
        viewIssue.click();
    }

    public void goToManagePage(){
        manage.click();
    }

    public WebElement getLeftMenu() {
        return leftMenu;
    }
}
