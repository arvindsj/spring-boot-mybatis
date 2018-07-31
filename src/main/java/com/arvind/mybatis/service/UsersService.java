package com.arvind.mybatis.service;

import org.springframework.stereotype.Service;

import com.arvind.mybatis.model.Users;

@Service
public interface UsersService {
	public void insert(Users user) throws Exception;
}
