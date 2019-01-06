package org.ds.core;

public class BTree {
	private Node root;

	public BTree() {
		root = null;
	}

	public boolean insertItem(int item) {
		Node n = new Node();
		n.value = item;
		n.lc = null;
		n.rc = null;

		if (root == null) {
			root = n;
			return true;
		}

		Node p = root;
		Node c = root;

		while (c != null) {
			p = c;
			if (item < c.value)
				c = c.lc;
			else
				c = c.rc;
		}

		if (item < p.value)
			p.lc = n;
		else
			p.rc = n;

		return true;
	}

	public Node findNode(int key) {
		Node c = root;
		while (c != null) {
			if (key == c.value)
				break;
			else if (key < c.value)
				c = c.lc;
			else
				c = c.rc;
		}
		return c;
	}

	public void showAll(Node n) {
		Node p = n;
		if (p != null) {
			System.out.print(" " + p.value);
			showAll(p.lc);
			showAll(p.rc);
		}
	}

	public Node findParentNode(int key) {
		Node p = root;
		Node c = root;
		do {
			if (key == c.value)
				break;
			p = c;
			if (key < c.value)
				c = c.lc;
			else
				c = c.rc;
		} while (c != null);

		if (c != null) {
			return p;
		} else {
			return null;
		}
	}

	public void getData(Node n) {
		System.out.println(n.value);
	}
	
	class Node {
		private int value;
		private Node lc;
		private Node rc;
	}
}
