package com.blz.linkedlist.LinkedListTest;

import org.junit.Assert;
import org.junit.Test;

public class LinkedListTest {
	@Test
	public void given3NumberWhenLinkedShouldPassLinkedListTest() {
		MyNode<Integer> myFirstNode = new MyNode<Integer>(56);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(70);
		myFirstNode.setNext(mySecondNode);
		mySecondNode.setNext(myThirdNode);
		boolean result = myFirstNode.getNext().equals(mySecondNode) && mySecondNode.getNext().equals(myThirdNode);
		Assert.assertTrue(result);
	}

	@Test
	public void given3NumberWhenAddedToLinkedListShouldbeAddedToTop() {
		MyNode<Integer> myFirstNode = new MyNode<>(70);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(56);
		LinkedList<Integer> myLinkedList = new LinkedList<>();
		myLinkedList.add(myFirstNode);
		myLinkedList.add(mySecondNode);
		myLinkedList.add(myThirdNode);
		myLinkedList.printMyNodes();
		boolean result = myLinkedList.head.equals(myThirdNode) && myLinkedList.head.getNext().equals(mySecondNode)
				&& myLinkedList.tail.equals(myFirstNode);
		Assert.assertTrue(result);
	}

	@Test
	public void given3NumberWhenAddedToLinkedListShouldbeAddedToLast() {
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		LinkedList<Integer> myLinkedList = new LinkedList<>();
		myLinkedList.add(myFirstNode);
		myLinkedList.append(mySecondNode);
		myLinkedList.append(myThirdNode);
		myLinkedList.printMyNodes();
		boolean result = myLinkedList.head.equals(myFirstNode) && myLinkedList.head.getNext().equals(mySecondNode)
				&& myLinkedList.tail.equals(myThirdNode);
		Assert.assertTrue(result);
	}

	@Test
	public void given3NumberWhenInsertingSecondInBetweenShouldPassLinkedListResult() {
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		LinkedList<Integer> myLinkedList = new LinkedList<>();
		myLinkedList.add(myFirstNode);
		myLinkedList.append(myThirdNode);
		myLinkedList.insert(myFirstNode, mySecondNode);
		myLinkedList.printMyNodes();
		boolean result = myLinkedList.head.equals(myFirstNode) && myLinkedList.head.getNext().equals(mySecondNode)
				&& myLinkedList.tail.equals(myThirdNode);
		Assert.assertTrue(result);
	}

	@Test
	public void givenFirstElementWhenDeletedShouldPassLinkedListResult() {
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		LinkedList<Integer> myLinkedList = new LinkedList<>();
		myLinkedList.add(myFirstNode);
		myLinkedList.append(mySecondNode);
		myLinkedList.append(myThirdNode);
		INode<Integer> firstNode = myLinkedList.pop();
		myLinkedList.printMyNodes();
		boolean result = firstNode.equals(myFirstNode);
		Assert.assertTrue(result);
	}

	@Test
	public void givenLastElementWhenDeletedShouldPassLinkedListResult() {
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		LinkedList<Integer> myLinkedList = new LinkedList<>();
		myLinkedList.add(myFirstNode);
		myLinkedList.append(mySecondNode);
		myLinkedList.append(myThirdNode);
		INode<Integer> lastNode = myLinkedList.popLast();
		myLinkedList.printMyNodes();
		boolean result = lastNode.equals(myThirdNode);
		Assert.assertTrue(result);
	}

	@Test
	public void givenElementToSearchWhenFoundShouldReturnItsNode() {
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		LinkedList<Integer> myLinkedList = new LinkedList<>();
		myLinkedList.add(myFirstNode);
		myLinkedList.append(mySecondNode);
		myLinkedList.append(myThirdNode);
		INode<Integer> searchNode = myLinkedList.search(30);
		boolean result = searchNode.equals(mySecondNode);
		Assert.assertTrue(result);
	}

	@Test
	public void givenElementWhenInsertingAfterAGivenElementShouldPassLinkedListResult() {
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(40);
		MyNode<Integer> myFourthNode = new MyNode<>(70);
		LinkedList<Integer> myLinkedList = new LinkedList<>();
		myLinkedList.add(myFirstNode);
		myLinkedList.append(mySecondNode);
		myLinkedList.append(myFourthNode);
		myLinkedList.insert(30, myThirdNode);
		myLinkedList.printMyNodes();
		boolean result = myLinkedList.head.getNext().getNext().equals(myThirdNode);
		Assert.assertTrue(result);
	}
}
