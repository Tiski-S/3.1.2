package com.spring_boot.spring_boot_3_1_2.service;



import com.spring_boot.spring_boot_3_1_2.model.User;

import java.util.List;

public interface UserService {
    void addUser(User user);
    List<User> getUsers();
    void update(int id, User updateUser);
    void delete(int id);
    User getUserById(int id);
}
