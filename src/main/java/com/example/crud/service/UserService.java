package com.example.crud.service;

import com.example.crud.model.User;

import java.util.List;

public interface UserService {
    User getUserById(Long id);

    List<User> getAllUsers();

    void saveUser(User user);


    void deleteUser(Long id);
}

