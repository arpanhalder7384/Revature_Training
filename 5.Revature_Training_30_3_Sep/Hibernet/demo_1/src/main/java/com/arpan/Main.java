package com.arpan;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.arpan.model.Student;



public class Main {

	public static void main(String[] args) {
		
		Configuration configuration=new Configuration().configure();
		StandardServiceRegistryBuilder builder=new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
		SessionFactory factory=configuration.buildSessionFactory(builder.build());
		
		Session session =factory.openSession();
		Transaction transaction=session.beginTransaction();
//		Student s1=new Student("Arpan", 21, "arpahalder7384@gmail.com", "Karanjali");
//		session.save(s1);
		
//		Student s=(Student) session.get(Student.class, 1);
//		System.out.println(s);
//		Student s2=new Student("Ram", 21, "ram12345@gmail.com", "Kulpi ");
//		session.save(s2);
////		System.out.println(s1);
		
		
//		Student s3=new Student("Ram", 21, "ram12345@gmail.com", "Kulpi ");
//		session.save(s3);
//		s3.setEmail("ramkanta785@gamil.com");
//		session.update(s3);
		
//		Student s4=(Student) session.get(Student.class,7);
//		System.out.println(s4);
//		s4.setAge(43);
//		session.update(s4);
		
//		Query query=session.createQuery("from com.arpan.model.Student");
//		List<Student> studentList=query.list();
//		for(Student student:studentList) {
//			System.out.println(student);
//		}
		
//		Criteria criteria=session.createCriteria(Student.class);
//		criteria.add(Restrictions.between("age", 20, 25));
//		List<Student> studentList=criteria.list();
//		for(Student student:studentList) {
//			System.out.println(student);
//		}
		
		
		Query query=session.createQuery("from com.arpan.model.Student where city=:city");
		query.setString("city", "Karanjali");
		List<Student> studentList=query.list();
		for(Student student:studentList) {
			System.out.println(student);
		}
		
		transaction.commit();
		session.close();
		factory.close();
	}

}
