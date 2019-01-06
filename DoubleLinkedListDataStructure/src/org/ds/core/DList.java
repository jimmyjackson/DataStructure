package org.ds.core;

public class DList {
	private Node head;

	DList() {
		head = new Node();
		head.next = null;
		head.prev = null;
	}

	public void addFront(int value) {
		Node n = new Node();
		n.value = value;
		n.prev = head;
		n.next = head.next;
		head.next = n;
	}

	public void append(int value) {
		Node z = head;
		while (z.next != null) {
			z = z.next;
		}
		Node n = new Node();
		n.value = value;
		n.prev = z;
		n.next = z.next;
		z.next = n;
	}

	public void insertAfter(int target, int value) {
		Node z = head.next;
		while (true) {
			if (z == null || z.value == target) {
				break;
			} else {
				z = z.next;
			}
		}
		if (z != null) {
			Node n = new Node();
			n.value = value;
			n.prev = z;
			n.next = z.next;
			z.next = n;
		}
	}

	public void printList() {
		Node z = head.next;
		while (z != null) {
			System.out.print(" " + z.value);
			z = z.next;
		}
		System.out.println();
	}

	class Node {
		private Node prev;
		private int value;
		private Node next;
	}
}
