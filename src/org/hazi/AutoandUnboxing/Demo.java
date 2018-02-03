package org.hazi.AutoandUnboxing;

import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
		ArrayList<String> strArrayList = new ArrayList<String>();
		strArrayList.add("hazi");
		
		/*Integer is a class and arrayList takes only object wrapper classes but not primitives 
		 * Interger.valueof(i) will return the integer value to Integer class and also called as autoboxing
		 * */
		ArrayList<Integer> intArray = new ArrayList<Integer>();
		for(int i=0; i<5; i++){
		intArray.add(Integer.valueOf(i));
	}
		/*intValue() is used to convert the integer object back to integer. which is also called as unboxing */
		for(int i=0; i<5; i++){
			System.out.println("the value of i : "+intArray.get(i).intValue());
		}
		
		Integer myValue = Integer.valueOf(56);
		System.out.println(myValue);
		
		ArrayList<Double> doubleValue = new ArrayList<Double>();
		for(double dbl=0.0; dbl<10.0; dbl+=0.5){
			doubleValue.add(Double.valueOf(dbl));
		}
		for(int i=0; i<doubleValue.size(); i++){
			System.out.println("The double values are : "+doubleValue.get(i).doubleValue());
		}

}

}