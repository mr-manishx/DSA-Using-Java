package com.java.array;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Remove_Duplicate_From_Array {
	
	public static int usingSet(int[] arr) {
		
		Set<Integer> set = new HashSet<>();
		
		for(int it = 0; it < arr.length; it++) {
			set.add(arr[it]);
		}
		return set.size();
	}
	
	public static int solve(int[] arr) {
		
		int count = 1;
		for(int i = 0; i < arr.length-1; i++) {
			if(arr[i] != arr[i+1]) {
				count ++;
			}
		}
		return count;
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
		
//		int ans = solve(arr);
//		System.out.println(ans);
		
//		using set data structure/
		
		int result = usingSet(arr);
		
		System.out.println(result);
		
		sc.close();
	}

}
