package com.school.app.ims.infra.db;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Sharded;

@Getter
@Setter
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
@Document(collection = "InstitutionGroup")
@Sharded(shardKey = {"groupKey"})
public class InstitutionGroupDto {

    @Id
    String groupId;

    String groupKey;

    AddressDto address;
}
