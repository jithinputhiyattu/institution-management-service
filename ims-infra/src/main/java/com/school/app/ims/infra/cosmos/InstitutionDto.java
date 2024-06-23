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
@Container(containerName = "Institution")
public class InstitutionDto {

    @Id
    String institutionId;

    @PartitionKey
    String institutionKey;

    AddressDto address;
}
