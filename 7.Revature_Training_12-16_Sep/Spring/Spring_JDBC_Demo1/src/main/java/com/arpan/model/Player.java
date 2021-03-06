package com.arpan.model;

public class Player {
	private int id;
	private String name;
	private int age;
	private String sportsName;
	private String gender;
	private String city;
	private long contact;
	private int teamId;
	
	
	public String getSportsName() {
		return sportsName;
	}
	public void setSportsName(String sportsName) {
		this.sportsName = sportsName;
	}
	public Player() {
		super();
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	public int getTeamId() {
		return teamId;
	}
	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}
	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", city=" + city
				+ ", contact=" + contact + ", teamId=" + teamId + "]";
	}
	public Player(String name, int age, String sportsName, String gender, String city, long contact, int teamId) {
		super();
		this.name = name;
		this.age = age;
		this.sportsName = sportsName;
		this.gender = gender;
		this.city = city;
		this.contact = contact;
		this.teamId = teamId;
	}
	public Player(int id, String name, int age, String sportsName, String gender, String city, long contact,
			int teamId) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.sportsName = sportsName;
		this.gender = gender;
		this.city = city;
		this.contact = contact;
		this.teamId = teamId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
}
