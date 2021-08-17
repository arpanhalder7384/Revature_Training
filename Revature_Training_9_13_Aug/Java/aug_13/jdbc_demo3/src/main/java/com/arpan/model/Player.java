package com.arpan.model;

public class Player {
	private int id,age;
	private String name, city,gender,sportsName;
	long contact;
	private Team team;
	
	public Player()
	{
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getSportsName() {
		return sportsName;
	}

	public void setSportsName(String sportsName) {
		this.sportsName = sportsName;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long l) {
		this.contact = l;
	}

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

	@Override
	public String toString() {
		return "Player [id=" + id + ", age=" + age + ", name=" + name + ", city=" + city + ", gender=" + gender
				+ ", sportsName=" + sportsName + ", contact=" + contact + ", team=" + team + "]";
	}
	
}
