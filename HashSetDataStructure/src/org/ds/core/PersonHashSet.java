package org.ds.core;

public class PersonHashSet {
	private PersonLinkedList[] stack;
	private int total;
	private int size;

	public PersonHashSet() {
		this.size = 100;
		this.total = 0;
		this.stack = new PersonLinkedList[this.size];
	}

	public PersonHashSet(int size) {
		this.size = size;
		this.total = 0;
		this.stack = new PersonLinkedList[this.size];
	}

	public int toHashCode(String pid) {
		int adasciis = 0;
		int codevalue = 0;
		for (int i = 0; i < pid.length(); i++) {
			adasciis = adasciis + (int) pid.charAt(i);
		}
		codevalue = codevalue % pid.length();
		return codevalue;
	}

	public boolean insert(int key, Person data) {
		if (stack[key] == null) {
			stack[key] = new PersonLinkedList();
		}
		stack[key].insertPerson(data);
		total++;
		return true;
	}

	public int getTotal() {
		return total;
	}

	public Person fetechData(String pid) {
		Person data = null;
		int key = toHashCode(pid);
		if (stack[key] != null) {
			data = stack[key].fetchData(pid);
		}
		return data;
	}

	public boolean deletePid(String pid) {
		boolean have = stack[toHashCode(pid)].haveRollNo(pid);
		if (have) {
			int key = toHashCode(pid);
			have = stack[key].deletePerson(pid);
			total--;
		}
		return have;
	}

	public void showData() {
		for (int i = 0; i < stack.length; i++) {
			if (stack[i] != null) {
				stack[i].showAll();
			}
		}
	}
}
