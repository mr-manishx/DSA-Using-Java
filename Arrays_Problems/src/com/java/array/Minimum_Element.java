package com.java.array;

import java.util.Scanner;

public class Minimum_Element {
	
	public static int findMinElement(int[] nums) {
		
		int maxi = Integer.MAX_VALUE;
		
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] < maxi) {
				maxi = nums[i];
			}
		}
		
		return maxi;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int ans = findMinElement(arr);
		
		System.out.println(ans);
		
		sc.close();

	}

}
