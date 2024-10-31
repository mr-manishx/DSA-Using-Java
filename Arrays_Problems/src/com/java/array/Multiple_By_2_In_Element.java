package com.java.array;

import java.util.ArrayList;
import java.util.Scanner;

public class Multiple_By_2_In_Element {
	
	public static ArrayList<Integer> solve(int[] nums) {
		
		ArrayList<Integer> arlist = new ArrayList<>();
		
		for(int i = 0; i < nums.length; i++) {
			arlist.add(nums[i]*2);
		}
		
		return arlist;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		ArrayList<Integer> ans = solve(arr);
		
		for(int i = 0; i < ans.size(); i++) {
			System.out.print(ans.get(i) +" ");
		}
		sc.close();
	}
}
