package com.kn.arrays;

import java.util.Scanner;

public class ArrayMergingDemo {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the size of the arr:");
//		 Array Declaration & Creation
		int[] arr= new int[scan.nextInt()];
		System.out.println("Enter the size of the brr ");
		int [] brr=new int[scan.nextInt()];
		
//		Array Initialization
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter "+(i+1)+"arr data");
			arr[i]=scan.nextInt();
		}
		for(int i=0;i<brr.length;i++)
		{
			System.out.println("Enter "+(i+1)+"brr data");
			brr[i]=scan.nextInt();
		}
//		Object Creation
		ArrayMerging arrayMerging=new ArrayMerging();
		arrayMerging.MergeOfArrays(arr, brr);
//		Call Method	

	}

}
