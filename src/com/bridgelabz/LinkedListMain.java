package com.bridgelabz;

public class LinkedListMain {

	public static void main(String[] args) {
		MyLinkedList<Integer> mylinkedlist = new MyLinkedList<Integer>();
		
		System.out.println("Using add method: ");
		mylinkedlist.add(70);
		mylinkedlist.add(30);
		mylinkedlist.add(56);
		
		mylinkedlist.display();
		
		System.out.println("\nUsing append method");
		mylinkedlist.append(56);
		mylinkedlist.append(30);
		mylinkedlist.append(70);
		mylinkedlist.display();	
		
		System.out.println("\nAdd number in between");
		mylinkedlist.append(56);
		mylinkedlist.append(70);
		mylinkedlist.insertAt(7, 30);
		mylinkedlist.display();
	}

}
