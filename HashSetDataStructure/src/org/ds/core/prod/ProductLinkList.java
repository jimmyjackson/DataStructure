package org.ds.core.prod;

public class ProductLinkList {
	private Node h;

	public ProductLinkList() {
		h = new Node();
		h.prod = null;
		h.link = null;
	}

	public boolean insert(Product data) {
		Node n = new Node();
		n.prod = data;
		n.link = h.link;
		h.link = n;
		return true;
	}

	public boolean have(String pid) {
		boolean have = false;
		Node n = h.link;
		while (n != null) {
			if (pid.equals(n.prod.getPid())) {
				have = true;
				break;
			}
			n = n.link;
		}
		return have;
	}

	public Product fetech(String pid) {
		Product data = null;
		Node n = h.link;
		while (n != null) {
			if (pid.equals(n.prod.getPid())) {
				data = h.prod;
				break;
			}
			n = n.link;
		}
		return data;
	}

	public boolean delete(String pid) {
		Node x = h;
		Node y = h.link;
		while (y != null) {
			if (pid.equals(y.prod.getPid())) {
				break;
			}
			x = y;
			y = y.link;
		}

		if (y != null) {
			x.link = y.link;
			return true;
		}

		return false;
	}

	public void showAll() {
		Node n = h.link;
		while (n != null) {
			System.out.println(" " + n.prod);
			n = n.link;
		}
	}

	class Node {
		private Product prod;
		private Node link;
	}
}
