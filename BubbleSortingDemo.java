package com.kn.arrays;

import java.util.Scanner;

public class BubbleSortingDemo {

	public static void main(String[] args) {
		
			Scanner scan =new Scanner(System.in);
			System.out.println("Enter the Size of array ");
			
			
//			Array Declaration & Creation
			int[] arr= new int[scan.nextInt()];
			
//			Array Initialization
			for(int i=0;i<arr.length;i++)
			{
				System.out.println("Enter "+(i+1)+ " Array elements to sort =");
				arr[i]=scan.nextInt();
			}
//			Create a Object of BubbleSorting()
			
			BubbleSorting sortingOfElements=new BubbleSorting();
			System.out.println("Array Before Sorting");
			for(int i:arr) {
				System.out.println(i+" ");
			}

//			Call Method
			System.out.println("Array After Sorting");
			int[] brr=sortingOfElements.bubbleSort(arr);
			for(int i:brr)
			{
				System.out.println(i+" ");
			}

			
//			Scan Closing
			scan.close();
	}



}
