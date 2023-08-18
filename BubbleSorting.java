package com.kn.arrays;

public class BubbleSorting {
public int[] bubbleSort(int[] arr) {
//	Array Traversing
	for(int i=0;i<arr.length;i++)
	{
		boolean isSwapped = false;
		for(int j=0;j<arr.length-1-i;j++)
		{
			if(arr[j]>arr[j+1])
			{
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				isSwapped = true;
			}
		if(isSwapped==false) {
			break;
		}
	}
	}
	
	return arr;
}
}
