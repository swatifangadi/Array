package com.kn.arrays;
import java.util.Scanner;
public class SumOfElementsDemo {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Size Of the Array");
		
//		Array Declaration & Creation
		int[] arr= new int[scan.nextInt()];
		
//		Array Initialization
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter "+(i+1)+ " Array elements =");
			arr[i]=scan.nextInt();
		}
		
//		Create object of 
		SumOfArrays sumofelements=new SumOfArrays();
		
//		call method
		System.out.println("Sum Of Array Elements =" +sumofelements.sumOfArrayElements(arr));
		
//		Scan Closing
		scan.close();
		
	}

}
