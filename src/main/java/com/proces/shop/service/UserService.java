package com.proces.shop.service;

import com.proces.shop.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {
    User createUser (User user);
    User updateUser(User userUpdate, long id);
    User getUserById(long id);
    List<User> findALLUsers();
}
