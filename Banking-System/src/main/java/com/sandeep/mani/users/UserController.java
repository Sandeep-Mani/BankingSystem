package com.sandeep.mani.users;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/users")
	public List<User> getAllUsers() {		
		return userService.getAllTopics();
	}
	
	@RequestMapping("/users/{userId}")
	public User getUser(@PathVariable String userId) {
		return userService.getUser(userId);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/users")
	public void addUser(@RequestBody User user) {
		userService.addUser(user);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/users/{userId}")
	public void updateUser(@RequestBody User user, @PathVariable String userId) {
		userService.updateUser(userId, user);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/users/{userId}")
	public void removeUser(@PathVariable String userId) {
		userService.removeUser(userId);
	}
}
