package com.swagger.springboot.swaggerdemo.resource;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.swagger.springboot.swaggerdemo.model.User;

@RestController
@RequestMapping("/rest/user")
public class UserResource {

	@GetMapping
	public List<User> getUsers() {
		return Arrays.asList(
				new User("Major-Chimp", 42),
				new User("Minor-Chimp", 2)
		);
	}
	
	@GetMapping("/{username}")
	public User getUser(@PathVariable("username") final String name) {
		return new User(name, 13);
	}
}
