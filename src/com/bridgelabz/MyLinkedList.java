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
	public int size() {
		int count = 0;
		Node<T> temp = head;
		while (temp != null) {
			temp = temp.next;
			count++;
		}
		return count;
	}
	public void insertAt(int pos, T item) {
		if (pos > size()) {
			System.out.println("out of position");
			return;
		}
		Node<T> node = new Node<T>(item);
		if (pos == 0) {
			node.next = head;
			head = node;
			return;
		}
		Node<T> temp = head;

		for (int i = 0; i < pos - 1; i++) {
			temp = temp.next;
		}
		node.next = temp.next;
		temp.next = node;
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
