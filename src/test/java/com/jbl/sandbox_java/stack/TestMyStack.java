package com.jbl.sandbox_java.stack;

import org.junit.jupiter.api.Test;

import com.jbl.sandbox_java.stack.MyStack;
import com.jbl.sandbox_java.stack.Node;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

class TestMyStack {

	@Test
	void testPush() {
		
		Node node = new Node(1);
		
		MyStack stack = new MyStack();
		stack.push(node);
		
	}
	
	@Test
	void testPop() throws Exception{
		Node node = new Node(1);
		
		MyStack stack = new MyStack();
		stack.push(node);
	
		Node popped = stack.pop();
		
		assertNotNull("Popped node should not be null",popped);
	}

	@Test
	void testPeek(){
		
		Node node = new Node(1);
		
		MyStack stack = new MyStack();
		stack.push(node);
	
		Node peeked = stack.peek();
		
		assertNotNull("Peeked node should not be null",peeked);
		assertFalse("Peeking should not have removed node",stack.isEmpty());
	}

	@Test
	void testEmptyPeek() throws Exception{
		MyStack stack = new MyStack();
		
		assertNull("Expected empty stack to return null on peek",stack.peek());
	}

	@Test
	void testUnhappyPop() throws Exception{
		MyStack stack = new MyStack();
		assertThrows(EmptyStackException.class,()-> stack.pop(),"Expected an exception");
	}

}
