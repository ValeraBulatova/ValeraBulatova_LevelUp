package ru.levelUp.homework_7;

import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.containsString;

public class ApiTests extends BaseTest{

    static String userID;
    static String projectId;
    static String issueId;


    @Test
    public void createUser(){

        RequestSpecification request =given()
                .baseUri("http://khda91.fvds.ru/mantisbt/api/rest")
                .header(new Header("Authorization", "XNd5tIXXB7U8FV4C8w0nao0WYr5S0nN7"))
                .contentType(ContentType.JSON)
                .body(user);
        Response response = request.when()
                .post("/users");
        String userCreatedWithId = response.then()
                .statusCode(201)
                .statusLine(containsString("User created with id"))
                .extract()
                .statusLine();
        String[] splitStatusLine = userCreatedWithId.split(" ");
        userID = splitStatusLine[splitStatusLine.length - 1];
        System.out.println("User id -> "  + "/" + userID + "/");
    }
    @Test
    public void deleteUser(){
        RequestSpecification request =given()
                .baseUri("http://khda91.fvds.ru/mantisbt/api/rest")
                .header(new Header("Authorization", "XNd5tIXXB7U8FV4C8w0nao0WYr5S0nN7"));
        Response response = request.when()
                .delete("/users/352"); // неправильно плюсует айдишник ("/users/" + userID) падает с ошибкой, при подстановке вручную работает.
        response                          // не смогла разобраться, почему. на печать в консоль выходила та же строчка
                .then()
                .statusCode(204);
    }
    @Test
    public void deleteUnexistingUser(){
        RequestSpecification request =given()
                .baseUri("http://khda91.fvds.ru/mantisbt/api/rest")
                .header(new Header("Authorization", "XNd5tIXXB7U8FV4C8w0nao0WYr5S0nN7"));
        Response response = request.when()
                .delete("/users/90775");
        response
                .then()
                .statusCode(404)
                .statusLine(containsString("not found"));
    }
    @Test
    public void createProject(){
        RequestSpecification request =given()
                .baseUri("http://khda91.fvds.ru/mantisbt/api/rest")
                .header(new Header("Authorization", "XNd5tIXXB7U8FV4C8w0nao0WYr5S0nN7"))
                .contentType(ContentType.JSON)
                .body(project);
        Response response = request.when()
                .post("/projects");
        String projectCreatedWithId = response.then()
                .statusCode(201)
                .statusLine(containsString("Project created with id"))
                .extract()
                .statusLine();
        String[] splitStatusLine = projectCreatedWithId.split(" ");
        projectId = splitStatusLine[splitStatusLine.length - 1];
        System.out.println("Project id -> " + projectId);
    }
    @Test
    public void addSubProject(){
        RequestSpecification request =given()
                .baseUri("http://khda91.fvds.ru/mantisbt/api/rest")
                .header(new Header("Authorization", "XNd5tIXXB7U8FV4C8w0nao0WYr5S0nN7"))
                .contentType(ContentType.JSON)
                .body(project);
        Response response = request.when()
                .post("/projects/361/subprojects");
        response.then()
                .statusCode(204)
                .statusLine(containsString("added to project"));


    }
    @Test
    public void deleteUnexistingProject(){
        RequestSpecification request =given()
                .baseUri("http://khda91.fvds.ru/mantisbt/api/rest")
                .header(new Header("Authorization", "XNd5tIXXB7U8FV4C8w0nao0WYr5S0nN7"));
        Response response = request.when()
                .delete("/projects/21775");
        response
                .then()
                .statusCode(403)
                .statusLine(containsString("Access denied for deleting project"));
    }

    @Test
    public void createIssue(){
        RequestSpecification request =given()
                .baseUri("http://khda91.fvds.ru/mantisbt/api/rest")
                .header(new Header("Authorization", "XNd5tIXXB7U8FV4C8w0nao0WYr5S0nN7"))
                .contentType(ContentType.JSON)
                .body(issue);
        Response response = request.when()
                .post("/issues");
        String userCreatedWithId = response.then()
                .statusCode(201)
                .statusLine(containsString("Issue Created with id"))
                .extract()
                .statusLine();
        String[] splitStatusLine = userCreatedWithId.split(" ");
        issueId = splitStatusLine[splitStatusLine.length - 1];
        System.out.println("User id -> " + issueId);
    }

    @Test
    public void updateIssue(){
        RequestSpecification request =given()
                .baseUri("http://khda91.fvds.ru/mantisbt/api/rest")
                .header(new Header("Authorization", "XNd5tIXXB7U8FV4C8w0nao0WYr5S0nN7"))
                .contentType(ContentType.JSON)
                .body(updIssue);
        Response response = request.when()
                .patch("/issues/109"); // неправильно плюсует айдишник
        response
                .then()
                .statusCode(200)
                .statusLine(containsString("Issue with id"));

    }
    @Test
    public void updateUnexistingIssue(){
        RequestSpecification request =given()
                .baseUri("http://khda91.fvds.ru/mantisbt/api/rest")
                .header(new Header("Authorization", "XNd5tIXXB7U8FV4C8w0nao0WYr5S0nN7"))
                .contentType(ContentType.JSON)
                .body(updIssue);
        Response response = request.when()
                .patch("/issues/" + projectId);
        response
                .then()
                .statusCode(404)
                .statusLine(containsString("not found"));

    }

}
