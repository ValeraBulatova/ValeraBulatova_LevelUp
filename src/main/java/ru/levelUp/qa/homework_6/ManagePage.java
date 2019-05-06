package ru.levelUp.qa.homework_6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.levelUp.qa.homework_6.base.BasePage;


public class ManagePage extends BasePage {


    @FindBy(partialLinkText = "View Issues")
    private WebElement viewIssues;
    @FindBy(partialLinkText = "Manage Projects")
    private WebElement manageProjectButton;

    public ManagePage(WebDriver driver) {
        super(driver);
    }

    public void viewIssuesClick(){
        viewIssues.click();
    }
    public void clickManageProjectBttn(){
        manageProjectButton.click();
    }
}
