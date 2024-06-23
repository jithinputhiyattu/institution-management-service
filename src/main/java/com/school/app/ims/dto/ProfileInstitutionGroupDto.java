package com.school.app.ims.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Sharded;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
@JsonIgnoreProperties(ignoreUnknown = true)
@Document(collection = "ProfileInstitutionGroup")
@Sharded(shardKey = {"profileKey"})
public class ProfileInstitutionGroupDto extends Audit {

    @Id
    String profileId;
    String profileKey;
    List<ProfileRoleDto> institutionGroups;

}
