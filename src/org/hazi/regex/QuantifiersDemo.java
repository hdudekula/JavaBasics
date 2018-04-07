package org.hazi.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class QuantifiersDemo {

	public static void main(String[] args) {
		String thirdAlphanumeric = "abcDeeea13331445463asdf";
		System.out.println(thirdAlphanumeric.replaceAll("^abcDee", "YYY"));

		/*
		 * if we use quantifier {} with no of repetitions of char. Quantifier
		 * should be after the char
		 */
		System.out.println(thirdAlphanumeric.replaceAll("^abcDe{2}", "YYY"));

		/*
		 * if we want to replace the same for one or more char, we should use
		 * Quantifier "+"
		 */
		System.out.println(thirdAlphanumeric.replaceAll("^abcDe+", "YYY"));

		/*
		 * The quantifier "*" use to replace zero or more characters of letter e
		 */
		System.out.println(thirdAlphanumeric.replaceAll("^abcDe*", "YYY"));

		/*
		 * The quantifier {2,5} defines the range. It replaces only if letter e
		 * found min of 2 and max of 5 times
		 */
		System.out.println(thirdAlphanumeric.replaceAll("^abcDe{2,5}", "YYY"));

		/*
		 * below quantifier replaces one or more 1's and zero or more 4's
		 * followed by single 5 with letter Y
		 */
		System.out.println(thirdAlphanumeric.replaceAll("1+4*5", "Y"));

		/* below is demo for pattern matches as per oracle document */

		StringBuilder htmlText = new StringBuilder("<h1>I am the header <h1>");
		htmlText.append("<h2> I am the sub heading </h2>");
		htmlText.append("<p> I am the paragraph and about something </p>");
		htmlText.append("<h2> Summary </h2>");

		String h2Pattern = "<h2>";
		Pattern pattern = Pattern.compile(h2Pattern);
		Matcher matcher = pattern.matcher(htmlText);
		System.out.println(matcher.matches());

		/* we need to reset the matcher after every use to retain the value */
		matcher.reset();
		int count = 0;
		/*
		 * The start and end methods of matcher object returns the index of <h2>
		 */
		while (matcher.find()) {
			count++;
			System.out.println("occurrence : " + count + " : " + matcher.start() + " to " + matcher.end());
		}

		/* This is the demo on how to print the group */
		String h2groupPattern = "(<h2>.*?</h2>)";
		Pattern groupPattern = Pattern.compile(h2groupPattern);
		Matcher groupMatcher = groupPattern.matcher(htmlText);
		System.out.println(groupMatcher.matches());

		groupMatcher.reset();

		while (groupMatcher.find()) {
			System.out.println("Occurrence : " + groupMatcher.group(1));
		}

		/* This is the demo on how to access plain text using groups */
		String h2groupText = "(<h2>)(.+?)(</h2>)";
		Pattern h2TextPattern = Pattern.compile(h2groupText);
		Matcher h2TextMatcher = h2TextPattern.matcher(htmlText);

		while (h2TextMatcher.find()) {
			System.out.println("Occurrence : " + h2TextMatcher.group(2));
		}
	}

}
