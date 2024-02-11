package com.mykinsbook.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mykinsbook.entity.User;
import com.mykinsbook.service.UserService;

@RestController
@RequestMapping("/api/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@PostMapping("/adduser")
	public User addUser(@RequestBody User user) {
		return userService.saveUser(user);
	}
	
	@PutMapping("/updateuser")
	public User updateUser(@RequestBody User user) {
		return userService.updateUser(user);
	}
	
	@PostMapping("/addbulkuser")
	public List<User> addBulkUser(@RequestBody List<User> users){
		return userService.addBulkUser(users);
	}
	
	
	@GetMapping("/listusers")
	public List<User> listUsers(){
		return userService.listUsers();
	}
	
	@GetMapping("/finduser/{name}")
	public User findUserByName(@PathVariable String name) {
		return userService.findUserByName(name);
	}
	
	@DeleteMapping("/deleteuser/{id}")
	public String deleteUser(@PathVariable int id) {
		return userService.deleteUser(id);		
	}
}
