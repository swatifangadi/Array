package com.kn.arrays;

import java.util.Scanner;

public class CountEvenOrOddElementsDemo {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the Size of array ");
		
		
//		Array Declaration & Creation
		int[] arr= new int[scan.nextInt()];
		
//		Array Initialization
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter "+(i+1)+ " Array elements =");
			arr[i]=scan.nextInt();
		}
//		Create a Object of CountEvenOrOddElements
		CountEvenOrOddElements countEvenOrOddElementsInArray=new CountEvenOrOddElements();
		countEvenOrOddElementsInArray.CountEvenOrOdd(arr);
		
//		scan closing
		scan.close();
	}
}
