package com.boluo1230.test;

import com.boluo1230.config.AppConfig;
import com.boluo1230.dao.UserDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Code Farmer
 * @date 2019/12/27 15:46
 */
public class Test {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext applicationContext =
				new AnnotationConfigApplicationContext(AppConfig.class);
//		applicationContext.register(UserDao.class);
//		applicationContext.refresh();

//		UserDao userDao = applicationContext.getBean(UserDao.class);
//		userDao.query();
	}

}
