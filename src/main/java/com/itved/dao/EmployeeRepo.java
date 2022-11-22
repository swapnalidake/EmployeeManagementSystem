package com.itved.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.itved.entity.Employee;

public interface EmployeeRepo extends CrudRepository<Employee, Integer>{
	List<Employee> findAll();

	List<Employee> findByName(String name);

	List<Employee> findByNameAndSal(String name, int sal);
    
	List<Employee> findByNameOrSal(String name, int sal);

}
