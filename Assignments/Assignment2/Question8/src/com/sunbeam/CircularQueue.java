package com.sunbeam;

public class CircularQueue 
{
	private int arr[];
	private int front,rear;
	private final int SIZE=5;
	int count=0;
	
	public CircularQueue()
	{
		arr = new int[SIZE];
		front = -1;
		rear = -1;
	}
	
	public void push(int data)
	{
		count++;
		rear = (rear + 1) % SIZE;
		// b. add data at rear index
		arr[rear] = data;
	}
	
	public void pop()
	{
		count--;
		front = (front + 1) % SIZE;
		if(front == rear)
			front = rear = -1;
	}
	
	public int peek()
	{
		return arr[(front + 1) % SIZE];
	}
	
	public boolean isFull()
	{
		return count==SIZE;
	}
	public boolean isEmpty()
	{
		return count==0;
	}
	

}
