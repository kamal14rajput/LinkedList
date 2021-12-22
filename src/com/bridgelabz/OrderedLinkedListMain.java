package com.bridgelabz;

public class OrderedLinkedListMain {

	public static void main(String[] args) {
		LinkedListService<Integer> linkedListService = new LinkedListService<Integer>();
		
		System.out.println("\nOrdered Linked list");
		linkedListService.addOrdered(56);
		linkedListService.addOrdered(30);
		linkedListService.addOrdered(40);
		linkedListService.addOrdered(70);
		linkedListService.display();
	}

}
