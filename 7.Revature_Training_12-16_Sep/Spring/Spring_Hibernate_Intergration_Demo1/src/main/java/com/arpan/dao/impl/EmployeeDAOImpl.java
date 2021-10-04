package com.arpan.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.arpan.dao.EmployeeDAO;
import com.arpan.model.Employee;

public class EmployeeDAOImpl implements EmployeeDAO{
	
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public Session getSession()
	{
		Session session=sessionFactory.getCurrentSession();
		if(session==null) {
			session=sessionFactory.openSession();
		}
		return  session;
	}

	@Override
	public Employee addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		Session session=getSession();
		Transaction transaction=session.beginTransaction();
		session.save(employee);
		transaction.commit();
		return employee;
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		Session session=getSession();
		Transaction transaction=session.beginTransaction();
		session.update(employee);
		transaction.commit();
		return employee;
	}

	@Override
	public Employee getdEmployeeById(int id) {
		Session session=getSession();
		Transaction transaction=session.beginTransaction();
		Employee employee=(Employee) session.get(Employee.class, id);
		transaction.commit();
		return employee;
	}

	@Override
	public void deleteEmployeee(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getAllEmployeesByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getAllEmployeesByDesignation(String designation) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getAllEmployeesByAge(int age) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getAllEmployeesBySalary(double salary) {
		// TODO Auto-generated method stub
		return null;
	}

}
