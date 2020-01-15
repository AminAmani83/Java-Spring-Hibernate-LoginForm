package com.jac.login.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jac.login.model.User;

@Repository
public class UserDaoImpl implements UserDao {

	// Variables
	@Autowired
	private SessionFactory sessionFactory;
	
	// Constructor
	public UserDaoImpl() {
		super();
	}

	// Methods
	protected Session getSession(){
		return sessionFactory.getCurrentSession();
	}
	
	@Override
	public boolean authenticateUser(User userToCheck) {
		String hql = "FROM User AS u WHERE u.email = :email AND u.password = :password";
		Query<User> query = getSession().createQuery(hql, User.class);
		query.setParameter("email", userToCheck.getEmail());
		query.setParameter("password", userToCheck.getPassword());
		return (query.list().size() > 0);
//		return true;
	}

	@Override
	public boolean addUser(User userToAdd) {
		getSession().save(userToAdd);
		return true;
	}

}
