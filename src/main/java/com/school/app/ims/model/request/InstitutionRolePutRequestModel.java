package com.school.app.ims.model.request;

import com.school.app.ims.enums.RoleStatus;
import lombok.Data;

@Data
public class InstitutionRolePutRequestModel {

    private String id;
    private RoleStatus roleStatus;
}
