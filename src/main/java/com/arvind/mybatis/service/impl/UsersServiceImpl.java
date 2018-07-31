package com.arvind.mybatis.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.arvind.mybatis.mapper.EmpMapper;
import com.arvind.mybatis.mapper.UsersMapper;
import com.arvind.mybatis.model.Users;
import com.arvind.mybatis.service.UsersService;

@Component
@Transactional(propagation = Propagation.REQUIRED)
public class UsersServiceImpl implements UsersService {
	@Autowired
	private UsersMapper usersMapper;

	@Autowired
	private EmpMapper empMapper;

	@Transactional(rollbackFor = RuntimeException.class)
	public void insert(Users user) throws Exception {
		try {
			System.out.println("----USER INSERT TRANSACTION-----");
			usersMapper.insert(user);
			System.out.println("----EMP INSERT TRANSACTION-----");
			empMapper.insert(user);
		} catch (RuntimeException e) {
			System.out.println("----------Rolling Back Now-------");
			System.out.println("-------RuntimeException-----" + e);
			throw e;
		} catch (Exception e) {
			System.out.println("-------Exception-----" + e);
			throw e;
		}
	}

}
