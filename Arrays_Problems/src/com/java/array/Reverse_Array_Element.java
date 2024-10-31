package com.java.array;

import java.util.Scanner;

public class Reverse_Array_Element {
	
	public static void swapx(int[] arr, int left, int right) {
		
		int temp = arr[left];
		arr[left] = arr[right];
		arr[right] = temp;
	 
		return;
	}
	public static void reverseArray(int[] arr) {
		
		int left = 0;
		int right = arr.length-1;
		
		while(left < right) {
			swapx(arr, left, right);
			left++;
			right--;
		}
		return;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of Array..");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		reverseArray(arr);
		
		for(int i = 0; i < n; i++) {
			System.out.print(arr[i]+" ");
		}
		sc.close();
	}

}
