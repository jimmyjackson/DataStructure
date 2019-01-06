package org.ds.core;

public class Person {
	private String pid;
	private String fname;
	private long contact;

	public Person() {
	}

	public Person(String pid, String fname, long contact) {
		this.pid = pid;
		this.fname = fname;
		this.contact = contact;
	}

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	public String toString() {
		return "Person [pid=" + pid + ", fname=" + fname + ", contact=" + contact + "]";
	}

}
