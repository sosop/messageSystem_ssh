package com.msg.service;

import java.util.List;

import com.msg.model.User;
import com.opensymphony.xwork2.ActionContext;

public interface UserService {
	public void saveUser(User user);
	public int deleteUser(User user);
	public int updateUser(User user);
	public User getUserById(int id);
	public List<User> getUserList();
	public String validateUser(User user,ActionContext context);
}
