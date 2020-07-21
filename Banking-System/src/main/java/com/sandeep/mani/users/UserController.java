package com.sandeep.mani.users;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@RequestMapping("/users")
	public String getAllUsers() {
		return "All Users";
	}
}
