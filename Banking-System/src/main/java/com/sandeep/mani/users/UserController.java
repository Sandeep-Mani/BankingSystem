package com.sandeep.mani.users;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/users")
	public List<User> getAllUsers() {		
		return userService.getAllTopics();
	}
	
	@GetMapping("/users/{userId}")
	public User getUser(@PathVariable String userId) {
		return userService.getUser(userId);
	}
	
	@PostMapping("/users")
	public void addUser(@RequestBody User user) {
		userService.addUser(user);
	}
	
	@PutMapping("/users/{userId}")
	public void updateUser(@RequestBody User user, @PathVariable String userId) {
		userService.updateUser(userId, user);
	}
	
	@DeleteMapping("/users/{userId}")
	public void removeUser(@PathVariable String userId) {
		userService.removeUser(userId);
	}
}
