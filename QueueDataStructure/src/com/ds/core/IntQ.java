package com.ds.core;

public class IntQ {
	private int[] qu;
	private int size;
	private int total;
	private int rear;
	private int front;

	public IntQ() {
		this.size = 50;
		this.total = 0;
		this.rear = 0;
		this.front = 0;
		this.qu = new int[this.size];
	}

	public IntQ(int size) {
		this.size = size;
		this.total = 0;
		this.rear = 0;
		this.front = 0;
		this.qu = new int[this.size];
	}

	public boolean enqueue(int item) {
		if (!isFull()) {
			total++;
			qu[rear] = item;
			rear = (rear + 1) % size;
			return true;
		} else {
			return false;
		}
	}

	public int dequeue() {
		int item = qu[front];
		total--;
		front = (front + 1) % size;
		return item;
	}

	public boolean isFull() {
		return (size == total);
	}

	public boolean isEmpty() {
		return (total == 0);
	}

	public void showAll() {
		int f = front;
		for (int i = 0; i < total; i++) {
			System.out.print(" " + qu[f]);
			f = (f + 1) % size;
		}
	}

}
