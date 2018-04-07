package org.hazi.LambdaExpressions;

import java.util.ArrayList;
import java.util.List;

public class LambdaDemo3 {

	public static final String Main = null;

	public static void main(String[] args) {
		Company cgi = new Company("CGI", 50);
		Company ibm = new Company("IBM", 25);
		Company hp = new Company("HP", 20);
		Company genpact = new Company("GENPACT", 15);

		List<Company> companies = new ArrayList<>();
		companies.add(genpact);
		companies.add(hp);
		companies.add(ibm);
		companies.add(cgi);

		// Collections.sort(companies, (company1, company2) ->
		// company1.getName().compareTo(company2.getName()));
		//
		// for (Company company : companies) {
		// System.out.println(company.getName());
		// }

		AnotherClass anotherClass = new AnotherClass();
		String s = anotherClass.doSomething();
		System.out.println(s);

	}

	public final static String doStringStuffs(UpperConcatination uc, String s1, String s2) {
		return uc.upperAndConcatination(s1, s2);

	}
}

class Company {
	private String name;
	private int age;

	public Company(String name, int age) {
		super();
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

interface UpperConcatination {
	public String upperAndConcatination(String s1, String s2);
}

class AnotherClass {
	public String doSomething() {
		/* commenting to use Lambda expression */
		// System.out.println("The Anotherclass's class name is: " +
		// getClass().getSimpleName());
		// return LambdaDemo3.doStringStuffs(new UpperConcatination() {
		// @Override
		// public String upperAndConcatination(String s1, String s2) {
		// System.out.println("The anonymous class name is: " +
		// getClass().getSimpleName());
		// return s1.toLowerCase() + s2.toLowerCase();
		// }
		// }, "String1", "String2");

		/* Below code part is usage of lambda expression */
		UpperConcatination uc = (s1, s2) -> {
			System.out.println("The Lambda expression class is: " + getClass().getSimpleName());
			String result = s1.toUpperCase() + s2.toUpperCase();
			return result;
		};

		System.out.println("The another class's class name is: " + getClass().getSimpleName());
		return LambdaDemo3.doStringStuffs(uc, "String1", "String2");

	}
}
