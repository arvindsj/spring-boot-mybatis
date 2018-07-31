package com.arvind.mybatis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arvind.mybatis.model.Users;
import com.arvind.mybatis.response.UsersResponse;
import com.arvind.mybatis.service.UsersService;

@RestController
@RequestMapping
public class UsersController {

	@Autowired
	UsersService usersService;

	// For simplicity purpose, get mapping is used
	@GetMapping("/v1/users")
	public UsersResponse getAll() throws Exception {
		UsersResponse usersResponseObj = new UsersResponse();
		Users users = new Users();
		users.setName("Youtube");
		users.setSalary(2333L);
		users.setId(2);
		usersService.insert(users);
		return usersResponseObj;
	}
}
