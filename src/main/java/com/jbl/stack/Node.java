package com.jbl.stack;

/**
 * Java Generic Node Type - For building data structures
 * 
 * @author jameslawrence
 *
 * @param <T>
 */
public class Node<T>{
	private Node<T> next;
	private T value;
	
	public Node(T value) {
		this.value = value;
	}
	
	public T getValue() {
		return this.value;
	}
	
	public void setNext(Node<T> next) {
		this.next = next;
	}
	
	public Node<T> getNext() {
		return this.next;
	}
}
