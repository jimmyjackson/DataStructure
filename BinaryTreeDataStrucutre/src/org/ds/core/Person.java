package org.ds.core;

public class Person {
	private int pid;
	private String name;
	private long contact;

	public Person() {
	}

	public Person(int pid, String name, long contact) {
		this.pid = pid;
		this.name = name;
		this.contact = contact;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	public String toString() {
		return " Person [ pid=" + pid + ", name=" + name + ", contact=" + contact + " ] ";
	}

}
