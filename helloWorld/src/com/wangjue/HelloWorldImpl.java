package com.wangjue;

import javax.jws.WebService;

@WebService(endpointInterface = "com.wangjue.HelloWorld", serviceName = "HelloWorld")
public class HelloWorldImpl implements HelloWorld {
	public String sayHi(String text) {
		return "Hello " + text;
	}
}
