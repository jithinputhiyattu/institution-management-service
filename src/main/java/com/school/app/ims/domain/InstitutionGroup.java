package com.school.app.ims.domain;

import lombok.Data;

@Data
public class InstitutionGroup {

    String groupId;
    String name;
    String moto;
    Address address;
}
