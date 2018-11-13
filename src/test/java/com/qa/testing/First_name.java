package com.qa.testing;

import org.junit.Test;

import com.qa.extra.Service;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

public class First_name {
	
	@Test
	public void testMap() {
		Service serviceOjb=new Service();
		int account_no=serviceOjb.getPerson();
		assertEquals(0,account_no);
	}
	

}
