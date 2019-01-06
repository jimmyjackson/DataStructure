package com.ds.core;

public class PersonQ {
	private Person[] perq;
	private int total;
	private int size;
	private int front;
	private int rear;

	public PersonQ() {
		this.total = 0;
		this.size = 50;
		this.front = 0;
		this.rear = 0;
		this.perq = new Person[this.size];
	}

	public PersonQ(int size) {
		this.total = 0;
		this.size = size;
		this.front = 0;
		this.rear = 0;
		this.perq = new Person[this.size];
	}

	public boolean enqueue(Person per) {
		if (!isFull()) {
			perq[rear] = per;
			rear = (rear + 1) % size;
			total++;
			return true;
		} else {
			return false;
		}
	}

	public boolean isFull() {
		return (size == total);
	}

	public Person dequeue() {
		Person item = perq[front];
		total--;
		front = (front + 1) % size;
		return item;
	}

	public void ShowAll() {
		int f = front;
		for (int i = 0; i < total; i++) {
			System.out.println(perq[f]);
			f = (f + 1) % size;
		}
	}
}
