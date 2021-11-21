package com.luch.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author luch
 * @date 2021/7/26 22:23
 */

//@Component
public class UserService {
//	@Autowired
	IndexService indexService;

	public UserService() {
		System.out.println("Constructor from UserService");
	}

	public void getService() {
		System.out.println(indexService);
	}
}
