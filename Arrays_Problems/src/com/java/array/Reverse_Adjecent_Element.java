package com.java.array;

import java.util.Scanner;

public class Reverse_Adjecent_Element {
	
	public static void swapx(int[] arr, int i, int j) {
		
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		
		return;
	}
	
	public static void reverseAdjElement(int[] arr) {
		
		int size = arr.length / 2;
	
		int i = 0;
		int j = 1;
		
		while(size-->0) {
			
			swapx(arr, i, j);
			i += 2;
			j += 2;
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
		
		reverseAdjElement(arr);
		
		System.out.println("Output-----\n");
		
		for(int i = 0; i < n; i++) {
			System.out.print(arr[i]+" ");
		}
		sc.close();
	}

}
