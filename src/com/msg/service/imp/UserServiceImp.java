package com.msg.service.imp;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.msg.dao.UserDao;
import com.msg.model.User;
import com.msg.service.UserService;
import com.msg.utils.MD5Util;
import com.opensymphony.xwork2.ActionContext;

@Service("userService")
public class UserServiceImp implements UserService {
	
	private UserDao userDao;
	
	public UserDao getUserDao() {
		return userDao;
	}
	@Resource(name="userDao")
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public int deleteUser(User user) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public User getUserById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getUserList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveUser(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public int updateUser(User user) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String validateUser(User user,ActionContext context) {
		user.setPassword(MD5Util.createPassword(user.getPassword()));
		List<User> users = userDao.getObjectByExample(user);
		if(users.size() <= 0){
			return "error";
		} else{
			context.getSession().put("user", users.get(0));
			return "success";
		}
	}

}
