package com.jac.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jac.login.model.User;
import com.jac.login.service.UserService;


@Controller
public class MainController {

	@Autowired
	private UserService service;
	
	
	// http://localhost:8080/Login/
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView displayLoginPage() {
		ModelAndView mv = new ModelAndView("login");
		mv.addObject("user", new User()); // For the form
		return mv;
	}
	
	// http://localhost:8080/Login/auth
	@RequestMapping(value = "/auth", method = RequestMethod.POST)
	public ModelAndView authenticate( @ModelAttribute("myUser") User userToCheck ) {
		
		// authenticate the email and password
		boolean result = service.authenticateUser(userToCheck);
		
		if (result) {
			ModelAndView mv = new ModelAndView("home");
			mv.addObject("message", "Login was Successful");
			return mv;
		} else {
			ModelAndView mv = new ModelAndView("register");
			mv.addObject("newUser", new User()); // For the form
			mv.addObject("message", "Login Failed, Please Register");
			return mv;
		}
		
	}
	
	
	// http://localhost:8080/Login/adduser
	@RequestMapping(value = "/adduser", method = RequestMethod.POST)
	public ModelAndView addUser( @ModelAttribute("newUser") User userToAdd ) {
		
		// Add the new user to the DB
		boolean result = service.addUser(userToAdd);
		
		if (result) {
			ModelAndView mv = new ModelAndView("home");
			mv.addObject("message", "Registration was Successful");
			return mv;
		} else {
			ModelAndView mv = new ModelAndView("register");
			mv.addObject( "newUser", new User() ); // For the form
			mv.addObject("message", "Registration Failed, Try Again");
			return mv;
		}
		
	}
	
}
