package org.hazi.AutoandUnboxing;

import java.util.ArrayList;

public class PracticeStudents {
	ArrayList<String> name = new ArrayList<String>();
	
	public void addStudents(String s){
		name.add(s);
		
	}
	
	public void printStudents(){
		for(int i=0; i<name.size();i++){
		System.out.println((i+1) +" Student name is : " +name.get(i));
		}
	}
	
	public void modifyStudentNames(int position, String newName){
		name.set(position, newName);
		System.out.println("name " +newName +" has been updated");
	}
	
	

}
