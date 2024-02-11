package com.mykinsbook.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mykinsbook.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	User findByName(String name);
}
