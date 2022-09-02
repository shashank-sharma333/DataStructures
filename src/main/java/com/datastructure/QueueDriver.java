package com.datastructure;

public class QueueDriver {

	public static void main(String[] args) {

		Queue numbers = new Queue();

		numbers.enQueue(5);
		numbers.enQueue(4);
		numbers.enQueue(6);
		numbers.enQueue(9);
		numbers.enQueue(2);
		numbers.enQueue(1);
		numbers.deQueue();
		numbers.deQueue();
		numbers.displayQueue();
	}

}
