package com.sunbeam;

import java.util.Arrays;

public class SelectionSort 
{
	public static void selectionSort(int arr[],int N)
	{ 
		int count=0;
		int passes=0;
	
		for(int i=0;i<N-1;i++)
		{	  
			passes++;
			
		  for(int j=i+1;j<N;j++)
		  {
			  count++; 
			  
			  if(arr[i]>arr[j])
			  {
				  int temp=arr[i];
				  arr[i]=arr[j];
				  arr[j]=temp;
			  }
		  }
		}
		System.out.println("No of comparsions="+count);
		System.out.println("No of passes="+passes);
	}

	public static void main(String[] args)
	{
		int arr[]= {99,11,88,22,77};
		
		
		System.out.println("Array before sort"+Arrays.toString(arr));
		selectionSort(arr,arr.length);
		System.out.println("Arrays after sort"+Arrays.toString(arr));
		

	}

}
