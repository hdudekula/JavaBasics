package org.hazi.regex;

public class FirstDemo {

	public static void main(String[] args) {
		String string = "I am a String, yes, I am";
		System.out.println(string);
		String replaceString = string.replaceAll("I", "You");
		System.out.println(replaceString);

		String alphanumeric = "Asdre321sdaereSREWF";
		/* the "." is used to replace each character */
		System.out.println(alphanumeric.replaceAll(".", "Y"));

		/*
		 * the "^" is used to replace the given characters that are beginning of
		 * the string
		 */
		System.out.println(alphanumeric.replaceAll("^Asdre", "Hazi"));

		/*
		 * matches method usually returns boolean value based on whole character
		 * match or not
		 */
		System.out.println(alphanumeric.matches("^Hazi"));
		System.out.println(alphanumeric.matches("^Asdre321sdaereSREWF"));

		/*
		 * The "$" symbol is used to match the last set of characters of a
		 * string
		 */
		System.out.println(alphanumeric.replaceAll("SREWF$", "THE END"));

		/*
		 * replace every individual character of "a" "e" "i" with character "x"
		 */
		System.out.println(alphanumeric.replaceAll("[aei]", "x"));

		/*
		 * replace only if individual characters "d" or "r" or "e" are followed
		 * with "3" or "S"
		 */
		System.out.println(alphanumeric.replaceAll("[dre][3S]", "%%%%"));

		System.out.println("harry".replaceAll("[Hh]arry", "Harry"));

		String newAlphanumeric = "Asdfe3waefilaj2545912312asdfaeoij";

		/*
		 * "^" or carrot symbol inside [ ] brackets denotes a character class
		 * instead of boundary matches. Here it replace everything except the
		 * given pattern
		 */
		System.out.println(newAlphanumeric.replaceAll("[^Aa]", "X"));

		/* Below regex shows the range and it is case sensitive */
		System.out.println(newAlphanumeric.replaceAll("[a-f3-6]", "X"));
		System.out.println(newAlphanumeric.replaceAll("[a-fA-F3-6]", "X"));

		/* Below regex shows that, turning off the case sensitive with (?i) */
		System.out.println(newAlphanumeric.replaceAll("(?i)[a-f3-6]", "X"));

		/* Below is different ways of replacing digits in a string */
		System.out.println(newAlphanumeric.replaceAll("[0-9]", "X"));
		System.out.println(newAlphanumeric.replaceAll("\\d", "X"));

		/* Below is one way of replacing non-digits in a String */
		System.out.println(newAlphanumeric.replaceAll("\\D", "X"));

		String hasWhiteSpace = "I have blanks \t, and a tab";
		System.out.println(hasWhiteSpace);

		/* Below character class removes the white spaces */
		System.out.println(hasWhiteSpace.replaceAll("\\s", ""));

		/* Below character class works opposite of \s */
		System.out.println(hasWhiteSpace.replaceAll("\\S", ""));

		/* below character class works for all digit and alphabests */
		System.out.println(newAlphanumeric.replaceAll("\\w", "X"));
		System.out.println(hasWhiteSpace.replaceAll("\\w", "X"));

		/* below character class works as opposite for \w */
		System.out.println(hasWhiteSpace.replaceAll("\\W", "X"));

		/* below character class add word boundary */
		System.out.println(hasWhiteSpace.replaceAll("\\b", "X"));

		/* below character class works opposite for \b */
		System.out.println(hasWhiteSpace.replaceAll("\\B", "X"));

	}

}
