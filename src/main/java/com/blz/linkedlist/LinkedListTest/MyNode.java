package com.blz.linkedlist.LinkedListTest;

public class MyNode<T> implements INode<T> {
	private T key;
	private MyNode<T> next;

	@Override
	public T getKey() {
		return key;
	}

	@Override
	public void setKey(T key) {
		this.key = key;
	}

	@Override
	public INode<T> getNext() {
		return next;
	}

	@Override
	public void setNext(INode<T> next) {
		this.next = (MyNode<T>) next;
	}

	public MyNode(T key) {
		this.key = key;
		this.next = null;
	}
}
