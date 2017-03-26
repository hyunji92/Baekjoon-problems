package com.planb.main;

import java.util.Stack;

public class CustomStack {
	private Stack<Integer> stack = new Stack<Integer>();

	protected void push(int x) {
		stack.add(x);
	}
	
	protected int pop() {
		if(stack.isEmpty()) {
			return -1;
		} else {
			return (int) stack.pop();
		}
	}
	
	protected int getSize() {
		return stack.size();
	}
	
	protected int isEmpty() {
		if(stack.isEmpty()) {
			return 1;
		} else {
			return 0;
		}
	}
	
	protected int getTop() {
		if(stack.isEmpty()) {
			return -1;
		} else {
			return stack.peek();
		}
	}
}
