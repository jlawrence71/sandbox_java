package com.jbl.sandbox_java.stack;


public class MyStack {

	Node<Integer> head;
	
	
	public Node<Integer> peek(){
		return head;
	}
	
	public Node<Integer> pop() throws EmptyStackException{
		if(head == null) {
			throw new EmptyStackException();
		}
		
		Node<Integer> currentHead = this.head;
		this.head = head.getNext();
		return currentHead;
	}
	
	public void push(Node<Integer> newNode) {		
		newNode.setNext(this.head);
		this.head = newNode;
	}

	public boolean isEmpty() {
		return head == null;
	}
}
