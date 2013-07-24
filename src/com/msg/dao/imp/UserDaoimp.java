package com.msg.dao.imp;

import org.springframework.stereotype.Repository;

import com.msg.dao.UserDao;
import com.msg.model.User;

@Repository("userDao")
public class UserDaoimp extends BaseDaoImp<User> implements UserDao {
	
}
