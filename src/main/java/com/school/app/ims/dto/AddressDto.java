package com.school.app.ims.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
public class AddressDto {

    String addressLineOne;
    String addressLineTwo;
    String website;
    String email;
    String phoneNumber;
    String mobileNumber;
    String pinNumber;
    String city;
    String province;
    String country;
}
