package com.yzy.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.yzy.model.User;
import com.yzy.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userServiceImpl;
	
	@RequestMapping("/")
	public String index(){
		return "index";
	}
	
	@RequestMapping("/getuser")
	public ModelAndView getUser(String username){
		ModelAndView modelAndView = new ModelAndView("index");
		User user = userServiceImpl.getUserByUsername(username);
		return modelAndView.addObject("user", user);
	}
	


	public UserService getUserServiceImpl() {
		return userServiceImpl;
	}


	public void setUserServiceImpl(UserService userServiceImpl) {
		this.userServiceImpl = userServiceImpl;
	}
	
	
}
