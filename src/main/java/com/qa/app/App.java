package com.qa.app;

import java.io.IOException;

import org.codehaus.jackson.map.ObjectMapper;

import com.qa.extra.Jason;
import com.qa.extra.Service;

public class App {

	public static void main(String[] args) {
		System.out.println("Hello World to standard out");
		Service serviceOjb = new Service();
		
		// mapperObj.setVisibility(PropertyAccessor.FIELD, Visibility.ANY);
		serviceOjb.addAccount("Ro", "M");
		serviceOjb.addAccount("To", "G");
		serviceOjb.addAccount("Ph", "L");
		
		
		
		serviceOjb.retrieveAccountInfo(0); // retrieve hashmap entries one
		serviceOjb.retrieveAccountInfo(1);
		serviceOjb.retrieveAccountInfo(2);
		
		
		Jason jas = new Jason();
		
		
		
	
		
	}

}
