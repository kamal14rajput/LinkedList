package com.bridgelabz;

public class MyLinkedList<T> {
	private Node<T> head;
	
	public void list(){
		Node head = null;
	}
	
	public void display() {
		Node<T> temp = head;
		while(temp.next != null) {
		System.out.println(temp.data+"==>");
		temp = temp.next;
		}
	System.out.println(temp.data);
	}
}
