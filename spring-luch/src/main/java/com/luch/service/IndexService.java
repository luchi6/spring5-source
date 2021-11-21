package com.luch.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author luch
 * @date 2021/7/26 22:22
 */

@Component
public class IndexService {
//	@Autowired
//	private UserService userService;

	public IndexService() {
		System.out.println("Constructor from IndexService");
	}

//	public void getService() {
//		System.out.println(userService);
//	}
}
