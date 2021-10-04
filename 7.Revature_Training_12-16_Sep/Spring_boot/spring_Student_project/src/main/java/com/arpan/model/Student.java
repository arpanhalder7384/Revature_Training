package com.arpan.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Data
@Entity
@Table
public class Student {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private int age;
	private String Stream;
}
