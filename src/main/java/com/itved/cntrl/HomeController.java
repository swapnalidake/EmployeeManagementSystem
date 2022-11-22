package com.itved.cntrl;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.itved.entity.Employee;
import com.itved.service.EmpService;


@RestController
public class HomeController {
	
	@Autowired 
	private EmpService service;

	//get id ById
	//http://localhost:8100/employee/id/10
	@GetMapping("/employee/id/{id}")
	public Employee getEmpById(@PathVariable int id) {
		
		Employee e = service.getById(id);
		return e;
	}
	//get name by ByName
	//http://localhost:8100/employee/name/priti
	@GetMapping("/employee/name/{name}")
	public List<Employee> getAllEmployeeByName(@PathVariable String name){
		return service.getAllEmployeeByName(name);
	}
	
	//get name and salary
	@GetMapping("/employee/name/{name}/sal/{sal}")
	public List<Employee> getByNameAndSalary(@PathVariable String name,String email,String mobile,@PathVariable int sal){
		return service.getAllEmployeeByNameAndSalary(name,sal);
	}
	
	//find all record http://localhost:8100/all
	@GetMapping("/all")
	public List<Employee> allEmployee(){
		return service.findAllRecords();
	}
	// Add record  http://localhost:8100/add
	@PostMapping("/add")
	public String addRecord(@Valid @RequestBody Employee e) {
		service.add(e);
		return "Record Added Succesfully..";
		  
	}
	//update record http://localhost:8100/update
	@PutMapping("/update")
	public String updateRecord(@Valid @RequestBody Employee e) {
		service.update(e);
		return "Record Updated Succesfully...";
	}
	//delete particular record by id  http://localhost:8100/delete/11
	@DeleteMapping("/delete/{id}")
	public String deleteRecord(@PathVariable("id") int id) {
		service.deleteRecord(id);
		return "Record deleted Successfully..";
	}
	//delete the all records
	public String deleteAllRecords() {
		service.deleteAllRecords();
		return "All Record Deleted Succesfully..";
	}
}
