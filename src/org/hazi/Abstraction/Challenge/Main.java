package org.hazi.Abstraction.Challenge;

public class Main {

	public static void main(String[] args) {
		MyLinkedList list = new MyLinkedList(null);
		list.traverse(list.getRoot());
		
		//String stringData = "Darwin Brisbane Perth Melbourne Canberra Adelaide Sydney Canberra";
		
		String stringData = "6 7 2 4 1 3 0 9 8 5";

		String[] data = stringData.split(" ");
		for (String s : data) {
			list.addItem(new Node(s));
		}
		list.traverse(list.getRoot());
		list.removeItem(new Node("6"));
		list.traverse(list.getRoot());
		list.removeItem(new Node("4"));
		list.removeItem(new Node("2"));
		list.traverse(list.getRoot());

	}

}
