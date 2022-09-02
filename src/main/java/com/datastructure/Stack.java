package com.datastructure;

import com.constants.NumberConstants;

public class Stack {

	static final int size = NumberConstants.HUNDRED;
	int stack[] = new int[size]; // Maximum size of Stack
	int top = -1;

	int peek() {
		if (stack.length == NumberConstants.MINUS_ONE) {
			System.out.println("Stack UnderFlow");
			return NumberConstants.MINUS_ONE;
		}

		else {

			return stack[top];

		}
	}

	boolean push(int element) {
		if (stack.length == size - 1) {
			System.out.println("Stack Overflow");
			return false;
		}

		else {
			stack[++top] = element;
			return true;
		}
	}

	boolean pop() {
		if (stack.length == NumberConstants.MINUS_ONE) {
			System.out.println("Stack UnderFlow");
			return false;
		}

		else {
			top--;
			return true;

		}
	}

	boolean isEmpty() {
		return (top < 0);
	}
}
