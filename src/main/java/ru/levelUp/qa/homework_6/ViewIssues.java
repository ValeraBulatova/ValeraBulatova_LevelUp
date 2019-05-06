package ru.levelUp.qa.homework_6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.levelUp.qa.homework_6.base.BasePage;

import java.util.List;


public class ViewIssues extends BasePage {

    @FindBy(id = "show_priority_filter")
    private WebElement filterPriority;
    @FindBy(id = "show_severity_filter")
    private WebElement filterSeverity;
    @FindBy(id = "show_status_filter")
    private WebElement status;
    @FindBy(id = "do_filter_by_date_filter")
    private WebElement filterByDate;
    @FindBy(name = "priority[]")
    private WebElement selectPriority;
    @FindBy(name = "severity[]")
    private WebElement chooseSeverity;
    @FindBy(name = "status[]")
    private WebElement chooseStatus;
    @FindBy(xpath = "//span[@class = 'lbl padding-6 small']")
    private WebElement submitFilerByDate;
    @FindBy(name = "start_year")
    private WebElement startYear;
    @FindBy(name = "start_month")
    private WebElement startMonth;
    @FindBy(name = "start_day")
    private WebElement startDay;
    @FindBy(name = "end_year")
    private WebElement endYear;
    @FindBy(name = "end_month")
    private WebElement endMonth;
    @FindBy(name = "end_day")
    private WebElement endDay;
    @FindBy(xpath = "//input[@name='filter_submit']")
    private WebElement applyFilterButton;

    @FindBy(xpath = "//td[@class='column_id']")
    private List<WebElement> possibleIssues;



    public ViewIssues(WebDriver driver) {
        super(driver);
    }

    public void filterPriorityClick(){
        filterPriority.click();
    }

    public void selectPriorityFilter (String severity){
        selectPriority.sendKeys(severity);
    }

    public void filterSeverityClick(){
        filterSeverity.click();
    }
    public void selectSeverity(String value){
        chooseSeverity.sendKeys(value);
    }
    public void filterstatusClick(){
        status.click();
    }
    public void selectStatus(String value){
        chooseStatus.sendKeys(value);
    }
    public void filterByDateClick(){
        filterByDate.click();
    }
    public void submitFilterByDate (){
        submitFilerByDate.click();
    }
    public void setStartYear (String value){
        startYear.sendKeys(value);
    }
    public void setStartMonth (String value){
        startMonth.sendKeys(value);
    }
    public void setStartDay (String value){
        startDay.sendKeys(value);
    }
    public void setEndYear (String value){
        endYear.sendKeys(value);
    }
    public void setEndMonth (String value){
        endMonth.sendKeys(value);
    }
    public void setEndDay (String value){
        endDay.sendKeys(value);
    }

    public void clickApplyFilterButton() {
        applyFilterButton.click();
    }

    public WebElement getSubmitFilerByDate() {
        return submitFilerByDate;
    }

    public List<WebElement> getPossibleIssues() {
        return possibleIssues;
    }

}
