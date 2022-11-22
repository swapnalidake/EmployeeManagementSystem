package com.itved.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.itved.dao.EmployeeRepo;
import com.itved.entity.Employee;

@Component //object will create
public class EmpService {

	@Autowired
	private EmployeeRepo repo;
	
	public Employee getById(int id) {
		Employee e= repo.findById(id).get();
		return e;
	}
	
	public List<Employee> findAllRecords(){
		List<Employee> list = repo.findAll();
		return list;
	}
   
	public void add(Employee e) {
		repo.save(e);
		
	}
   
	public void update(Employee e) {
		repo.save(e);
		
	}
    
	public void deleteRecord(int id) {
		repo.deleteById(id);
		
	}
	
	
	public void deleteAllRecords() {
		repo.deleteAll();
		
	}

	public List<Employee> getAllEmployeeByName(String name) {
		List<Employee> list = repo.findByName(name);
		return list;
		
	}
	public List<Employee> getAllEmployeeByNameAndSalary(String name, int sal) {
		return repo.findByNameAndSal(name,sal);
	}
	
}
