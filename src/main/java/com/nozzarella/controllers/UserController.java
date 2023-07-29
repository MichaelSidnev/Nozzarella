package com.nozzarella.controllers;

import java.util.Collections;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.nozzarella.domain.Role;
import com.nozzarella.domain.User;
import com.nozzarella.repository.UserRepository;

public class RegistrationController {
	
	@Autowired
	private UserRepository userRepository;

	@GetMapping("/registration")
	public String registration() {
		return "registration";
	}
	
	
	@PostMapping("/registration")
	public String addUser(User user, Map <String, Object> model) {
		User userFromDb = userRepository.findByEmail(user.getEmail());
		
		if (userFromDb!=null) {
			model.put("message", "user exists");
			return "registration";
		}
		
		user.setRoles(Collections.singleton(Role.USER));
		userRepository.save(user);
		
		return "redirect:/login";
	}
}
