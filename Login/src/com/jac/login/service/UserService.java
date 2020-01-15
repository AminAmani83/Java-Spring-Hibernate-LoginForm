package com.jac.login.service;

import com.jac.login.model.User;

public interface UserService {
	boolean authenticateUser(User userToCheck);
	boolean addUser(User userToAdd);
}
