package com.datastructure;

public class CircularLinkedList {

	Node head = null;

	public void insert(int element) {

		Node new_node = new Node(element);

		Node temp = head;

		if (head == null) {
			head = new_node;
			head.next = head;
			return;
		}

		while (temp.next != head) {
			temp = temp.next;
		}

		temp.next = new_node;
		new_node.next = head;

	}

	public void print() {

		Node temp = head;

		do {
			System.out.println(temp.data);
			temp = temp.next;
		} while (temp != head);

	}

	public boolean delete(int element) {

		Node temp = head;
		Node prev = temp;

		if (head == null) {
			System.out.println("Linkedlist is empty!. Element cannot be deleted");
			return false;
		}

		while (temp.next != null) {

			if (temp.data == element) {

				if (temp == head) {
					head = head.next;
					return true;
				}
				prev.next = temp.next;
				return true;
			}

			prev = temp;
			temp = temp.next;
		}

		if (temp == null)
			System.out.println("Element not found");

		return false;
	}

}
