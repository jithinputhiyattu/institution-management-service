package com.school.app.ims.infra.db;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.school.app.ims.common.enums.UseRoles;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProfileRoleDto {

    String id;

    List<UseRoles> roles;
}
