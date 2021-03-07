package com.example.model;

public class Employee {
	private int id;
	private String name;
	private String jobtitle;
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", jobtitle=" + jobtitle + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJobtitle() {
		return jobtitle;
	}
	public void setJobtitle(String jobtitle) {
		this.jobtitle = jobtitle;
	}
}
