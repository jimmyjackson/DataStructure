package org.ds.core;

public class PersonBT {
	private Node root;

	public PersonBT() {
		root = null;
	}

	public boolean insertBT(Person per) {
		Node n = new Node();
		n.per = per;
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
			if (per.getName().compareTo(c.per.getName()) < 0)
				c = c.lc;
			else
				c = c.rc;
		}

		if (per.getName().compareTo(p.per.getName()) < 0) {
			p.lc = n;
		} else {
			p.rc = n;
		}
		return true;
	}

	public void showAll(Node n) {
		Node p = n;
		if (p != null) {
			System.out.println(p.per);
			showAll(n.lc);
			showAll(p.rc);
		}
	}

	public Node findNode(Person per) {
		Node p = root;

		while (p != null) {
			if (per.getName().compareTo(p.per.getName()) == 0)
				break;
			else if (per.getName().compareTo(p.per.getName()) < 0)
				p = p.lc;
			else
				p = p.rc;
		}

		return p;
	}

	public Node findParentNode(String key) {
		Node p = root;
		Node c = root;

		do {
			if (key.compareTo(c.per.getName()) == 0)
				break;
			p = c;
			if (key.compareTo(c.per.getName()) < 0) {
				c = c.lc;
			} else {
				c = c.rc;
			}
		} while (c != null);

		if (c != null)
			return p;
		else
			return null;
	}

	public void getData(Node p) {
		System.out.println(p.per);
	}

	class Node {
		private Person per;
		private Node lc;
		private Node rc;
	}
}
