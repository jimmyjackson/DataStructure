package org.ds.core;

public class Test {
	public static void main(String[] args) {
//		BTree bt = new BTree();
//		bt.insertItem(100);
//		bt.insertItem(50);
//		bt.insertItem(150);
//		bt.insertItem(75);
//		bt.insertItem(185);
//
//		bt.showAll(bt.findNode(150));
//		System.out.println();
//		bt.getData(bt.findParentNode(75));

		Person p1 = new Person(104, "Khushi", 6795);
		Person p2 = new Person(102, "Vinit", 3874);
		Person p3 = new Person(103, "Abhi", 7467);
		Person p4 = new Person(101, "Jimmy", 9621);
		Person p5 = new Person(105, "Nannu", 9580);

		PersonBT pbt = new PersonBT();
		pbt.insertBT(p1);
		pbt.insertBT(p2);
		pbt.insertBT(p3);
		pbt.insertBT(p4);
		pbt.insertBT(p5);

		pbt.showAll(pbt.findNode(p1));
		System.out.println();
		pbt.getData(pbt.findNode(p3));
	}
}
