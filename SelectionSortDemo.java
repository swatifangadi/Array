package com.kn.arrays;

import java.util.Scanner;

public class SelectionSortDemo {

	public static void main(String[] args) {
		
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter the Size of Array");
//			Array Declaration &Creation
			int[] arr=new int[scan.nextInt()];
			
			System.out.println("Enter the Data");
			for(int i=0;i<arr.length;i++) {
				arr[i]=scan.nextInt();
			}
//			Object
			SelectionSort sort=new SelectionSort();
			int[] brr=sort.selectionSort(arr);
			
			System.out.println("The Sorted aray is ");
			for(int i=0;i<brr.length;i++) {
				System.out.println(brr[i]);
			}

	scan.close();
	}

}
