package ru.levelUp.homework_6;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.levelUp.qa.homework_6.HomePage;
import ru.levelUp.qa.homework_6.LoginPage;
import ru.levelUp.qa.homework_6.ManagePage;
import ru.levelUp.qa.homework_6.ViewIssues;
import ru.levelUp.qa.homework_6.enums.MenuItem;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.core.IsNull.notNullValue;
import static org.junit.Assert.assertThat;

public class CreateIssue extends BeforeTest{

    @Test
    public void testCreateIssue (){

//      Click View Issue
        homePage.viewIssuesClick();

//        Set filters
        viewIssues.filterPriorityClick();
        viewIssues.selectPriorityFilter(properties.getProperty("priority"));
        viewIssues.filterSeverityClick();
        viewIssues.selectSeverity(properties.getProperty("severity"));
        viewIssues.filterstatusClick();
        viewIssues.selectStatus(properties.getProperty("status"));
        viewIssues.filterByDateClick();

        if(viewIssues.getSubmitFilerByDate().isSelected()){
            viewIssues.submitFilterByDate();
        }
        viewIssues.setStartDay(properties.getProperty("startDay"));
        viewIssues.setStartMonth(properties.getProperty("startMonth"));
        viewIssues.setStartYear(properties.getProperty("startYear"));
        viewIssues.setEndDay(properties.getProperty("endDay"));
        viewIssues.setEndMonth(properties.getProperty("endMonth"));
        viewIssues.setEndYear(properties.getProperty("endYear"));
//        Submit filters
        viewIssues.clickApplyFilterButton();
//        Check result
        List<String> actualIssues = new ArrayList<>();
        for ( WebElement countIssue : viewIssues.getPossibleIssues()) {
            actualIssues.add(countIssue.getText());
        }
        for (String countIssue : actualIssues) {
            assertThat(actualIssues, notNullValue());
        }

    }



}
