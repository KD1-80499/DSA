package com.sunbeam;

import java.util.Arrays;

public class EmployeeSort {
	
	public static void bubbleSort(Employee arr[],int size,double salary)
	{
		int count=0;
		int passes=0;

		
		for(int i=1;i<size;i++)
		{
			passes++;
		
			for(int j=0;j<size-1;j++)
			{
				count++;
				if(arr[j].getSalary()>arr[j+1].getSalary())
				{
					Employee temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;

				}
			}	
			
		}
		
	}

	public static void main(String[] args) 
	{
	   Employee[] arr=new Employee[5];
	  
	   arr[0]=new Employee(1,"e1",1000);
	   arr[1]=new Employee(5,"e5",5000);
	   arr[2]=new Employee(3,"e3",3000);
	   arr[3]=new Employee(2,"e2",2000);
	   arr[4]=new Employee(4,"e4",4000);
	  
	   Employee e=new Employee();
	   
	   System.out.println("Salary before sort"+Arrays.toString(arr));
	   bubbleSort(arr,arr.length,e.getSalary());
	   System.out.println("Salary after sort"+Arrays.toString(arr));
	   
	   

	}

}
