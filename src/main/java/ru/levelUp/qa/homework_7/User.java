package ru.levelUp.qa.homework_7;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import ru.levelUp.qa.homework_7.projectFiles.Project;

import java.util.ArrayList;
import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class User {

    private String id;
    private String name;
    private String language;

    private String username;
    private String password;

    @JsonProperty("real_name")
    private String realName;
    private String email;

    @JsonProperty("access_level")
    private UserAccessLevel accessLevel;
    private boolean enabled;

    @JsonProperty("protected")
    private boolean userProtected;

    private List<Project> projects = new ArrayList<>();
}
