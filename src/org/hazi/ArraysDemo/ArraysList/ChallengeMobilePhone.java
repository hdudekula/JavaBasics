package org.hazi.ArraysDemo.ArraysList;

import java.util.ArrayList;

public class ChallengeMobilePhone {
	private String myNumber;
	private ArrayList<ChallengeContacts> contactList;
	public ChallengeMobilePhone(String myNumber) {
		super();
		this.myNumber = myNumber;
		this.contactList = new ArrayList<ChallengeContacts>();
	}
	
	public boolean addContact(ChallengeContacts contact){
		if(findContact(contact.getName()) >= 0){
			System.out.println(contact.getName()+ " has already in your contact list");
			return false;
		}
		contactList.add(contact);
		return true;
	}
	
	public boolean updateContact(ChallengeContacts oldContact, ChallengeContacts newContact){
		int foundPosition = findContact(oldContact);
		if(foundPosition<0){
			System.out.println(oldContact.getName() + ", was not found");
			return false;
		}
		this.contactList.set(foundPosition, newContact);
		System.out.println("contact "+oldContact.getName() + " has been replaced with "+newContact.getName());
		return true;
	}
	
	public boolean removeContact(ChallengeContacts contact){
		int foundPosition = findContact(contact);
		if(foundPosition<0){
			System.out.println(contact.getName() + ", was not found");
			return false;
		}
		this.contactList.remove(foundPosition);
		System.out.println(contact.getName()+" has been deleted");
		return true;
	}
	
	private int findContact(ChallengeContacts contact){
		return this.contactList.indexOf(contact);
	}
	
	private int findContact(String contactName){
		for(int i=0; i<contactList.size(); i++){
			ChallengeContacts contact = this.contactList.get(i);
			if(contact.getName().equals(contactName)){
				return 1;
			}
		}
		return -1;
	}
	
	public String queryContact(ChallengeContacts contact){
		if(findContact(contact)>=0){
			return contact.getName();
		}
		return null;
	}
	
	public ChallengeContacts queryContact(String name){
		int position = findContact(name);
		if(position>=0){
		return this.contactList.get(position);
		}
		return null;
	}
		
	
	
	
	public void printContacts(){
		System.out.println("Contact list:\n");
		for(int i=0; i<this.contactList.size(); i++){
			System.out.println((i+1)+". "+ contactList.get(i).getName() +" "+ contactList.get(i).getPhoneNumber());
		}
	}
	
}
