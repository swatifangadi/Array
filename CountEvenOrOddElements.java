package com.kn.arrays;

public class CountEvenOrOddElements {
	public void CountEvenOrOdd(int[] arr) {
		System.out.println("******");
		int evenCounter = 0, oddCounter = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0)
				evenCounter++;
			else
				oddCounter++;
		}
		System.out.println("Even Counter =" + evenCounter);
		System.out.println("Odd Counter =" + oddCounter);
	}
}
