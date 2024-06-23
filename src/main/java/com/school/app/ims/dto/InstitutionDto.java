package com.school.app.ims.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Sharded;

@Data
@EqualsAndHashCode(callSuper = true)
@JsonIgnoreProperties(ignoreUnknown = true)
@Document(collection = "Institution")
@Sharded(shardKey = {"institutionKey"})
public class InstitutionDto extends Audit {

    @Id
    String institutionId;
    String institutionKey;
    AddressDto address;
}
