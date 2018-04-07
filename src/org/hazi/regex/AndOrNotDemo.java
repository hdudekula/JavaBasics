package org.hazi.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AndOrNotDemo {

	public static void main(String[] args) {

		/* pipe symbol represents the OR operation. It replaces either H or h */
		System.out.println("Harry".replaceAll("[H|h]arry", "Larry"));

		String tvTest = "tstvtkt";
		String tvNotRegex = "(t[^v])";
		Pattern tNotPattern = Pattern.compile(tvNotRegex);
		Matcher tNotMatcher = tNotPattern.matcher(tvTest);

		int count = 0;
		while (tNotMatcher.find()) {
			count++;
			System.out.println("occurrence : " + count + ":" + tNotMatcher.start() + " to " + tNotMatcher.end()
					+ " and matching are : " + tNotMatcher.group(1));
		}
		tNotMatcher.reset();

		/*
		 * Usage of NOT operator (?!char). It also called as look ahead
		 * expressions
		 */
		String tvNotRegex1 = "(t(?!v))";
		Pattern tNotPattern1 = Pattern.compile(tvNotRegex1);
		Matcher tNotMatcher1 = tNotPattern1.matcher(tvTest);

		count = 0;
		while (tNotMatcher1.find()) {
			count++;
			System.out.println("occurrence : " + count + ":" + tNotMatcher1.start() + " to " + tNotMatcher1.end()
					+ " and matching are : " + tNotMatcher1.group(1));
		}
	}

}
