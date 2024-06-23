package com.school.app.ims.infra.cosmos;


import com.azure.spring.data.cosmos.core.mapping.Container;
import com.azure.spring.data.cosmos.core.mapping.PartitionKey;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;

import java.util.List;

@Getter
@Setter
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
@Container(containerName = "ProfileInstitution")
public class ProfileInstitutionGroupDto {

    @Id
    String profileId;

    @PartitionKey
    String profileKey;

    List<ProfileRoleDto> institutionGroups;

}
