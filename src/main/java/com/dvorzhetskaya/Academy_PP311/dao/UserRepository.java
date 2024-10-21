package com.dvorzhetskaya.Academy_PP311.dao;

import com.dvorzhetskaya.Academy_PP311.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
