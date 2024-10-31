package com.java.array;

//import java.util.Arrays;
import java.util.Scanner;


public class Max_Element {
	
	public static int largest(int[] arr) {
		
		int maxx = arr[0];
		
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] > maxx) {
				maxx = arr[i];
			}
		}
		return maxx;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of Array..");
		int n = sc.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Output-----\n");
		
//		System.out.println(Arrays.stream(arr).max().getAsInt());
		
		int maxi = largest(arr);
		System.out.println(maxi);
		
		sc.close();
	}

}
