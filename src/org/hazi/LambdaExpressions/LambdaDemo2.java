package org.hazi.LambdaExpressions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaDemo2 {

	public static void main(String[] args) {
		Employee hazi = new Employee("Hazi", 25);
		Employee sandeep = new Employee("Sandeep", 25);
		Employee ravi = new Employee("Ravi", 26);
		Employee nithin = new Employee("Nithin", 24);

		List<Employee> employees = new ArrayList<>();
		employees.add(hazi);
		employees.add(sandeep);
		employees.add(ravi);
		employees.add(nithin);

		/*
		 * Since Comparator Interface is a functional interface, we can replace
		 * it with lambda expressions
		 */

		/*
		 * Collections.sort(employees, new Comparator<Employee>() {
		 * 
		 * @Override public int compare(Employee employee1, Employee employee2)
		 * { return employee1.getName().compareTo(employee2.getName()); }
		 * 
		 * });
		 */

		/*
		 * below is the implementation of lambda expression by replacing
		 * Comprator Interface
		 */

		Collections.sort(employees, (employee1, employee2) -> employee1.getName().compareTo(employee2.getName()));

		for (Employee employee : employees) {
			System.out.println(employee.getName());
		}

		/*
		 * We can even get rid of below commented block of code. we can use
		 * Lambda expressions
		 */
		// String sillyString = doStringStuff(new UpperConcat() {
		// @Override
		// public String upperAndConcat(String s1, String s2) {
		// return s1.toUpperCase() + s2.toUpperCase();
		// }
		// }, employees.get(0).getName(), employees.get(1).getName());
		// System.out.println(sillyString);

		UpperConcat uc = (s1, s2) -> s1.toUpperCase() + s2.toUpperCase();
		String sillyString = doStringStuff(uc, employees.get(0).getName(), employees.get(1).getName());
		System.out.println(sillyString);

	}

	public final static String doStringStuff(UpperConcat uc, String s1, String s2) {
		return uc.upperAndConcat(s1, s2);
	}

}

class Employee {
	private String name;
	private int age;

	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}

interface UpperConcat {
	public String upperAndConcat(String s1, String s2);
}
