package com.arpan.main;

import java.util.*;
import org.apache.log4j.Logger;

import com.arpan.exception.BusinessException;
import com.arpan.model.Admin;
import com.arpan.model.Customer;
import com.arpan.service.loginValidation.LoginValidationService;
import com.arpan.service.loginValidation.impl.LoginValidationServiceImpl;

public class Main_Shopping {
	private static Logger log = Logger.getLogger(Main_Shopping.class);
	public static void main(String[] args)  {
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
			LoginValidationService loginval=new LoginValidationServiceImpl();
			switch (ch) {
			case 1:
				log.info("Enter Username:");
				String uname=sc.nextLine();
				log.info("Enter Password:");
				String pass=sc.nextLine();
				Admin admin=null;
				try {
					admin = loginval.adminLoginValidation(uname,pass);
				} catch (BusinessException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				if(admin!=null)
				{
					log.info("\n!!Welcome!! "+admin.getName()+" !! You are an Admin\n");
					int option=0;
					do {
						log.info("*********************************************");
						log.info("---------------------------------------------");
						log.info("-\t1)Add new Product");
						log.info("-\t2)Check new Orders and change status");
						log.info("-\t3)Change existing product details");
						log.info("-\t4)Update contact No.");
						log.info("-\t5)Change Password");
						log.info("-\t6)Logout");
						log.info("-\tPlease enter your choice(1-6)");
						log.info("---------------------------------------------");
						log.info("*********************************************");
						try {
							option = Integer.parseInt(sc.nextLine());
						} 
						catch (NumberFormatException e) {
						}
						switch(option) {
						case 1:
							log.info("Under Construstion");
							break;
						case 2:
							log.info("Under Construstion");
							break;
						case 3:
							log.info("Under Construstion");
							break;
						case 4:
							log.info("Under Construstion");
							break;
						case 5:
							log.info("Under Construstion");
							break;
						case 6:
							log.info("\nWelcome!! Back to Main Page\n");
							break;
						default:
							log.info("Enter a valid number between 1 to 6. Please try again:\\n");
							break;
						}
					}
					while(option!=6);
				}
				break;
			case 2:
				log.info("Enter Username:");
				String cus_uname=sc.nextLine();
				log.info("Enter Password:");
				String cus_pass=sc.nextLine();
				Customer customer=null;
				try {
					customer = loginval.customerLoginValidation(cus_uname, cus_pass);
				} catch (BusinessException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				if(customer!=null)
				{
					log.info("\n!!Welcome!! "+customer.getName()+" to our online shopping app\n");
					int option=0;
					do {
						log.info("**********************************************");
						log.info("----------------------------------------------");
						log.info("-\t1)Buy new product(Search)");
						log.info("-\t2)Check your order status");
						log.info("-\t3)Go to Cart");
						log.info("-\t4)Change received order status");
						log.info("-\t5)Preavious order details");
						log.info("-\t6)Update contact No.");
						log.info("-\t7)Change Password");
						log.info("-\t8)Logout");
						log.info("-\tPlease enter your choice between(1-6)");
						log.info("----------------------------------------------");
						log.info("**********************************************");
						try {
							option = Integer.parseInt(sc.nextLine());
						} 
						catch (NumberFormatException e) {
						}
						switch(option) {
						case 1:
							log.info("Under Construstion");
							break;
						case 2:
							log.info("Under Construstion");
							break;
						case 3:
							log.info("Under Construstion");
							break;
						case 4:
							log.info("Under Construstion");
							break;
						case 5:
							log.info("Under Construstion");
							break;
						case 6:
							log.info("Under Construstion");
							break;
						case 7:
							log.info("Under Construstion");
							break;
						default:
							log.info("Enter a valid number between 1 to 7. Please try again:\\n");
							break;
						}						
					}
					while(option!=7);
				}
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
