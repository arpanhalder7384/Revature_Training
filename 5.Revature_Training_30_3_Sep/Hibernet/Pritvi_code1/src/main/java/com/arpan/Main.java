package com.arpan;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.arpan.model.Student;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration configuration=new Configuration().configure();
		StandardServiceRegistryBuilder builder=new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
		SessionFactory factory=configuration.buildSessionFactory(builder.build());
		
		Session session =factory.openSession();
		Transaction transaction=session.beginTransaction();	
		
//		Student s1=new Student("Arpan Halder");
//		session.save(s1);
//		
//		Student s2=new Student("Sayan Halder");
//		session.save(s2);
		
		Query query=session.createQuery("from com.arpan.model.Student");
		List<Student> studentList =query.list();
		for(Student student:studentList) {
			System.out.println(student);
		}
		
		transaction.commit();
		session.close();
		factory.close();

	}

}
