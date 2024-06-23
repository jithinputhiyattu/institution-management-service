package com.school.app.ims.infra.db;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Sharded;

@Getter
@Setter
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
@Document(collection = "Institution")
@Sharded(shardKey = {"institutionKey"})
public class InstitutionDto {

    @Id
    String institutionId;

    String institutionKey;

    AddressDto address;
}
