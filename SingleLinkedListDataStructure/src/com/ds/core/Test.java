package com.ds.core;

public class Test {
	public static void main(String[] args) {
//		IntLinkedList list = new IntLinkedList();
//		list.InsertNode(11);
//		list.InsertNode(26);
//		list.InsertNode(17);
//		list.InsertNode(5);
//		list.showNode();
//		System.out.println("--------------------------------");
//		list.deleteNode(26);
//		list.showNode();
//		System.out.println("--------------------------------");
//		list.bubbleSort();
//		list.showNode();
		Person p1 = new Person(101, "Vinit", 9621);
		Person p2 = new Person(103, "Tiger", 3874);
		Person p3 = new Person(102, "Jimmy", 6795);

		PersonLinkedList pll = new PersonLinkedList();
		pll.addPerson(p1);
		pll.addPerson(p2);
		pll.addPerson(p3);
		pll.displayPerson();
		System.out.println("------------------------");
		pll.bubbleSort();
		pll.displayPerson();
	}
}
