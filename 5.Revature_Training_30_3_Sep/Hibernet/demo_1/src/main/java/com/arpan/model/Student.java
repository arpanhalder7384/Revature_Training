package com.arpan.model;

import javax.persistence.*;

@Entity
@Table
public class Student {

	@Id //used for making a column as primary key
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(length = 50, name = "Student_name")
	private String name;
	private int age;
	private String email;
	private String city;
	
	public Student() {
		
	}
	public Student( String name, int age, String email, String city) {
		super();
		this.name = name;
		this.age = age;
		this.email = email;
		this.city = city;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", email=" + email + ", city=" + city + "]";
	}

	
}
