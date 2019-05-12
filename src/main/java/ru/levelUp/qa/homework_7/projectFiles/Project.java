package ru.levelUp.qa.homework_7.projectFiles;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Project {

    private int id;
    private String name;
    @JsonProperty("description")
    private String description;
    @JsonProperty("enabled")
    private boolean enabled;
    @JsonProperty("file_path")
    private String filePath;
    @JsonProperty("status")
    private ProjectStatus status;
    @JsonProperty("view_state")
    private ProjectViewState viewState;

}
