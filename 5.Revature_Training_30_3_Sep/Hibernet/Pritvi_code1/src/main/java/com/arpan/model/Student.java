package com.arpan.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int roll;
	private String name;
	
	public Student() {
		
	}
	public Student( String name) {
		super();
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + "]";
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
