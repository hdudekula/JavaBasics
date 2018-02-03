package org.hazi.Collections.CustomCollectionDemo;

public class SriVidya {
	private Object[] objArray = new Object[10];
	private int elementCount;
	
	public void add(Object obj){
		if(elementCount == objArray.length){
			increaseCapacity();
		}
		objArray[elementCount] = obj;
		elementCount++;
	}
	
	public void increaseCapacity(){
		int newCapacity = objArray.length * 2 ;
		Object[] newArray = new Object[newCapacity];
		for(int i=0; i<objArray.length; i++){
			newArray[i] = objArray[i];
		}
		objArray = newArray;
	}
	
	public void display(){
		for(int i=0; i<objArray.length; i++){
			System.out.println(objArray[i]);
		}
	}
	
	/*retrieving object from collection*/
	public Object get(int index){
		if(index < 0 || index >= elementCount){
			throw new ArrayIndexOutOfBoundsException(" "+index);
		}
		
		return objArray[index];
	}
	
	public void capacity(){
		System.out.println("Capacity of Array is "+objArray.length);
	}
	
	public void size(){
		System.out.println("size of Array is "+elementCount);
	}
	
	/*replacing object in collection*/
	
	public void replace(int index, Object obj){
		if(index < 0 || index >= elementCount){
			throw new ArrayIndexOutOfBoundsException(" "+index);
		}
		objArray[index] = obj;
	}
	
	/*removing the object from collection */
	
	public void remove(int index){
		if(index < 0 || index >= elementCount){
			throw new ArrayIndexOutOfBoundsException(" "+index);
		}
		while(index < elementCount-1){
			objArray[index] = objArray[index+1];
			index ++;
		}
		
		objArray[index] = null;
		elementCount--;
		
	}
	
	/*inserting objects into collection */
	
	public void insert(int index, Object obj){
		if(index < 0 || index >= elementCount){
			throw new ArrayIndexOutOfBoundsException(" "+index);
		}
		if(objArray.length==elementCount){
			increaseCapacity();
		}
		for(int i=elementCount-1; i>=index; i--){
			objArray[i+1] = objArray[i];
			
		}
		objArray[index] = obj;
	}
	
	

}
