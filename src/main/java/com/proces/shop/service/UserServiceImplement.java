package com.proces.shop.service;

import com.proces.shop.model.Address;
import com.proces.shop.model.User;
import com.proces.shop.model.enums.DocumentType;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImplement implements UserService{

    @Override
    public User createUser(User user) {return null;
    }

    @Override
    public User updateUser(User userUpdate, long id) {
        return null;
    }

    @Override
    public User getUserById(long id) {
        return User.builder()
                .fullName("pepito perez")
                .document("123")
                .documentType(DocumentType.CC)
                .address(List.of(
                                 Address.builder()
                                .avenue("1212")
                                .neighborhood("12131")
                                         .build()
                        )
                )
                .build();

    }

    @Override
    public List<User> findALLUsers() {
        return null;
    }
}
