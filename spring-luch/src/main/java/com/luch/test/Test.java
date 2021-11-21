package com.luch.test;

import com.luch.app.AppConfig;
import com.luch.service.IndexService;
import com.luch.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author luch
 * @date 2021/7/26 22:29
 */


public class Test {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println(ac.getBean(UserService.class));
//		IndexService indexService = ac.getBean(IndexService.class);
//		System.out.println(indexService);
	}
}
