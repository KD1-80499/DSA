package com.sunbeam;

import java.util.Scanner;

public class CircularQueueMain {
	
	public static void main(String[] args) {
		CircularQueue c = new CircularQueue();
		int choice;

		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("0. Exit\n1. Push\n2. Pop\n3. Peek");
			System.out.print("Enter your choice : ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				if (c.isFull())
					System.out.println("Queue is full");
				else {
			
					System.out.print("Enter data : ");
					int data = sc.nextInt();
					c.push(data);
				}
				break;
			case 2:
				if (c.isEmpty())
					System.out.println("Queue is Empty");
				else
			
					c.pop();
				break;
			case 3:
				if (c.isEmpty())
					System.out.println("Queue is Empty");
				else
					System.out.println("Peeked Data : " + c.peek());
				break;
			}
		} while (choice != 0);

		sc.close();

	}
}
