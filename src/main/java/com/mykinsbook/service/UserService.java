package com.mykinsbook.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mykinsbook.dao.UserDAO;
import com.mykinsbook.entity.User;

@Service
public class UserService {

	@Autowired
	private UserDAO userDAO;
	
	public User saveUser(User user) {
		return userDAO.saveUser(user);
	}
	
	public User updateUser (User user) {
		return userDAO.updateUser(user);
	}
	
	public List<User> addBulkUser(List<User> users){
		return userDAO.addBulkUser(users);
	}
	
	public List<User> listUsers(){
		return userDAO.listUsers();
	}
	public String deleteUser(int id) {
		return userDAO.deleteUser(id);		
	}
	
	public User findUserByName(String name) {
		return userDAO.findUserByName(name);
	}
}
