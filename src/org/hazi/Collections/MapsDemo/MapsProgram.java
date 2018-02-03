package org.hazi.Collections.MapsDemo;

import java.util.HashMap;
import java.util.Map;

public class MapsProgram {

	public static void main(String[] args) {
		Map<String, String> languages = new HashMap<>();
		languages.put("Java", "A object oriented and platform independent language");
		languages.put("C", "platform dependent language and with pointers included");
		languages.put("C++", "Object oriented languages but also included with  pointers");
	
		if(languages.containsKey("Java")){
			System.out.println("Java is already added");
		}else {
			System.out.println(languages.put("Java", "Course about java"));
		}
		//System.out.println(languages.get("C"));
		
		System.out.println("===================================");
		/*keyset() is used to get the list of values in Map*/
		
		for(String key : languages.keySet()){
			System.out.println(key + " : " + languages.get(key));
		}
		
		System.out.println("==========================");
		
		//uncomment below line if you want to display remove funtionality
		//languages.remove("C");
		
		
		/*Demo for replace functionality*/
		languages.replace("C", "It always runs on a blue screen");
		if(languages.replace("Java", "A object oriented and platform independent language", "Yahoo I replaced")){
			System.out.println("Java is replaced");
		}else {
			System.out.println("Java was not replaced");
		}
		
		
		/*below block removes JAVA only if key and value matches*/
		if(languages.remove("Java", "A object is a instance of a class")){
			System.out.println("Java langauge is removed");
		}else {
			System.out.println("Java not removed. Key/value is not matched");
		}
		
		for(String key : languages.keySet()){
			System.out.println(key + " : " + languages.get(key));
		}

	}

}
