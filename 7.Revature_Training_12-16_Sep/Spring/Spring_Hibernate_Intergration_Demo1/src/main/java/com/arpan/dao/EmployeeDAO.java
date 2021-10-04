package com.arpan.dao;

import java.util.List;

import com.arpan.model.Employee;

public interface EmployeeDAO {
	public Employee addEmployee(Employee employee);
	public Employee updateEmployee(Employee employee);
	public Employee getdEmployeeById(int id);
	public void deleteEmployeee(int id);
	public List<Employee> getAllEmployees();
	public List<Employee> getAllEmployeesByName(String name);
	public List<Employee> getAllEmployeesByDesignation(String designation);
	public List<Employee> getAllEmployeesByAge(int age);
	public List<Employee> getAllEmployeesBySalary(double salary);
}
