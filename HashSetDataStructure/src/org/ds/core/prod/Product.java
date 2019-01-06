package org.ds.core.prod;

public class Product {
	String pid;
	String pname;
	long pcode;

	public Product() {
	}

	public Product(String pid, String pname, long pcode) {
		this.pid = pid;
		this.pname = pname;
		this.pcode = pcode;
	}

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public long getPcode() {
		return pcode;
	}

	public void setPcode(long pcode) {
		this.pcode = pcode;
	}

	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", pcode=" + pcode + "]";
	}

}
