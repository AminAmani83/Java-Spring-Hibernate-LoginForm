package com.jac.login.dao;

import com.jac.login.model.User;

public interface UserDao {
	boolean authenticateUser(User userToCheck);
	boolean addUser(User userToAdd);
}
