package com.school.app.ims.dto;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.school.app.ims.enums.UseRoles;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProfileRoleDto {

    String id;
    List<UseRoles> roles;
}
