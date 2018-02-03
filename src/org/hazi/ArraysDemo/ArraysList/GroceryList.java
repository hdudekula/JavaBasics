package org.hazi.ArraysDemo.ArraysList;

import java.util.ArrayList;

public class GroceryList {
	private ArrayList<String> groceryList = new ArrayList<String>();
	public void addGroceryList(String item){
		groceryList.add(item);
	}
	
	
	
	public ArrayList<String> getGroceryList() {
		return groceryList;
	}



	public void printGroceryList(){
		System.out.println("you have "+groceryList.size() + " items in your list");
		for(int i=0; i<groceryList.size(); i++){
			System.out.println((i+1)+". "+ groceryList.get(i));
		}
	}
	
	public void modifyGroceryList(int position, String newItem){
		groceryList.set(position, newItem);
		System.out.println("Grocery Item "+ (position+1) + " has been modified");
	}
	
	public void removeGroceryList(int position){
		//groceryList.get(position);
		groceryList.remove(position);
	}
	
	public String findGroceryList(String searchItem){
		//boolean exists = groceryList.contains(searchItem);
		int position = groceryList.indexOf(searchItem);
		if(position>=0){
			return groceryList.get(position);
		}
		return null;
	}

}
