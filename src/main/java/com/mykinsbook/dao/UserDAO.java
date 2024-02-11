package com.mykinsbook.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mykinsbook.entity.User;
import com.mykinsbook.repository.UserRepository;

@Repository
public class UserDAO {

	@Autowired
	private UserRepository userRepository;
	
	public User saveUser(User user) {
		return userRepository.save(user);
	}
	
	public User updateUser(User user) {
		User existingUser = userRepository.findById(user.getId()).orElse(null);
		
		System.out.println("user.getId() " + user.getId());
		
		existingUser.setName(user.getName());
		existingUser.setPassword(user.getPassword());
		existingUser.setCountry(user.getCountry());
		existingUser.setCity(user.getCity());
		return userRepository.save(existingUser);
		
	}
	
	public List<User> addBulkUser(List<User> users){
		return userRepository.saveAll(users);
	}
	
	public List<User> listUsers(){
		return userRepository.findAll();
	}
	
	public User findUserByName(String name) {
		return userRepository.findByName(name);
	}
	
	public String deleteUser(int id) {
		userRepository.deleteById(id);
		return "User deleted successfully. " + id;
	}
}
