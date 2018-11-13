package com.qa.extra;

import java.io.IOException;

import org.codehaus.jackson.map.ObjectMapper;
 

import com.qa.extra.Service;


public class Jason {
	
	public void jason_converter()
	{
	
	 	
	Service serviceOjb = new Service();
	
    serviceOjb.retrieveAccountInfo(0);
	
	ObjectMapper mapperObj = new ObjectMapper();
	

	
	
	try {
        // get Employee object as a json string
        String jsonStr = mapperObj.writeValueAsString(serviceOjb);
        System.out.println(jsonStr);
    } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
	
	
	
	 }
	
}
	
	


