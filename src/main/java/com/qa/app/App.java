package com.qa.app;

import com.qa.extra.Service;

public class App {

	public static void main(String[] args) {
		System.out.println("Hello World to standard out");
		Service serviceOjb = new Service();
		serviceOjb.addAccount("", "");
		serviceOjb.addAccount("", "");
		serviceOjb.addAccount("", "");
		
		
		serviceOjb.retrieveAccountInfo(0);
	}

}
