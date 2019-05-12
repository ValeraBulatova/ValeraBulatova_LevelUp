package ru.levelUp.qa.homework_7.IssueFiles;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import ru.levelUp.qa.homework_7.projectFiles.Project;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Issue {
    @JsonProperty("summary")
    private String summary;
    @JsonProperty("description")
    private String description;
    @JsonProperty("project")
    private Project project;
    private IssueCategory category;
//    private IssuePriority priority;
//    private IssueStatus status;
    @JsonProperty("files")
    private List<FilesToIssue> files;

}
