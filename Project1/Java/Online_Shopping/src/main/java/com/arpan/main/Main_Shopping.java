package com.arpan.main;

import java.util.*;
import org.apache.log4j.Logger;

import com.arpan.exception.BusinessException;

import com.arpan.model.Admin;
import com.arpan.model.Customer;
import com.arpan.model.Product;
import com.arpan.model.Ordered;

import com.arpan.service.adminService.AdminService;
import com.arpan.service.adminService.impl.AdminServiceImpl;
import com.arpan.service.cartService.CartService;
import com.arpan.service.cartService.impl.CartServiceImpl;
import com.arpan.service.customerService.CustomerService;
import com.arpan.service.customerService.impl.CustomerServiceImpl;
import com.arpan.service.orderService.OrderService;
import com.arpan.service.orderService.impl.OrderServiceImpl;
import com.arpan.service.productService.ProductService;
import com.arpan.service.productService.impl.ProductServiceImpl;

public class Main_Shopping {
	private static Logger log = Logger.getLogger(Main_Shopping.class);
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		log.info("\t\t--------------------------------------");
		log.info("\t\tWelcome to Arpan's Online Shopping App");
		log.info("\t\t--------------------------------------");

		int ch = 0;
		do {
			log.info("***********************************");
			log.info("-----------------------------------");
			log.info("-\t1)Login as Admin");
			log.info("-\t2)Login as Customer");
			log.info("-\t3)Register a new Customer");
			log.info("-\t4)EXIT");
			log.info("-----------------------------------");
			log.info("***********************************");
			log.info("Please enter your choice(1-4):");

			try {
				ch = Integer.parseInt(sc.nextLine());
			} 
			catch (NumberFormatException e) {
			}
			switch (ch) {
			case 1:
				AdminService adminService=new AdminServiceImpl();
				log.info("Enter Username:");
				String uname=sc.nextLine();
				log.info("Enter Password:");
				String pass=sc.nextLine();
				Admin admin=null;
				try {
					admin = adminService.adminLoginValidation(uname,pass);
				} catch (BusinessException e1) {
					log.error(e1);
				}
				if(admin!=null)
				{
					log.info("\n!!Welcome!! "+admin.getName()+" !! You are an Admin\n");
					int option=0;
					do {
						log.info("*********************************************");
						log.info("---------------------------------------------");
						log.info("-\t1)Add New Product");
						log.info("-\t2)Change existing product details");
						log.info("-\t3)Check new Orders and change status");
						log.info("-\t4)Details of all available Product");
						log.info("-\t5)Search Customer By Various Fields");
						log.info("-\t6)Update contact No.");
						log.info("-\t7)Change Password");
						log.info("-\t8)Logout");
						log.info("---------------------------------------------");
						log.info("*********************************************");
						log.info("Please enter your choice(1-8)");
						try {
							option = Integer.parseInt(sc.nextLine());
						} 
						catch (NumberFormatException e) {
							log.error(e);
						}
						switch(option) {
						case 1:
							Product product=new Product();
							log.info("Enter Product Name:");
							product.setProduct_name(sc.nextLine());
							log.info("Enter Product Price:");
							product.setProduct_price(Double.parseDouble(sc.nextLine()));
							log.info("Enter Product Qualtity:");
							product.setProduct_count(Integer.parseInt(sc.nextLine()));
							log.info("Enter Product Type:");
							product.setProduct_type(sc.nextLine());
							ProductService addNewProduct=new ProductServiceImpl();
							try {
								product=addNewProduct.addNewProduct(product);
								if(product==null) {
									log.info("Product Already exist!! Choose option 2 for Update Existing Product");
								}
								else {
									log.info(product+"\n");
									}
							} catch (BusinessException e) {
								log.error(e);
							}
						case 2:
							log.info("Under Construstion");
							break;
						case 3:
							try {
								OrderService orderService=new OrderServiceImpl();
								int n=orderService.noOfNewPlacedOrder();
								if(n!=0)
								{
									List<Ordered> orderedList=null;
									orderedList=orderService.getAllNewPlacedOrder();
									if(orderedList==null)
									{
										log.info("\nNo new order placed\n");
										break;
									}
									log.info("Order_Id        Product_Name              Produt_Quantity Price              Order_Status\n");
									log.info("------------------------------------------------------------------"
											+ "-------------------------");
									for(Ordered ordered:orderedList)
									{
										ordered.getOrderDetails();
									}
									log.info("\n");
									log.info("Enter order id to make the order shipped or enter false to go previous menu:");
									String s=sc.nextLine();
									if(s.equals("false"))
									{
										log.info("\nBack to Previous Menu\n");
										break;
									}
									int orderID=Integer.parseInt(s);
									boolean b=adminService.changeOrderStatusToShipped(orderID);
								}
								else {
									log.info("\nNo new order placed\n");
								}
							}catch(NumberFormatException e)
							{
								log.error(e);
							}
							catch (BusinessException e1) {
								log.error(e1);
							}
							break;
						case 4:
							ProductService productService=new ProductServiceImpl();
							try {
								List<Product> productList=productService.getAllProduct();
								if(productList==null)
								{
									log.info("\nNo Available Product!!!!!PLEASE ADD SOME PRODUCT!!!!!\n");
									break;
								}
								log.info("Available product details:\n");
								log.info("Product Name                   Price           Available       Product Type");
								log.info("----------------------------------------------------------------------------");
								for(Product p:productList)
								{
									p.getProductDetails();
								}
								log.info("\n");
							} catch (BusinessException e) {
								// TODO Auto-generated catch block
								log.error(e);
							}
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
						case 8:
							log.info("\nLogout!! Back to Main Page\n");
							break;
						default:
							log.info("Enter a valid number between 1 to 8. Please try again:\\n");
							break;
						}
					}
					while(option!=8);
				}
				break;
			case 2:
				CustomerService customerService=new CustomerServiceImpl();
				log.info("Enter Username:");
				String username=sc.nextLine();
				log.info("Enter Password:");
				String password=sc.nextLine();
				Customer customer=null;
				try {
					customer = customerService.customerLoginValidation(username, password);
				} catch (BusinessException e1) {
					// TODO Auto-generated catch block
					log.error(e1);
				}
				if(customer!=null)
				{
					log.info("\n!!Welcome!! "+customer.getName()+" to our online shopping app\n");
					int option=0;
					do {
						log.info("**********************************************");
						log.info("----------------------------------------------");
						log.info("-\t1)Add new product to cart(Search)");
						log.info("-\t2)Go to Cart");
						log.info("-\t3)Remove item from Cart");
						log.info("-\t4)Place Order");
						log.info("-\t5)Check your ordered status");
						log.info("-\t6)Make order status to received");
						log.info("-\t7)Update contact No.");
						log.info("-\t8)Change Password");
						log.info("-\t9)Logout");
						log.info("-\tPlease enter your choice between(1-9)");
						log.info("----------------------------------------------");
						log.info("**********************************************");
						try {
							option = Integer.parseInt(sc.nextLine());
						} 
						catch (NumberFormatException e) {
						}
						switch(option) {
						case 1:
							ProductService productService=new ProductServiceImpl();
							try {
								List<Product> productList=productService.getAllProduct();
								if(productList==null)
								{
									log.info("No Product Available");
									break;
								}
								log.info("Available product details:\n");
								log.info("Product_ID Product_Name                   Price           Available       Product Type");
								log.info("----------------------------------------------------------------------------");
								for(Product p:productList)
								{
									p.getProductDetails();
								}
								log.info("\n");
								log.info("Enter Product Id from above table:");
								int productId=Integer.parseInt(sc.nextLine());
								log.info("Enter no of procuct you want to buy:");
								int pQuantity=Integer.parseInt(sc.nextLine());
								CartService cart=new CartServiceImpl();
								Product product=null;
								for(Product p:productList)
								{
									if(p.getProduct_id()==productId) {
									product=p;}
								}
								boolean t=cart.addToCart(product,pQuantity,customer.getCus_id());
								if(t==true)
								{
									log.info("\nProduct is added to Cart\n");
								}
								else {
									log.info("Protuct is not added to cart");
								}
							} catch (BusinessException e) {
								// TODO Auto-generated catch block
								log.error(e);
							}
							
							break;
						case 2:
							CartService cart=new CartServiceImpl();
							try {
								List<Product> productList=cart.getCartDetails(customer);
								if(productList.size()==0)
								{
									log.info("\nNo Item in Your Cart\n");
								}
								else {
									log.info("Available product in your cart:\n");
									log.info("Cart_ID  Product_Name         No. of Item     Price");
									log.info("----------------------------------------------------");
									double total=0.0;
									for(Product p:productList)
									{
										p.getProductDetailsByCart();
										total+=p.getProduct_price();
									}
									log.info("\n\tTotal Price of all items in your car is: "+total+"\n");
								}
							}catch(NumberFormatException e) 
							{
								
							}
							catch (BusinessException e) {
								
								e.printStackTrace();
							}
							break;
						case 3:
							log.info("Under Construstion");
							break;
						case 4:
//							Place Order
							CartService cart2=new CartServiceImpl();
							OrderService orderService =new OrderServiceImpl();
							try {
								List<Product> productList=cart2.getCartDetails(customer);
								if(productList.size()==0)
								{
									log.info("\nNo products are added into cart\n");
								}
								for(Product product:productList) {
									boolean t=orderService.placeOrder(customer.getCus_id(),product);
									if(t==true)
									{
										log.info("\nOrder of "+product.getProduct_name()+ " is Placed\n");
									}
									else {
										log.info("\nUnimplemented Error");
									}
								}
							} catch (BusinessException e) {
								// TODO Auto-generated catch block
								log.error(e);
							}
							
							break;
						case 5:
//							Check your order status
							try {
								OrderService orderService3=new OrderServiceImpl();
								List<Ordered> orderedList=orderService3.getOrderDetails(customer);
								if(orderedList==null)
								{
									log.info("\nYou have not placed any order\n");
									break;
								}
								log.info("Order_ID        Product_Name              Product_Quantit Price              Order_Ststus");
								log.info("------------------------------------------------------------------------------------------");
								for(Ordered ordered:orderedList)
								{
									ordered.getOrderDetails();
								}
								log.info("\n");
							} catch (BusinessException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							break;
						case 6:
							try {
								OrderService orderService4=new OrderServiceImpl();
								int n=orderService4.noOfShippedOrder();
								if(n!=0)
								{
									List<Ordered> orderedList=null;
									log.info("Order_ID        Product_Name              Product_Quantit Price              Order_Ststus");
									log.info("------------------------------------------------------------------------------------------");
									orderedList=orderService4.getAllShippedOrderDetails();
									
									for(Ordered ordered:orderedList)
									{
										ordered.getOrderDetails();
									}
									log.info("\n");
									log.info("Enter order id to make the order as Received or enter false to go previous menu:");
									String s=sc.nextLine();
									if(s.equals("fasle"))
									{
										log.info("\nBack to previous menu\n");
										break;
									}
									int orderId=Integer.parseInt(s);
									boolean b=customerService.changeOrderStatusToReceived(orderId);
								}
								else {
									log.info("\nNo new order Shipped\n");
								}
							}catch(NumberFormatException e)
							{
								log.error(e.getMessage());
							}
							catch (BusinessException e1) {
								log.error(e1.getMessage());
							}
							break;
						case 7:
							log.info("Under Construstion");
							break;
						case 8:
							log.info("Under Construstion");
							break;
						case 9:
							log.info("nLogout!! Back to Main Page\\n");
							break;
						default:
							log.info("Enter a valid number between 1 to 9. Please try again:\\n");
							break;
						}						
					}
					while(option!=9);
				}
				break;
			case 3:
				Customer customernew=new Customer();
				log.info("Enter new Email id:");
				customernew.setEmail_id(sc.nextLine());
				log.info("Enter Full Name:");
				customernew.setName(sc.nextLine());
				log.info("Enter password:");
				customernew.setPassword(sc.nextLine());
				log.info("Enter Contact No.:");
				customernew.setContact(Long.parseLong(sc.nextLine()));
				CustomerService customerService2=new CustomerServiceImpl();
				try {
					customer=customerService2.createNewCustomer(customernew);
					log.info("Below the details of new Customer");
					log.info(customer+"\n");
				} catch (BusinessException e) {
					// TODO Auto-generated catch block
					log.error(e);
				}
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