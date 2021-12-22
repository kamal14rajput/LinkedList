package com.bridgelabz;

public class LinkedListMain {

	public static<T> void main(String[] args) {
		MyLinkedList<T> mylinkedlist = new MyLinkedList<>();
		
		Node<Integer> node1 = new Node<>(56);
        Node<Integer> node2 = new Node<>(30);
        Node<Integer> node3 = new Node<>(70);
		
        node1.setNext(node2);
        node2.setNext(node3);
		
		mylinkedlist.display();
	}

}
