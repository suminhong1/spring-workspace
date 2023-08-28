package com.kh.di;

public class HelloTestApp2 {
	public static void main(String[] args) {
		HelloFactory helloFactory = HelloFactory.getInstance();
		
		helloFactory.setConfigResource("./src/main/resources/config/hello.properties");
		
		Hello hello = helloFactory.getBean("instance.one");
		
		hello.printMessage();
	}


}
