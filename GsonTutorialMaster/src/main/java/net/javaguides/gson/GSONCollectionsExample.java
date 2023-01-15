package net.javaguides.gson;

import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

public class GSONCollectionsExample {
	public static void main(String[] args) {
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		Collection<Integer> ints = Arrays.asList(1, 2, 3, 4, 5);

		// Serialization of integer
		String json = gson.toJson(ints);
		System.out.println(json);

		// Serialization of collection of employees
		Collection<Employee> employees = Arrays.asList(new Employee("Omi", "Verma"), new Employee("Pritam", "Ray"),
				new Employee("Raj", "Kumar"), new Employee("Amit", "Sahani"), new Employee("Ajit", "Kumar"));

		String empJson = gson.toJson(employees);
		System.out.println(empJson);

		// Deserialization of integer
		Type collectionType = new TypeToken<Collection<Integer>>() {
		}.getType();
		Collection<Integer> ints2 = gson.fromJson(json, collectionType);
		System.out.println(ints2);

		// De-serialization of employee json to Collection of employee Java objects
		String employeeJson = "[\r\n" + "  {\r\n" + "    \"firstName\": \"Pritam\",\r\n"
				+ "    \"lastName\": \"Ray\"\r\n" + "  },\r\n" + "  {\r\n"
				+ "    \"firstName\": \"Chandan\",\r\n" + "    \"lastName\": \"Yadav\"\r\n" + "  },\r\n"
				+ "  {\r\n" + "    \"firstName\": \"Amit\",\r\n" + "    \"lastName\": \"Kumar\"\r\n"
				+ "  },\r\n" + "  {\r\n" + "    \"firstName\": \"Ajay\",\r\n"
				+ "    \"lastName\": \"Kumar\"\r\n" + "  },\r\n" + "  {\r\n"
				+ "    \"firstName\": \"Ram\",\r\n" + "    \"lastName\": \"Sahani\"\r\n" + "  }\r\n" + "]";
		Type type = new TypeToken<Collection<Employee>>() {
		}.getType();
		Collection<Employee> collectionOfEmp = gson.fromJson(employeeJson, type);
		System.out.println(collectionOfEmp);
	}
}

class Employee {
	private String firstName;
	private String lastName;

	public Employee(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + "]";
	}

}
