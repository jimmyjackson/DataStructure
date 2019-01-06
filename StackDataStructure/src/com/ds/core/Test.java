package com.ds.core;

public class Test {
	public static void main(String[] args) {
		/*
		 * IntStack st = new IntStack(); if (!st.isFull()) { st.push(2); st.push(11);
		 * st.push(4); st.push(9); }
		 * 
		 * System.out.println("Out: "+st.pop()); System.out.println("Out: "+st.pop());
		 * System.out.println("Out: "+st.pop()); System.out.println("Out: "+st.pop());
		 * System.out.println("Out: "+st.pop());
		 */

		Person p1 = new Person(101, "Vkp", 9621);
		Person p2 = new Person(102, "Tiger", 3874);
		Person p3 = new Person(103, "Jimmy", 6796);
		PersonStack pst = new PersonStack();
		pst.push(p1);
		pst.push(p3);
		pst.push(p2);
		System.out.println(pst.pop());
		System.out.println(pst.pop());
		System.out.println(pst.pop());
		System.out.println(pst.pop());
	}
}
