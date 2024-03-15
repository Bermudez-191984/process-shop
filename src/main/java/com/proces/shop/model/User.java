package com.proces.shop.model;
import com.proces.shop.model.enums.DocumentType;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Data
@Builder
public class User {
    private String fullName;
    private String document;

    private DocumentType documentType;
    private Date birthday;

    private String phoneNumber;
    private String email;
    private String password;
    private List<Address> address;

}
