package org.ds.core.prod;

public class ProductHashset {
	private ProductLinkList[] stack;
	private int size;
	private int totalProducts;

	public ProductHashset() {
		this.size = 50;
		this.totalProducts = 0;
		stack = new ProductLinkList[this.size];
	}

	public ProductHashset(int size) {
		this.size = size;
		this.totalProducts = 0;
		stack = new ProductLinkList[this.size];
	}

	public int toHashCode(String pid) {
		int asciiVal = 0;
		int codeVal = 0;
		for (int i = 0; i < pid.length(); i++) {
			asciiVal = asciiVal + (int) pid.charAt(i);
		}
		codeVal = asciiVal % pid.length();
		return codeVal;
	}

	public boolean insertProduct(int key, Product prod) {
		if (stack[key] == null) {
			stack[key] = new ProductLinkList();
		}
		stack[key].insert(prod);
		totalProducts++;
		return true;
	}

	public int getTotalProduct() {
		return totalProducts;
	}

	public boolean deleteProduct(String pid) {
		boolean have = stack[toHashCode(pid)].have(pid);
		if (have) {
			int key = toHashCode(pid);
			stack[key].delete(pid);
			totalProducts--;
		}
		return have;
	}

	public Product haveProduct(String pid) {
		Product prod = null;
		int key = toHashCode(pid);
		if (stack[key] != null) {
			prod = stack[key].fetech(pid);
		}
		return prod;
	}

	public void displayAll() {
		for (int i = 0; i < stack.length; i++) {
			if (stack[i] != null) {
				stack[i].showAll();
			}
		}
	}
}
