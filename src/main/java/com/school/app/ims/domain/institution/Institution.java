package com.school.app.ims.domain.institution;

import com.school.app.ims.domain.Address;
import lombok.Data;

@Data
public class Institution {

    String institutionId;
    String name;
    String moto;
    Address address;
}
