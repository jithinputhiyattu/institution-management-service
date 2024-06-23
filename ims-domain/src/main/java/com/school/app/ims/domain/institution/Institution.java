package com.school.app.ims.domain.institution;

import com.school.app.ims.domain.group.Address;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Institution {
    String institutionId;
    String name;
    String moto;
    Address address;
}
