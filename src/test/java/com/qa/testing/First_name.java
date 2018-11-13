package com.qa.testing;

import org.junit.Before;
import org.junit.Test;

import com.qa.extra.Service;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class First_name {
	
	Service serviceOjb;
	String firstName="";
	int countName=0;
	
	@Before
	public void setUp() {
		serviceOjb= new Service();
	}
	
	@Test
	public void testMap() {
		serviceOjb.addAccount("Rohan", "Maini");
		serviceOjb.addAccount("Rohan", "Maini");
		serviceOjb.addAccount("Rohan", "Maini");
		serviceOjb.addAccount("Vincent", "Yeadon");
		serviceOjb.addAccount("Abbas", "A");
		
		
		firstName= "Rohan";
		countName=3;
		int accountacount=serviceOjb.getAccount(firstName);
		assertEquals(countName,accountacount);
	}

	

	
	

}
