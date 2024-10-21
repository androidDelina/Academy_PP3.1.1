package com.dvorzhetskaya.Academy_PP311.service;

import com.dvorzhetskaya.Academy_PP311.model.User;

import java.util.List;

public interface Service {
    public List<User> getAllUsers();
    public User getUserById(int id);
    public void addOrUpdateUser(User user);
    public void deleteUser(int id);
}
