package com.datastructure;

public class DoublyLinkedListDriver {

	public static void main(String[] args) {

		DoublyLinkedList list = new DoublyLinkedList();

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

		System.out.println("Printing from beginning of Linkedlist");

		list.printFromBeginning();

		System.out.println();

		System.out.println("Printing from end of Linkedlist");
		list.printFromEnd();
	}
}
