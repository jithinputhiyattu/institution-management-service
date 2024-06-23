package com.school.app.ims.infra.cosmos;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.azure.spring.data.cosmos.core.mapping.Container;
import com.azure.spring.data.cosmos.core.mapping.PartitionKey;
import org.springframework.data.annotation.Id;

@Getter
@Setter
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
@Container(containerName = "InstitutionGroup")
public class InstitutionGroupDto {

    @Id
    String groupId;

    @PartitionKey
    String groupKey;


    AddressDto address;
}
