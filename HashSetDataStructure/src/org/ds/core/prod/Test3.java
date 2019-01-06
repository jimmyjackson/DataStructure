package org.ds.core.prod;

public class Test3 {
	public static void main(String[] args) {
		ProductHashset phs = new ProductHashset();
		Product prod1 = new Product("B-2018-452", "Abhi", 1111);
		Product prod2 = new Product("B-2018-152", "Khushi", 2222);
		Product prod3 = new Product("B-2018-953", "Nannu", 3333);
		Product prod4 = new Product("B-2018-758", "Jimmy", 4444);
		Product prod5 = new Product("B-2018-123", "Vinit", 5555);

		phs.insertProduct(phs.toHashCode(prod1.getPid()), prod1);
		phs.insertProduct(phs.toHashCode(prod2.getPid()), prod2);
		phs.insertProduct(phs.toHashCode(prod3.getPid()), prod3);
		phs.insertProduct(phs.toHashCode(prod4.getPid()), prod4);
		phs.insertProduct(phs.toHashCode(prod5.getPid()), prod5);

		phs.displayAll();
		System.out.println("------------------------------------------------");

		phs.deleteProduct(prod4.getPid());
		phs.displayAll();
		System.out.println("------------------------------------------------");

	}
}
