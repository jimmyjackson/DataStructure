package com.ds.core;

public class PersonLinkedList {
	private Node head;

	public PersonLinkedList() {
		head = new Node();
		head.person = null;
		head.link = null;
	}

	public boolean addPerson(Person person) {
		Node n = new Node();
		n.person = person;
		n.link = null;

		Node t = head;
		while (t.link != null) {
			t = t.link;
		}
		t.link = n;
		return true;
	}

	public void displayPerson() {
		Node z = head.link;
		while (z != null) {
			System.out.println(" " + z.person);
			z = z.link;
		}
	}

	public boolean removePerson(String fname) {
		if (head.link.person.getFname().equals(fname)) {
			head = head.link;
			return true;
		} else {
			Node x = head.link;
			Node y = head.link.link;
			while ((y != null) || !(y.person.getFname().equals(fname))) {
				x = y;
				y = y.link;
			}
			if (y != null) {
				x.link = y.link;
				return true;
			}
			return false;
		}
	}

	public void bubbleSort() {
		Person p;
		Node x = head.link;
		while (x.link != null) {
			Node y = head.link;
			while (y.link != null) {
//				if (y.person.getPid() < y.link.person.getPid()) {
				if (y.person.getFname().compareTo(y.link.person.getFname()) > 0) {
					p = y.person;
					y.person = y.link.person;
					y.link.person = p;
				}
				p = null;
				y = y.link;
			}
			x = x.link;
		}
	}

	class Node {
		private Person person;
		private Node link;
	}
}
