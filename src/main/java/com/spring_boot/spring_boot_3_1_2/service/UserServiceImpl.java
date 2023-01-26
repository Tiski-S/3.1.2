package com.spring_boot.spring_boot_3_1_2.service;

import com.spring_boot.spring_boot_3_1_2.dao.UserDao;
import com.spring_boot.spring_boot_3_1_2.model.User;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;



import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    private final UserDao userDao;
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    @Transactional
    public void addUser(User user) {
        userDao.addUser(user);
    }

    @Override
    public List<User> getUsers() {
        return userDao.getUsers();
    }

    @Override
    @Transactional
    public void update(int id, User updateUser) {
        userDao.update(id, updateUser);
    }

    @Override
    @Transactional
    public void delete(int id) {
        userDao.delete(id);
    }
    @Override
    public User getUserById(int id) {
        return userDao.getUserById(id);
    }
}
