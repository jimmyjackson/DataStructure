package com.ds.core;

public class PersonStack {
	private Person[] stack;
	private int size;
	private int top;

	public PersonStack() {
		this.size = 50;
		this.top = -1;
		this.stack = new Person[this.size];
	}

	public PersonStack(int size) {
		this.size = size;
		this.top = -1;
		this.stack = new Person[this.size];
	}

	public boolean push(Person item) {
		if (!isFull()) {
			top++;
			stack[top] = item;
			return true;
		} else {
			return false;
		}
	}

	public Person pop() {
		return stack[top--];
	}

	public boolean isFull() {
		return (top == stack.length - 1);
	}

	public boolean isEmpty() {
		return (top == -1);
	}

}
