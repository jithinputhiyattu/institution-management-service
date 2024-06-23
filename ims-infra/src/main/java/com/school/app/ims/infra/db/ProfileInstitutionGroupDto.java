package com.school.app.ims.infra.db;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Sharded;

import java.util.List;

@Getter
@Setter
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
@Document(collection = "ProfileInstitutionGroup")
@Sharded(shardKey = {"profileKey"})
public class ProfileInstitutionGroupDto {

    @Id
    String profileId;

    String profileKey;

    List<ProfileRoleDto> institutionGroups;

}
