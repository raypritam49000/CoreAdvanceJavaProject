package com.stream.api.demo;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApiDemo {

	private static List<Employee> employees = null;

	static {
		Employee employee1 = new Employee(1, "Pritam Ray", "Ropar", 20000.00);
		Employee employee2 = new Employee(2, "Amit Kumar", "Rail", 34999.00);
		Employee employee3 = new Employee(3, "Raj Kumar", "Prem Nagar", 56000.00);
		Employee employee4 = new Employee(4, "Ajit Kumar", "Asron", 55000.00);
		Employee employee5 = new Employee(5, "Omi Verma", "Ropar", 20000.00);
		Employee employee6 = new Employee(6, "Ajay Kumar", "Rail", 34999.00);
		Employee employee7 = new Employee(7, "Raju Verma", "Mohali", 16000.00);
		Employee employee8 = new Employee(8, "Chandan Kumar", "Rupnagar", 55000.00);

		employees = List.of(employee1, employee2, employee3, employee4, employee5, employee6, employee7, employee8);
	}

	public static void main(String[] args) throws NoSuchFieldException {

		System.out.println(employees);
		// System.out.println(employees.stream());

		// For Each Loop
		employees.stream().forEach(employee -> System.out.println(employee));

		// Map
		// Collect
		List<Employee> employeesList = employees.stream().map(employee -> new Employee(employee.getId(),
				employee.getName(), employee.getCity(), employee.getSalary())).collect(Collectors.toList());
		System.out.println(employeesList);

		// Map
		// Collect
		Set<Employee> employeesSet = employees.stream().map(employee -> new Employee(employee.getId(),
				employee.getName(), employee.getCity(), employee.getSalary())).collect(Collectors.toSet());
		System.out.println(employeesSet);

		// Filter
		// Collect
		List<Employee> employeesFilter = employees.stream().filter(employee -> employee.getSalary() < 50000)
				.map(employee -> employee).collect(Collectors.toList());

		System.out.println(employeesFilter);

		// Filter
		// Collect
		System.out.println("**************** Filter ***************");
		employees.stream().filter(employee -> employee.getSalary() > 50000).forEach(System.out::println);

		// FindFirst
		// Collect
		Employee employeesFindFirst = employees.stream().filter(employee -> employee.getSalary() > 50000)
				.map(employee -> employee).findFirst().orElse(null);
		System.out.println(employeesFindFirst);

		// FlatMap
		String[][] array = new String[][] { { "a", "b" }, { "c", "d" }, { "e", "f" } };

		List<String> collect = Stream.of(array) // Stream<String[]>
				.flatMap(Stream::of) // Stream<String>
				// .filter(x -> !"a".equals(x)) // filter out the a
				.collect(Collectors.toList()); // return a List

		collect.forEach(System.out::println);

		// Short Circuit Operator
		List<Employee> shortCircuit = employees.stream().skip(2).limit(1).collect(Collectors.toList());
		System.out.println(shortCircuit);

		// Finit Data
		Stream.generate(Math::random).limit(6).forEach(value -> System.out.println(value));

		// Sorted List
		List<Employee> sortedList = employees.stream()
				.sorted((o1, o2) -> o1.getName().compareToIgnoreCase(o2.getName())).collect(Collectors.toList());
		System.out.println(sortedList);

		// Max and Min
		Employee maxSalary = employees.stream().max(Comparator.comparing(Employee::getSalary))
				.orElseThrow(NoSuchFieldException::new);

		System.out.println(maxSalary);

		Employee minSalary = employees.stream().min(Comparator.comparing(Employee::getSalary))
				.orElseThrow(NoSuchFieldException::new);

		System.out.println(minSalary);

		// Reduce
		Double totalSalary = employees.stream().map(emp -> emp.getSalary()).reduce(Double::sum).get();
		System.out.println(totalSalary);
	}

}
