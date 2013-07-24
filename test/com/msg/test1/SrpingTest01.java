package com.msg.test1;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.msg.dao.UserDao;
import com.msg.model.Group;
import com.msg.model.User;
import com.msg.utils.MD5Util;
public class SrpingTest01 {
	
	@Test
	public void test1(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//System.out.println(context);
		//User user = context.getBean("user2",User.class);
		//assertEquals(2, 1);
		
		//Message msg = new Message();
		
		//Group g = new Group();
		
		//User u = new User();
		//u.setGroup(g);
		//u.setName("侯小龙");
		UserDao userDao = context.getBean("userDao", UserDao.class);
		User u = new User();
		u.setName("houxl");
		u.setPassword(MD5Util.createPassword("hxl123"));
		userDao.save(u);
		//userDao.save(u);
		//assertNotNull(userDao);
	}
	
}	
