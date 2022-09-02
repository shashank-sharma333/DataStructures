package com.datastructure;

import org.w3c.dom.Node;

public class SinglyLinkedListDriver {

	public static void main(String[] args) {

		SinglyLinkedList list = new SinglyLinkedList();

		list.insert(0);
		list.insert(5);
		list.insert(4);
		list.insert(2);

		list.push(-1);

		if (list.delete(5)) {
			System.out.println("Element successfully deleted");
		}

		else {
			System.out.println("Element cannot be deleted");
		}
		
		list.printLinkedList();
		
		System.out.println(list.count());
	}

}
