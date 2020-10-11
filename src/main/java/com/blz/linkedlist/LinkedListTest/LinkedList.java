package com.blz.linkedlist.LinkedListTest;

public class LinkedList<T> {
	public INode<T> head, tail;

	public LinkedList() {
		head = null;
		tail = null;
	}

	public void printWelcome() {
		System.out.println("Welcome to Linked List Data Structure");
	}

	public void add(INode<T> newNode) {
		if (head == null)
			head = newNode;
		if (tail == null)
			tail = newNode;
		else {
			INode<T> tempNode = head;
			head = newNode;
			head.setNext(tempNode);
		}
	}

	public void append(INode<T> newNode) {
		if (head == null)
			head = newNode;
		if (tail == null)
			tail = newNode;
		else {
			tail.setNext(newNode);
			tail = newNode;
		}
	}

	public void insert(INode<T> myNode, INode<T> newNode) {
		INode<T> tempNode = myNode.getNext();
		myNode.setNext(newNode);
		newNode.setNext(tempNode);
	}
	
	public T pop() {
		INode<T> tempNode = head;
		head=head.getNext();
		return tempNode.getKey();
	}

	public void printMyNodes() {
		StringBuffer myNodes = new StringBuffer("My Nodes : ");
		INode<T> tempNode = head;
		while (tempNode.getNext() != null) {
			myNodes.append(tempNode.getKey());
			if (!tempNode.equals(null))
				myNodes.append(" -> ");
			tempNode = tempNode.getNext();
		}
		myNodes.append(tempNode.getKey());
		System.out.println(myNodes);
	}
}
