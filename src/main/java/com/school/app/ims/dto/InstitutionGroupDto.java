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
@Document(collection = "InstitutionGroup")
@Sharded(shardKey = {"groupKey"})
public class InstitutionGroupDto extends Audit {

    @Id
    String groupId;
    String groupKey;
    AddressDto address;
}
