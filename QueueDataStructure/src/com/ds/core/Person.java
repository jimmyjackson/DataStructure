package com.ds.core;

public class Person {
	private int pid;
	private String fname;
	private long contact;

	public Person(int pid, String fname, long contact) {
		this.pid = pid;
		this.fname = fname;
		this.contact = contact;
	}

	public String toString() {
		return "Person [pid=" + pid + ", fname=" + fname + ", contact=" + contact + "]";
	}

}
