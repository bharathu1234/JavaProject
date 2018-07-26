package com.deloitte.cui;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

public class MailList {
	
	public static void main(String[] args) {
		HashSet<Address> m1 = new HashSet<Address>();
		
		Address adr1 = new Address("J.W. West", "11 Oak Ave", "Urbana", "IL", "61801");
		Address adr2 = new Address("J.W. West", "11 Oak Ave", "Urbana", "IL", "61801");
		Address adr3 = new Address("Tom Carlton", "867 Elm St", "Champaign", "IL", "61820");
		
		m1.add(adr1);
		m1.add(adr2);
		m1.add(adr3);
	
	
	//display the mailing list.
	
	Iterator<Address> itr = m1.iterator();
	
	while(itr.hasNext()) { 
	      Address element = itr.next(); 
	      System.out.print(element.hashCode() + " "); 
	    } 
	


}
}
