package com.kn.arrays;

public class ArrayTraversingBackward {
	public void printArrayElementsReverse(int[]arr) {
//		Method to call Printing Elements
		System.out.println("*********");
		System.out.println("Array Elements Are As Follows");
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+ " ");
		}
}
}
