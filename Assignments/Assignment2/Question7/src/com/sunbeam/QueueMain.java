package com.sunbeam;

import java.util.Scanner;

public class QueueMain {

	public static void main(String[] args) {
		LinearQueue l = new LinearQueue();

		int choice;

		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("0.Exit");
			System.out.println("1.Push");
			System.out.println("2.Pop");
			System.out.println("3.Peek");
			System.out.println("Enter choice");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				if (l.isFull()) {
					System.out.println("Queue is full");
				} else {
					System.out.println("Enter data");
					int data = sc.nextInt();
					l.push(data);
				}
				break;
			case 2:
				if (l.isEmpty())
					System.out.println("Queue is Empty");
				else
					l.pop();
				break;
			case 3:
				if (l.isEmpty())
					System.out.println("Queue is Empty");
				else
					System.out.println("Peeked Data : " + l.peek());
				break;
			}
		} while (choice != 0);

	}

}
