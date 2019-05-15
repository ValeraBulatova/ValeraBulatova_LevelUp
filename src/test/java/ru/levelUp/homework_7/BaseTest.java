package ru.levelUp.homework_7;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.testng.annotations.BeforeClass;
import ru.levelUp.qa.homework_7.IssueFiles.Issue;
import ru.levelUp.qa.homework_7.projectFiles.Project;
import ru.levelUp.qa.homework_7.User;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BaseTest {

    protected User user;
    protected Project project;
    protected Project subProject;
    protected Issue issue;
    protected  Issue updIssue;

    @BeforeClass(alwaysRun = true)
    public void getJsonData(){

        ObjectMapper mapper = new ObjectMapper();
        // TODO А как через файлы сделать проверку разных данных в полях?
        File readUser = new File("src/test/resources/homework_7/users.json");
        File readProject = new File("src/test/resources/homework_7/project.json");
        File readIssue = new File("src/test/resources/homework_7/issue.json");
        File readupdIssue = new File("src/test/resources/homework_7/updateIssue.json");
        File readSubProject = new File("src/test/resources/homework_7/subProject.json");
        try {
            user = mapper.readValue(readUser, User.class);
            issue = mapper.readValue(readIssue, Issue.class);
            project = mapper.readValue(readProject, Project.class);
            updIssue = mapper.readValue(readupdIssue, Issue.class);
            subProject = mapper.readValue(readSubProject, Project.class);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (JsonParseException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
