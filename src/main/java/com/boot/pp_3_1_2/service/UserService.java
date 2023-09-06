package com.boot.pp_3_1_2.service;

import com.boot.pp_3_1_2.model.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    User getUser(Long id);

    void addUser(User user);

    void removeUser(Long id);

    void editUser(User user);
}
