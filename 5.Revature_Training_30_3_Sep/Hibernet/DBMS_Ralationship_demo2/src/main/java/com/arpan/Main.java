package com.arpan;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.arpan.model.Customer;
import com.arpan.model.Orders;

public class Main {

	public static void main(String[] args) {
		Configuration configuration=new Configuration().configure();
		StandardServiceRegistryBuilder builder=new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
		SessionFactory factory=configuration.buildSessionFactory(builder.build());
		
		Session session =factory.openSession();
		Transaction transaction=session.beginTransaction();	
//		Query query=session.createQuery("");
//		query.setString("");
		
		Customer c1=new Customer(100,"Arpan Halder");
		Orders o1=new Orders("OOO1",1478.45);
		o1.setCustomer(c1);
		
		Customer c2=new Customer(101,"Ram Halder");
		Orders o2=new Orders("OOO2",1877.43);
		o2.setCustomer(c2);
		
		Orders o3=new Orders("OOO3",2489.81);
		o3.setCustomer(c1);
		
		Orders o4=new Orders("OOO4",2001.81);
		o4.setCustomer(c1);
		
		Orders o5=new Orders("OOO5",877.50);
		o5.setCustomer(c2);
		
		transaction.commit();
		session.close();
		factory.close();

	}

}
