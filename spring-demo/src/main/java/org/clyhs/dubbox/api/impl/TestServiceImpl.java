package org.clyhs.dubbox.api.impl;

import org.clyhs.dubbox.api.TestService;

public class TestServiceImpl implements TestService {

	@Override
	public void sayHello(String str) {
		// TODO Auto-generated method stub
		System.out.println("hello :"+str);
	}

}
