package com.java.array;

import java.util.ArrayList;
import java.util.Scanner;

public class EvenElement {

	public static ArrayList<Integer> solve(int[] nums){
		
		ArrayList<Integer> evenList = new ArrayList<>();
		
		for(int i = 0; i < nums.length; i++) {
			
			if(nums[i] % 2 == 0) {
				evenList.add(nums[i]);
			}
		}
		return evenList;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		ArrayList<Integer> ans = solve(arr);
		
		for(int i = 0; i < ans.size(); i++) {
			
			System.out.print(ans.get(i)+" ");
		}
		sc.close();
	}

}
