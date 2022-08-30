package com.datastructure;

import com.constants.NumberConstants;

public class StackDriver {

	public static void main(String[] args) {

		 //initializing Stack 
		 Stack numbers = new Stack();		 
		 numbers.push(20);
		 System.out.println(numbers.peek());
		 numbers.pop();		
		 numbers.pop();
		 System.out.println(numbers.pop());

		 
	}

	

}
