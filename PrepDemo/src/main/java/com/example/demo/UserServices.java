package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class UserServices {
	
	@Autowired
	private UserDao userdao;
	
	@Value("{$test.properties}")
	private String applicationproperties;
	
	ApplicationContext context = new AnnotationConfigApplicationContext(UserBean.class);
	UserBean userBean = context.getBean(UserBean.class);

	public List<UserBean> getUserList() { 
		List<UserBean> list = new ArrayList<UserBean>();
		list.add(new UserBean("Pradnya",101,"Software Engineer"));
		userBean.setName("Kate");
		userBean.setId(103);
		userBean.setRole("Manger");
		list.add(userBean);
		return list;
	}
	
	public boolean getUserTopic(String id){
		List<String> list = new ArrayList<String>();
		list.add("java");
		list.add("Python");
		list.add("C Sharp");
		System.out.println(id);
		if(list.contains(id)) {
			return true;
		}else {
			return false;
		}
	}

	public List addUserList(UserBean userBean) {
		List list = getUserList();
		list.add(userBean);
		System.out.println(applicationproperties);
		return list;
	}
}
