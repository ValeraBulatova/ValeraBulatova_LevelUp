package ru.levelUp.homework_6;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsNull.notNullValue;


public class TaskAddProject extends BeforeTest {

    @Test
    public void addProjectTest() {

//      Открыть пункт меню "Manage"
        homePage.goToManagePage();

//      Выбрать вклатку "Manage Project"
        managePage.clickManageProjectBttn();

//      Check New project button
        assertThat(projectPage.getNewProjButton(), notNullValue());

//        кликнуть New Project
        projectPage.clickNewProjButton();

//        Проверить наличие полей для создания проекта


        List<String> actualFields = new ArrayList<>();
        for ( WebElement countField : projectPage.getProjectField()) {
            actualFields.add(countField.getText());
        }

//        Check fields of Project
        assertThat(actualFields, equalTo(projectPage.getStorageFiedsProject()));


//      Заполнить поля для создания проекта
        String projectName = RandomStringUtils.randomAlphabetic(10);
        projectPage.fillTxtProjectName(projectName);

        projectPage.selectStatus(properties.getProperty("status"));
        projectPage.selectStatusView(properties.getProperty("statusView"));

        if(projectPage.getInheritGlobCategories().isSelected()){
            projectPage.clickInheritGlobCategories();
        }

        String description = RandomStringUtils.randomAlphabetic(20);
        projectPage.fillTxtProjectDescription(description);

//        Нажать кнопку для создания
        projectPage.clickButtonSubmitNewProject();

    }
}
