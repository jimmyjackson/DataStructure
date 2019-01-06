package org.ds.core;

public class Test {
	public static void main(String[] args) {
		DList dl = new DList();
		dl.addFront(2);
		dl.addFront(9);
		dl.addFront(5);
		dl.append(7);
		dl.printList();
		dl.insertAfter(9, 8);
		dl.printList();
	}
}
