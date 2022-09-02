package com.datastructure;

import com.constants.NumberConstants;

public class Queue {

	int front = -1, rear = -1;
	int numbers[] = new int[NumberConstants.HUNDRED];

	public void enQueue(int element) {

		if (isFull()) {
			System.out.println("Queue is Full");
		}

		else {
			if (front == -1) {
				front = 0;
			}

			rear++;
			numbers[rear] = element;
			System.out.println("Element inserted");
		}
	}

	boolean isFull() {
		if (front == 0 && rear == NumberConstants.HUNDRED - 1) {

			System.out.println("Queue is Full");
			return true;
		}

		return false;
	}

	boolean isEmpty() {
		if (front == -1) {
			return true;
		}

		else {
			return false;
		}
	}

	int deQueue() {
		int element = 0;
		if (isEmpty()) {
			System.out.println("Queue is Empty. Element cannot be deleted");
		}

		else {

			element = numbers[front];

			if (front >= rear) {
				front++;
				rear++;
			}

			else {
				front++;
			}

		}

		System.out.println(element + "is deleted");

		return element;

	}

	void displayQueue() {

		int counter;

		if (isEmpty()) {
			System.out.println("Queue is Empty");
		}

		else {

			for (counter = front; counter <= rear; counter++) {
				System.out.println(numbers[counter]);
			}
		}

	}
}
