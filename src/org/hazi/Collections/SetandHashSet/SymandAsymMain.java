package org.hazi.Collections.SetandHashSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SymandAsymMain {

	public static void main(String[] args) {
		Set<Integer> squares = new HashSet<>();
		Set<Integer> cubes = new HashSet<>();
		
		for(int i=1; i <= 100; i++){
			squares.add(i*i);
			cubes.add(i*i*i);
		}
		
		System.out.println("The number of squares are "+squares.size() +" cubes are "+cubes.size());
		Set<Integer> union = new HashSet<>(squares);
		union.addAll(cubes);
		
		System.out.println("Total number of elements are :"+union.size());
		
		Set<Integer> intersection = new HashSet<>(squares);
		intersection.retainAll(cubes);
		System.out.println("The intersection elements are "+intersection.size());
		for(int i: intersection){
			System.out.println(i +" the square root is "+Math.sqrt(i) +" and the cube root is "+Math.cbrt(i));
		}
		
		Set<String> words = new HashSet<>();
		String sentence = "Get set go to achieve";
		String[] arrayWords = sentence.split(" ");
		words.addAll(Arrays.asList(arrayWords));
		
		for(String s : words){
			System.out.println(s);
			
		}
		
		Set<String> nature = new HashSet<>();
		Set<String> divine = new HashSet<>();
		String[] natureWords = {"hello", "how", "are", "you"};
		nature.addAll(Arrays.asList(natureWords));
		String[] divineWords = {"the", "person", "how", "you"};
		divine.addAll(Arrays.asList(divineWords));
		
		System.out.println("nature - divine");
		Set<String> diff1 = new HashSet<>(nature);
		diff1.removeAll(divine);
		printSet(diff1);
		
		System.out.println("divine - nature");
		Set<String> diff2 = new HashSet<>(divine);
		diff2.removeAll(nature);
		printSet(diff2);
	}
		
		 private static void printSet(Set<String> set) {
			System.out.println("\t");
			for(String s : set){
				System.out.println(s + " ");
			}
			System.out.println("");
		}
		

	}


