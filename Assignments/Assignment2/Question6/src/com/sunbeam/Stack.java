package com.sunbeam;

public class Stack 
{
	private int arr[];
	private int top;
	private final int SIZE=3;
	
	public Stack(int size)
	{
		arr=new int[SIZE];
		top=SIZE;
	}
	
	public void push(int data)
	{
		top--;
		arr[top]=data;
	}
	
	public int pop()
	{
		int data=arr[top];
		top--;
		return data;
	}
	
	public int peek()
	{
		return arr[top];
	}
	
	public boolean isEmpty()
	{
		return top==SIZE-1;
	}
	
	public boolean isFull()
	{
		return top==0;
	}
	
	
	public void display()
	{
		for(int i = SIZE-1;i>=0;i--)
		{
			System.out.println("Elements in the stack : "+arr[i]);
		}
	}

}
