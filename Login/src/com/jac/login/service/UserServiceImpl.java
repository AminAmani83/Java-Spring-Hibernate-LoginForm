package com.jac.login.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jac.login.dao.UserDao;
import com.jac.login.model.User;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	// Variables
	@Autowired
	private UserDao userDao;
	
	@Override
	public boolean authenticateUser(User userToCheck) {
		return userDao.authenticateUser(userToCheck);
	}

	@Override
	public boolean addUser(User userToAdd) {
		return userDao.addUser(userToAdd);
	}

}
