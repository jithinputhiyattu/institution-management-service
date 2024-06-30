package com.school.app.ims.domain;

import com.school.app.ims.domain.Address;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
public class Institution {

    String institutionId;
    String name;
    String moto;
    Address address;
}
