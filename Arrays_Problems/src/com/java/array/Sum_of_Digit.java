package com.java.array;

import java.util.Arrays;
import java.util.Scanner;

public class Sum_of_Digit {
	
	public static int solve(int[] arr) {
		
		return Arrays.stream(arr).sum();
		
//		int sum = 0;
//		for(int i = 0; i < arr.length; i++) {
//			sum = sum + arr[i];
//		}
//		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int ans = solve(arr);
		
		System.out.println(ans);
		
		sc.close();
	}

}
