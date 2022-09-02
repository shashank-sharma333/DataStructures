package com.datastructure;

public class SinglyLinkedList {

	Node head = null;

	// inserts element at beginning of Linkedlist
	public void push(int element) {

		Node first = new Node(element);
		first.next = head;
		head = first;
	}

	// insert element in linkedlist
	public void insert(int element) {

		Node insert_value = new Node(element);

		if (head == null) {
			head = insert_value;
			return;
		}

		insert_value.next = null;

		Node temp = head;

		while (temp.next != null) {
			temp = temp.next;
		}

		temp.next = insert_value;
		insert_value.next = null;
		return;

	}

	// prints the linkedlist
	public void printLinkedList() {

		Node temp = head;

		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

	public boolean delete(int element) {
		Node temp = head, prev = null;

		if (head == null) {
			System.out.println("Linkedlist is Empty");
			return false;
		}

		while (temp.next != null) {

			if (temp.data == element) {
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

	public int count() {
		Node temp = head;
		int count = 0;

		while (temp != null) {
			count++;
			temp = temp.next;
		}

		return count;

	}
}
