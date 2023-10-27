package com.sunbeam;

import java.util.Arrays;

public class BubbleSort
{
	public static void bubbleSort(int arr[],int N)
	{
		int count=0;
		int passes=0;
		int flag;
		
		for(int i=1;i<N;i++) 
		{
			passes++;
		    flag=0;
		    for(int j=0;j<N-1;j++)
		    {
		    	count++;
		    	if(arr[j]>arr[j+1])
		    	{
		    		int temp=arr[j];
		    		arr[j]=arr[j+1];
		    		arr[j+1]=temp;
		    		flag=1;
		    	}
		    }
		    if(flag==0)
		    	break;
		}
		System.out.println("No. of comparisons:"+count);
		System.out.println("No. of passes:"+passes);
		
	}

	public static void main(String[] args) 
	{
		int arr[]= {99,22,88,11,77,43};
		
		System.out.println("Array before sort"+Arrays.toString(arr));
		bubbleSort(arr,arr.length);
		System.out.println("Array after sort"+Arrays.toString(arr));
	}

}
