package com.school.app.ims.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
@Getter
@Setter
@ToString
public class InstitutionGroup {

    String groupId;
    String name;
    String moto;
    Address address;
}
