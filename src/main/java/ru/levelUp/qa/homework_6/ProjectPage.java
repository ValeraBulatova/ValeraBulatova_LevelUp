package ru.levelUp.qa.homework_6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.levelUp.qa.homework_6.base.BasePage;

import java.util.Arrays;
import java.util.List;

public class ProjectPage extends BasePage {

    @FindBy (xpath = "//button[@type='submit']")
    private WebElement newProjButton;

    @FindBy(xpath = "//td[@class='category']")
    List<WebElement> projectField;
    @FindBy(id = "project-name")
    private WebElement txtProjectName;
    @FindBy(id = "project-status")
    private WebElement status;
    @FindBy(id = "project-view-state")
    private WebElement statusView;
    @FindBy(id = "project-inherit-global")
    private WebElement inheritGlobCategories;
    @FindBy(xpath = "//span[@class='lbl']")
    private WebElement inheritGlobCategoriesToClick;
    @FindBy(id = "project-description")
    private WebElement txtProjectDescription;
    @FindBy(xpath = "//input[@type='submit']")
    private WebElement buttonSubmitProject;

    private List<String> storageFiedsProject = Arrays.asList(new String[]{"* Project Name",
            "Status", "Inherit Global Categories", "View Status",
            "Description"});


    public List<WebElement> getProjectField() {
        return projectField;
    }

    public ProjectPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getNewProjButton() {
        return this.newProjButton;
    }
    public void clickNewProjButton(){
        newProjButton.click();
    }

    public List<String> getStorageFiedsProject() {
        return storageFiedsProject;
    }
    public void fillTxtProjectName(String projectName){
        txtProjectName.sendKeys(projectName);
    }
    public void selectStatus(String value){
        status.sendKeys(value);
    }
    public void selectStatusView(String value){
        statusView.sendKeys(value);
    }

    public WebElement getInheritGlobCategories() {
        return inheritGlobCategories;
    }
    public void clickInheritGlobCategories(){
        inheritGlobCategoriesToClick.click();
    }
    public void fillTxtProjectDescription(String description){
        txtProjectDescription.sendKeys(description);
    }
    public void clickButtonSubmitNewProject(){
        buttonSubmitProject.click();
    }
}
