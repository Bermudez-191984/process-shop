package com.proces.shop.service;

import com.proces.shop.model.User;

import java.util.List;

public class UserServiceImplement implements UserService{

    @Override
    public User createUser(User user) {
        return new User();
    }

    @Override
    public User updateUser(User userUpdate, long id) {
        return null;
    }

    @Override
    public User getUserById(long id) {
        return new User();
    }

    @Override
    public List<User> findALLUsers() {
        return null;
    }
}
