package com.blz.linkedlist.LinkedListTest;

import org.junit.Assert;
import org.junit.Test;

public class LinkedListTest {
	@Test
	public void given3NumberWhenLinkedShouldPssedLinkedListTest() {
		MyNode<Integer> myFirstNode = new MyNode<Integer>(56);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(56);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(56);	
		myFirstNode.setNext(mySecondNode);
		mySecondNode.setNext(myThirdNode);
		boolean result = myFirstNode.getNext().equals(mySecondNode) && mySecondNode.getNext().equals(myThirdNode);
		Assert.assertTrue(result);
	}
}
