package com.kn.arrays;

public class BubbleSort2 {

	public static void main(String[] args) {
		int[] arr= {48,32,64,9,17,96,5};
		System.out.println("Before Sorting");
		for(int i:arr)
		{
			System.out.println(i+" ");
		}
		for(int i=0;i<arr.length;i++)
		{
			int count=0;
			for(int j=0;j<arr.length-1-i;j++) {
				int temp=0;
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					count =1;
				}
			}
		if(count==0)
			break;
		}
//		 Array Traversing
		System.out.println();
		System.out.println("*****");
		System.out.println("After Sorting");
		for(int i:arr)
		{
			System.out.println(i+" ");
		}

	}

}
