package com.kn.arrays;

public class SelectionSort {
public int[] selectionSort(int[] arr) {
	for(int i=0;i<arr.length;i++) {
		int min=arr[i],index=i;
		for(int j=i+1;j<arr.length;j++) {
			if(min>arr[j]) {
				min=arr[j];
				index=j;
			}
		}
		int temp=arr[i];
		arr[i]=min;
		arr[index]=temp;
	}
	return arr;
	
}
}