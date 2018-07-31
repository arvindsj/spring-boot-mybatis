package com.arvind.mybatis.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.arvind.mybatis.model.ErrorMessage;
import com.arvind.mybatis.model.Users;

@JsonInclude(Include.NON_NULL)
public class UsersResponse extends ServiceResponse {

	private Users users;
	private List<Users> usersList;
	private ErrorMessage errorMessage;

	public ErrorMessage getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(ErrorMessage errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public List<Users> getUsersList() {
		return usersList;
	}

	public void setUsersList(List<Users> usersList) {
		this.usersList = usersList;
	}

}
