package com.java.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Odd_Position_Element {
	
	public static List<Integer> solve(int[] nums){
		
		List<Integer> list = new ArrayList<>();
		
		for(int i = 0; i < nums.length; i++) {
			if(i%2 != 0) {
				list.add(nums[i]);
			}
		}
		return list;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] nums = new int[n];
		
		for(int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
		}
		List<Integer> ans = solve(nums);
		
		ans.forEach(item->System.out.print(item+" "));
		
		sc.close();

	}

}
