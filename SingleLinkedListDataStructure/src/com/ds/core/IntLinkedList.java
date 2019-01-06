package com.ds.core;

public class IntLinkedList {
	private Node head;

	public IntLinkedList() {
		head = new Node();
		head.value = 0;
		head.link = null;
	}

	public boolean InsertNode(int value) {

		Node t = head;
		while (t.link != null) {
			t = t.link;
		}

		Node n = new Node();
		n.value = value;
		n.link = null;

		t.link = n;
		return true;
	}

	public void deleteNode(int value) {
		if (head.link.value == value) {
			head.link = head.link.link;
		} else {
			Node x = head.link;
			Node y = head.link.link;
			while (y != null) {
				if (y == null || y.value == value)
					break;
				else {
					x = y;
					y = y.link;
				}
			}
			if (y != null) {
				x.link = y.link;
			}
		}
	}

	public void showNode() {
		Node z = head.link;
		while (z != null) {
			System.out.print(" " + z.value);
			z = z.link;
		}
		System.out.println();
	}

	public void bubbleSort() {
		int c = 0;
		Node a = head.link;
		while (a.link != null) {
			Node b = head.link;
			while (b.link != null) {
				if (b.value > b.link.value) {
					c = b.value;
					b.value = b.link.value;
					b.link.value = c;
				}
				b = b.link;
			}
			a = a.link;
		}
	}

	class Node {
		private int value;
		private Node link;
	}
}
