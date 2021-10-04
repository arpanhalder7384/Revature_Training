package com.app.model;

public class Hello {
	private String message;

	public Hello() {
		System.out.println("Default Constructor");
	}

	public Hello(String message) {
		this.message = message;
		System.out.println("1 - Param Constructor value:"+message);
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
		System.out.println("Setter with setMessage was calles with value:"+message);
	}
	
	
}
