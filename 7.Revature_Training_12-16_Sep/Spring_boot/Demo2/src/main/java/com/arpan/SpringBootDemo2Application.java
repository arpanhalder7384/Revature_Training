package com.arpan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan({"com.arpan.model"})
public class SpringBootDemo2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemo2Application.class, args);
	}
}
