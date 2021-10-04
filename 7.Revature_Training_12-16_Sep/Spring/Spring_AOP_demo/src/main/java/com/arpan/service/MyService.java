package com.arpan.service;

public class MyService {
	public void validUserName(String username)
	{
		System.out.println("validUserName() method");
	}
	public void validUserPassword(String password)
	{
		System.out.println("validUserPassword() methiod");
	}
	public void validate1()
	{
		System.out.println("validate1() method");
	}
	public void validate2()
	{
		System.out.println("validate2() method");
		try {
		int x=7/0;
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
	public void transact()
	{
		System.out.println("transact() method from my service");
	}
	
	public String hello(String name) {
		return "Hello "+name;
	}
	
	public void testException(int val) throws Exception{
		if(val<18) {
			throw new ArithmeticException("Value should be greater than 18");
		}
		System.out.println("testException() was executed successfully");
	}
	
}
