package com.model;

public class Employee {
	private int id;
	private String name;
	private String city;
	private String salary;

	public Employee() {
		super();
	}

	public Employee(String name, String city, String salary) {
		super();
		this.name = name;
		this.city = city;
		this.salary = salary;
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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", city=" + city + ", salary=" + salary + "]";
	}

}
