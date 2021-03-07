package com.example.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Employee;
import com.example.repo.EmployeeRepository;

@RestController
public class EmployeeRestController {
	@Autowired
	private EmployeeRepository repository;
	
	@GetMapping("/rest/employee/get/{id}")
	public Employee getEmployeeByID(@PathVariable("id") int id) {
		return repository.retrieve(id);
	}
	
	@GetMapping("/rest/employee/getAll")
	public List<Employee> getAllEmployees(){
		return repository.getAll();
	}
	
	@PostMapping("/rest/employee/create")
	public Employee createEmployee(@RequestBody Employee employee) {
		repository.store(employee);
		return employee;
	}
	
	@GetMapping("/rest/employee/search/{name}")
	public Employee searchEmployee(@PathVariable("name") String name) {
		return repository.search(name);
	}
	
	@DeleteMapping("/rest/employee/delete/{id}")
	public Employee deleteEmployee(@PathVariable("id") int id) {
		return repository.delete(id);
	}
}
