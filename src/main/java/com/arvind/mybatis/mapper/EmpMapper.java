package com.arvind.mybatis.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import com.arvind.mybatis.model.Users;

@Mapper
public interface EmpMapper {

	@Insert("insert into EMP(id, name,salary) values (#{id},#{name},#{salary})")
//	@SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id",
//			before = false, resultType = Integer.class)
	void insert(Users users);

}
