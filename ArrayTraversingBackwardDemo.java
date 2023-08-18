package com.kn.arrays;

import java.util.Scanner;

public class ArrayTraversingBackwardDemo {

	public static void main(String[] args) {
		
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter the size of the array");
//			Array Declaration & Creation
			int[] arr=new int[scan.nextInt()];
			
//			Array initialization
			for(int i=0;i<arr.length;i++)
			{
				System.out.println("Enter " +(i+1) + " the Array Elements");
				arr[i]=scan.nextInt();
			}
		
//			Object Creation
			ArrayTraversingBackward arrayTraversing=new ArrayTraversingBackward();
			arrayTraversing.printArrayElementsReverse(arr);
			
//			scan closing
			scan.close();

	}

}
