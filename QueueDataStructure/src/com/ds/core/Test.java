package com.ds.core;

public class Test {
	public static void main(String[] args) {
		/*
		 * IntQ q = new IntQ(); q.enqueue(10); q.enqueue(25); q.enqueue(33);
		 * q.enqueue(47);
		 * 
		 * q.showAll(); System.out.println("\n---------------------");
		 * System.out.println("removed: " + q.dequeue());
		 * System.out.println("\n---------------------"); System.out.println("removed: "
		 * + q.dequeue()); q.showAll();
		 * 
		 */

		Person p1 = new Person(101, "Vinit", 9621);
		Person p2 = new Person(102, "Tiger", 3874);
		Person p3 = new Person(103, "Jimmy", 6795);
		PersonQ pq = new PersonQ();
		pq.enqueue(p1);
		pq.enqueue(p2);
		pq.enqueue(p3);

		pq.ShowAll();
		System.out.println("---------------------");
		pq.dequeue();
		pq.ShowAll();
		System.out.println("---------------------");
		pq.dequeue();
		pq.ShowAll();
		
		
	}
}
