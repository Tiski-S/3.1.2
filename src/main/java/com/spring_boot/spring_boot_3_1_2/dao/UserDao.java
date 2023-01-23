package com.spring_boot.spring_boot_3_1_2.dao;


import com.spring_boot.spring_boot_3_1_2.model.User;

import java.util.List;

public interface UserDao {
    void addUser(User user);
    List<User> getUsers();
    void update(int id, User user);
    void delete(int id);
    User getUserById(int id);
}
