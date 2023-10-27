package com.sunbeam;

import java.util.Arrays;

public class InsertionDesc 
{
	public static void insertionDesc(int arr[],int N)
	{
		int passes=0;
		int count=0;
		int flag;
		for(int i=1;i<N;i++)
		{
			passes++;
			flag=0;
			
			int temp=arr[i];
			int j=i-1;
			
			while(j>=0 && arr[j]<temp)
			{
				count++;
				arr[j+1]=arr[j];
				j--;
				flag=1;
			}
			arr[j+1]=temp;
			
		}
		System.out.println("No of comparisons ="+count);
		System.out.println("No of passes ="+passes);
		
		
	}

	public static void main(String[] args) 
	{
	   int arr[]= {99,44,77,22,44,11,66};
	  
	   
	   System.out.println("Array before sort"+Arrays.toString(arr));
	   insertionDesc(arr,arr.length);
	   System.out.println("Array after sort"+Arrays.toString(arr));

	}

}

//package com.sunbeam;

//import java.util.Arrays;
//
//public class InsertionDesc 
//{
//	public static void insertionDesc(int arr[],int N)
//	{
//		int passes=0;
//		int count=0;
//		int flag;
//		for(int i=N;i<0;i--)
//		{
//			passes++;
//			flag=0;
//			
//			int temp=arr[i];
//			int j=i+1;
//			
//			while(j>=0 && arr[j]>temp)
//			{
//				count++;
//				arr[j+1]=arr[j];
//				j++;
//				flag=1;
//			}
//			arr[j+1]=temp;
//			
//		}
//		System.out.println("No of comparisons ="+count);
//		System.out.println("No of passes ="+passes);
//		
//		
//	}
//
//	public static void main(String[] args) 
//	{
//	   int arr[]= {99,44,77,22,44,11,66};
//	  
//	   
//	   System.out.println("Array before sort"+Arrays.toString(arr));
//	   insertionDesc(arr,arr.length);
//	   System.out.println("Array after sort"+Arrays.toString(arr));
//
//	}
//
//}


