package com.datastructure;

public class CircularLinkedListDriver {

	public static void main(String[] args) {

		CircularLinkedList list = new CircularLinkedList();

		list.insert(0);
		list.insert(5);
		list.insert(4);
		list.insert(2);
		list.delete(0);
		list.print();
	}

}
