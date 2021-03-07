package com.example.repo;

import java.util.HashMap;
import java.util.Map;

import com.example.model.Employee;

public class EmployeeRepository implements ObjectRepository<Employee>{
	private Map<Integer,Employee> repository;
	public EmployeeRepository() {
		this.repository=new HashMap<Integer, Employee>();
	}
	
	@Override
	public void store(Employee t) {
		repository.put(t.getId(), t);
	}

	@Override
	public Employee retrieve(int id) {
		return repository.get(id);
	}

	@Override
	public Employee search(String name) {
		for(Employee e:repository.values()) {
			if(e.getName().equalsIgnoreCase(name))
				return e;
		}
		return null;
	}

	@Override
	public Employee delete(int id) {
		Employee e=repository.get(id);
		this.repository.remove(id);
		return e;
	}

}
