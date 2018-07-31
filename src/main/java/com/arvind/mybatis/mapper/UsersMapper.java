package com.arvind.mybatis.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.SelectKey;

import com.arvind.mybatis.model.Users;

@Mapper
public interface UsersMapper {
    @Insert("insert into emp(id, name,salary) values (#{id}, #{name},#{salary})")
    @SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id",
            before = false, resultType = Integer.class)
    void insert(Users users) throws Exception;
}
