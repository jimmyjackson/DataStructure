package com.ds.core;

public class IntLinkedList1 {
	private Node head;

	public IntLinkedList1() {
		head = new Node();
		head.item = 0;
		head.next = null;
	}

	public boolean addNode(int value) {
		Node n = new Node();
		n.item = value;
		n.next = null;

		Node t = head;
		while (t.next != null) {
			t = t.next;
		}
		t.next = n;
		return true;
	}

	public void showList() {
		Node z = head.next;
		while (z != null) {
			System.out.print(" " + z.item);
			z = z.next;
		}
		System.out.println();
	}

	public boolean delNode(int value) {
		if (head.item == value) {
			head = head.next;
			return true;
		} else {
			Node x = head;
			Node y = head.next;
			while (true) {
				if (y == null || y.item == value) {
					break;
				} else {
					x = y;
					y = y.next;
				}
			}

			if (y != null) {
				x.next = y.next;
				return true;
			} else {
				return false;
			}
		}
	}

	public void bubbleSort() {
		int c = 0;
		Node x = head.next;
		while (x.next != null) {
			Node y = head.next;
			while (y.next != null) {
				if (y.item < y.next.item) {
					c = y.item;
					y.item = y.next.item;
					y.next.item = c;
				}
				y = y.next;
			}
			x = x.next;
		}
	}

	class Node {
		private int item;
		private Node next;
	}
}
