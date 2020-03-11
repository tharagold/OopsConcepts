package org.company;

import org.client.Client;

public class Company extends Client{
 public void companyName() {
	// TODO Auto-generated method stub
System.out.println("Company name:xxx");
}
 public static void main(String[] args) {
	Company com=new Company();
	com.clientName();
	com.companyName();
	
}
}
