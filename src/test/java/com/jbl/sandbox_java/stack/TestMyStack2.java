package com.jbl.sandbox_java.stack;

import org.junit.jupiter.api.Test;

import com.jbl.stack.EmptyStackException;
import com.jbl.stack.MyStack;
import com.jbl.stack.Node;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;


class TestMyStack2 {

	// #1
	@Test
	void isEmpty_returnsTrue_ifStackIsEmpty() {
		MyStack stack = new MyStack();
		assertTrue("Stack is supposed to be empty",stack.isEmpty());
	}

	// #2
	@Test
	void isEmpty_returnsFalse_ifPushIsCalled() {
		Node node = new Node(1);
		
		MyStack stack = new MyStack();
		stack.push(node);
		assertFalse("Stack is NOT supposed to be empty",stack.isEmpty());
	}
	
	// #3
	@Test
	void peek_returnsNull_ifStackIsEmpty() {
		MyStack stack = new MyStack();
		assertNull("Peek should return null if empty",stack.peek());
	}

	// #4
	@Test
	void peek_returns_pushedValue_ifPushIsCalled() {
		Node node = new Node(1);
		
		MyStack stack = new MyStack();
		stack.push(node);
		assertEquals("Peek should return just pushed value",stack.peek().getValue(),node.getValue());
	}

	// #5
	@Test
	void pop_throwsEmptyStackException_IfStackIsEmpty() {
		MyStack stack = new MyStack();
		assertThrows(EmptyStackException.class,()->stack.pop(),"Exception expected when popping empty stack");
	}

	// #6
	@Test
	void pop_returnsRecentPushValue() throws EmptyStackException {
		Node node = new Node(1);
		
		MyStack stack = new MyStack();
		stack.push(node);
		assertEquals("Pop should return just pushed value",stack.pop().getValue(),node.getValue());
	}

	// #7
	@Test
	void peek_returnsNull_ifPopIsCalledAfterPush() throws EmptyStackException {
		Node node = new Node(1);
		
		MyStack stack = new MyStack();
		stack.push(node);
		stack.pop();
		
		assertNull("Stack peek should return null if push/pop called back to back",stack.peek());
	}
	
	// #8
	@Test
	void isEmpty_returnsTrue_PopIsCalledAfterPush() throws EmptyStackException {
		Node node = new Node(1);
		
		MyStack stack = new MyStack();
		stack.push(node);
		stack.pop();
		
		assertTrue("Stack isEmpty should return true if push/pop called back to back",stack.isEmpty());
	}
	
}
