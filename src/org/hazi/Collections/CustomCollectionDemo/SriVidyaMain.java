package org.hazi.Collections.CustomCollectionDemo;

public class SriVidyaMain {

	public static void main(String[] args) {
		
		SriVidya sriVidya = new SriVidya();
		sriVidya.add("a");
		sriVidya.add("a");
		sriVidya.add("a");
		sriVidya.add("a");
		sriVidya.add(6);

		
		Object obj = sriVidya.get(2);
		System.out.println(obj);
		
		sriVidya.capacity();
		sriVidya.size();
		
		sriVidya.replace(2, "B");
		System.out.println(sriVidya.get(2));
		
		sriVidya.remove(2);
		sriVidya.size();
		
		sriVidya.insert(1, "b");
		System.out.println(sriVidya.get(1));

	}

}
