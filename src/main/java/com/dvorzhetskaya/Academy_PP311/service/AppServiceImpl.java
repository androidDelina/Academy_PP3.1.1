package com.dvorzhetskaya.Academy_PP311.service;

import com.dvorzhetskaya.Academy_PP311.dao.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import com.dvorzhetskaya.Academy_PP311.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppServiceImpl implements AppService {

    private UserRepository userRepository;

    @Autowired
    public AppServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(int id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public void addOrUpdateUser(User user) {
        userRepository.save(user);
    }

    @Override
    public void deleteUser(int id) {
        userRepository.deleteById(id);
    }
}
