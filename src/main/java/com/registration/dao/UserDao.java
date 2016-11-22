package com.registration.dao;

import com.registration.entity.User;

import java.util.List;

public interface UserDao {

    List<User> getAllUsers();

    User getUserById(int userId);

    User getUserByUsername(String username);

    boolean addUser(User user);

    void updateUser(User user);

    void deleteUser(int userId);

    boolean userExists(String username);

}
