package org.ds.core;

public class PersonLinkedList {
	private Node h;

	PersonLinkedList() {
		h = new Node();
		h.data = null;
		h.next = null;
	}

	public boolean insertPerson(Person item) {
		Node n = new Node();
		n.data = item;
		n.next = h.next;
		h.next = n;
		return true;
	}

	public boolean haveRollNo(String pid) {
		boolean have = false;
		Node n = h.next;
		while (n != null) {
			if (n.data.getPid().equals(pid)) {
				have = true;
			}
			n = n.next;
		}
		return have;
	}

	public Person fetchData(String pid) {
		Person data = null;
		Node n = h.next;
		while (n != null) {
			if (n.data.getPid().equals(pid)) {
				data = n.data;
				break;
			}
			n = n.next;
		}
		return data;
	}

	public boolean deletePerson(String pid) {
		Node x = h;
		Node y = h.next;
		while (y != null && !(y.data.getPid().equals(pid))) {
			x = y;
			y = y.next;
		}
		if (y != null) {
			x.next = y.next;
			return true;
		}
		return false;
	}

	public void showAll() {
		Node x = h.next;
		while (x != null) {
			System.out.println(" " + x.data);
			x = x.next;
		}
	}

	class Node {
		private Person data;
		private Node next;
	}
}
