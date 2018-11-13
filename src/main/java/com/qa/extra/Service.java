package com.qa.extra;

import java.util.*;


import java.util.HashMap;

public class Service {
	
	
        HashMap<Integer, account> map = new HashMap<Integer, account>();
        public static int AccountNumber = 0;
       

		public void addAccount(String firstName, String surname) {
        	map.put(AccountNumber, new account(firstName, surname));
        	AccountNumber++;
        }
        
        public void retrieveAccountInfo(int accountNumber) {
        	for(Integer i: map.keySet()) {
        		if(i == accountNumber) {
        			System.out.printf("The  hello first name is: %s and the surname is: %s \n", map.get(i).getFirstName(), map.get(i).getLastName() );
        		}
        	}
        }
        
       public account getaccount(int AccountNumber) {
    	   return map.get(AccountNumber);
       }
 
        
        
    


}
