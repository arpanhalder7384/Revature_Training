package com.arpan.main;

import java.util.*;
import org.apache.log4j.Logger;

import com.arpan.model.Admin;
import com.arpan.model.Customer;
import com.arpan.service.loginValidation.LoginValidation;
import com.arpan.service.loginValidation.impl.LoginValidationImpl;

public class Main_Shopping {
	private static Logger log = Logger.getLogger(Main_Shopping.class);
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		log.info("\t\t--------------------------------------");
		log.info("\t\tWelcome to Arpan's Online Shopping App");
		log.info("\t\t--------------------------------------");

		int ch = 0;
		do {
			log.info("*******************************");
			log.info("1)Login as Admin");
			log.info("2)Login as Customer");
			log.info("3)Create an account");
			log.info("4)EXIT");
			log.info("*******************************");
			log.info("Please enter your choice(1-4):");

			try {
				ch = Integer.parseInt(sc.nextLine());
			} 
			catch (NumberFormatException e) {
			}

			switch (ch) {
			case 1:
				LoginValidation loginval=new LoginValidationImpl();
				log.info("Enter Username:");
				String uname=sc.nextLine();
				log.info("Enter Password:");
				String pass=sc.nextLine();
				Admin admin=loginval.adminLoginValidation(uname,pass);
				if(admin!=null)
				{
					int option=0;
					do {
						log.info("!!!Welcome!!!");
						log.info("1)Add new Product");
						log.info("2)Check new Orders and change status");
						log.info("3)Change existing product details");
						log.info("4)Update contact No.");
						log.info("5)Change Password");
						log.info("6)Logout");
						log.info("Please enter your choice(1-6)");

						try {
							option = Integer.parseInt(scanner.nextLine());
						} 
						catch (NumberFormatException e) {
						}
						switch(option) {
						case 1:
							break;
						}
					}
					while(option!=4);
				}
				else {
					log.info("Invalid Username/Password");
				}
				break;
			case 2:
				log.info("Constructing");
				break;
			case 3:
				log.info("Constructing");
				break;
			case 4:
				log.info("Thank You!! Visit Again!!");
				break;
			default:
				log.info("Enter a valid number between 1 to 4. Please try again:\n");
				break;
			}
		}
		while(ch!=4);
	}
}
