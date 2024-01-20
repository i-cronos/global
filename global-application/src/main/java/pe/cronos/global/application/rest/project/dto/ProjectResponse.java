package pe.cronos.global.application.rest.project.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProjectResponse {
    private String name;
    private String version;
    private String current;
    private String profile;
}
