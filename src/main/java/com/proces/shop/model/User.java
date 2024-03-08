package com.proces.shop.model;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Data

public class User {
    private String fullName;
    private Date birthday;

    private String identificationType;
    private String identification;
    private String phoneNumber;
    private String email;
    private String password;
    private String address;

}
