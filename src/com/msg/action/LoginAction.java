package com.msg.action;


import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;

import com.msg.model.User;
import com.msg.service.UserService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

@Scope("prototype")
public class LoginAction extends ActionSupport implements ModelDriven<User>{
	private static final long serialVersionUID = 2961990887526101053L;

	private User user = new User();
	
	private UserService userService;
	
	public UserService getUserService() {
		return userService;
	}
	@Resource(name="userService")
	public void setUserService(UserService userService) {
		this.userService = userService;
	}


	public String login() throws Exception {
		return userService.validateUser(user, ActionContext.getContext());
	}

	
	public String logout() throws Exception {
		ActionContext.getContext().getSession().remove("user");
		return ERROR;
	}
	
	@Override
	public User getModel() {
		return user;
	}
}
