package com.wangjue;

import javax.xml.ws.Endpoint;

public class webServiceApp {
	public static void main(String[] args) {
		System.out.println("web service start");
		HelloWorldImpl implementor = new HelloWorldImpl();
		String address = "http://192.168.7.9:8080/helloWorld";
		Endpoint.publish(address, implementor);
		System.out.println("web service started");
	}
}
