package com.ds.core;

public class IntStack {
	private int[] stack;
	private int size;
	private int top;

	public IntStack() {
		this.size = 50;
		this.top = -1;
		this.stack = new int[this.size];
	}

	public IntStack(int size) {
		this.size = size;
		this.top = -1;
		this.stack = new int[this.size];
	}

	public boolean push(int item) {
		if (!isFull()) {
			top++;
			stack[top] = item;
			return true;
		} else {
			return false;
		}
	}

	public int pop() {
		return !isEmpty() ? stack[top--] : -1;
	}

	public boolean isFull() {
		return (top == stack.length - 1);
	}

	public boolean isEmpty() {
		return (top == -1);
	}

}
