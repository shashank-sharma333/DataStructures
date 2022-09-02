package com.datastructure;

public class DoublyLinkedList {

	Node head = null;

	Node prev, next;

	public void insert(int element) {

		Node new_node = new Node(element);
		Node temp = head;

		if (head == null) {
			new_node.prev = null;
			head = new_node;
			return;
		}

		while (temp.next != null) {

			temp = temp.next;
		}

		temp.next = new_node;

		new_node.prev = temp;
	}

	public boolean delete(int element) {

		Node temp = head;
		if (head == null) {
			System.out.println("Linkedlist is Empty. Node cannot be deleted");
			return false;
		}

		while (temp != null) {

			if (temp.data == element) {
				if (temp.next != null) {

					temp.prev.next = temp.next;
					temp.next.prev = temp.prev;
					return true;
				}

				if (temp.next == null) {
					temp.prev.next = null;
					return true;
				}
			}

			temp = temp.next;
		}

		return false;

	}

	public void printFromBeginning() {

		Node temp = head;

		if (head == null) {
			System.out.println("Empty List. Cannot be traversed");
		}

		while (temp != null) {

			System.out.println(temp.data);
			temp = temp.next;
		}

	}

	public void printFromEnd() {

		Node temp = head;

		if (head == null) {
			System.out.println("Empty List. Cannot be traversed");
		}

		while (temp.next != null) {
			temp = temp.next;
		}

		Node revDirection = temp;

		while (revDirection != null) {

			System.out.println(revDirection.data);
			revDirection = revDirection.prev;
		}

	}

	public void push(int element) {

		Node new_node = new Node(element);
		Node temp = head;

		if (temp == null) {
			head = new_node;
			return;
		}

		else {
			head.prev = new_node;
			new_node.next = head;
			head = new_node;
		}

	}

}