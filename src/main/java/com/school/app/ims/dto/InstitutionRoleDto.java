package com.school.app.ims.dto;

import com.school.app.ims.enums.RoleStatus;
import com.school.app.ims.enums.UserRoles;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Sharded;

@Data
@EqualsAndHashCode(callSuper = true)
@Document(collection = "InstitutionRole")
@Sharded(shardKey = {"institutionGroupId"})
public class InstitutionRoleDto extends Audit {

    @Id
    private String id;
    private String institutionId;
    private String institutionGroupId;
    private String userId;
    private UserRoles role;
    private RoleStatus roleStatus;
}
