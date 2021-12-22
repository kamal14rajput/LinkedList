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
		mylinkedlist.clearList();
		
		System.out.println("\nAdd number in between");
		mylinkedlist.append(56);
		mylinkedlist.append(70);
		mylinkedlist.insertAt(1, 30);
		mylinkedlist.display();
		
		
		System.out.println("\nDelete First element");
		mylinkedlist.popFirst();
		mylinkedlist.display();
		mylinkedlist.clearList();
		
		System.out.println("\nDelete Last element");
		mylinkedlist.append(56);
		mylinkedlist.append(30);
		mylinkedlist.append(70);
		mylinkedlist.popLast();
		mylinkedlist.display();
		
		System.out.println("\nFinding the element from the list");
		if(mylinkedlist.search(30))
		{
			System.out.println("Element Found");
		}
		else
		{
			System.out.println("Element not found");
		}
		
		mylinkedlist.clearList();
		System.out.println("Add element after 30");
		mylinkedlist.append(56);
		mylinkedlist.append(30);
		mylinkedlist.append(70);
		mylinkedlist.insertAt(mylinkedlist.index(30)+1, 40);
		mylinkedlist.display();
	}

}
