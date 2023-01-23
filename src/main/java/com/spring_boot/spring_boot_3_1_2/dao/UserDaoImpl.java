package com.spring_boot.spring_boot_3_1_2.dao;


import com.spring_boot.spring_boot_3_1_2.model.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImpl implements UserDao{
    @PersistenceContext
    EntityManager entityManager;


    @Override
    public void addUser(User user) {
        entityManager.persist(user);
    }

    @Override
    public List<User> getUsers() {
            return entityManager.createQuery("from User", User.class).getResultList();
    }

    @Override
    public void update(int id, User user) {
        User userToUpdate = entityManager.find(User.class, id);;
        userToUpdate.setName(user.getName());
        userToUpdate.setSurName(user.getSurName());
        userToUpdate.setAge(user.getAge());
    }

    @Override
    public void delete(int id) {
        entityManager.remove(entityManager.find(User.class, id));
    }
    @Override
    public User getUserById(int id) {
        return entityManager.find(User.class, id);
    }
}
