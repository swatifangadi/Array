package com.kn.arrays;

import java.util.Scanner;

public class MergeOf3Arrays {

	public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	System.out.println("Enter the Size  of Array arr");
//	Array Declaration & Creation
	int[] arr=new int[scan.nextInt()];
	System.out.println("Enter he Size of Array brr");
	int[] brr=new int[scan.nextInt()];
	System.out.println("Enter he Size of Array crr");
	int[] crr=new int[scan.nextInt()];
//	Array Initialization
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
	for(int i=0;i<crr.length;i++)
	{
		System.out.println("Enter "+(i+1)+"crr data");
		crr[i]=scan.nextInt();
	}
	}	
	
	

//	int drr[]=mergeOfThreeArray(arr,brr,crr);

	static int mergeOfThreeArray(int[] arr, int[] brr,int[] crr) {
	int[] drr=new int[arr.length+brr.length+crr.length];
	for(int i=0;i<arr.length;i++)
	{
		drr[i]=arr[i];
	}
	for(int i=0;i<brr.length;i++)
	
		{
			drr[i]=brr[i];
			i++;
		}
	for(int i=0;i<crr.length;i++)
	{
		
	}
	
		return 0;
	}

}
