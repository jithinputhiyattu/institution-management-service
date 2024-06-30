package com.school.app.ims.domain;

import com.school.app.ims.enums.RoleStatus;
import com.school.app.ims.enums.UserRoles;
import lombok.Data;

@Data
public class InstitutionRole {

    private String id;
    private String institutionId;
    private String institutionGroupId;
    private String userId;
    private UserRoles role;
    private RoleStatus roleStatus;
}
