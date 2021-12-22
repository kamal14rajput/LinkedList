package com.bridgelabz;

public class MyLinkedList<T> {
	private Node<T> head;
	
	public void list(){
		Node head = null;
	}
	public void append(T data) {
		Node<T> node = new Node<T>(data);
		if (head == null) {
			head = node;
			return; 
		}
		else 
		{
			Node<T> temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = node;
		}
	}
	
	public void add(T data)
	{
		Node<T> newNode = new Node<T>(data);
		newNode.data = data;
		newNode.next = head;
		head = newNode;	
	}
	
	public void display() {
		Node<T> temp = head;
		while(temp.next != null) {
		System.out.print(temp.data+"==>");
		temp = temp.next;
		}
	System.out.println(temp.data);
	}
}
