package com.example.userService.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.user.ui.model.userRequestModel;

@RestController
@RequestMapping("/users")
public class userController {
	@Autowired
	private Environment env;

	@GetMapping("status/check")
	public String staus() {
		return "running on the port" +env.getProperty("local.server.port");
	}
	@PostMapping
	public String createuser(@Valid @RequestBody userRequestModel userdetails) {
		return "user created";
	}
}