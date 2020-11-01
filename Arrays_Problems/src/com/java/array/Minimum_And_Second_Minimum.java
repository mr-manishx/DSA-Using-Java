package com.java.array;


import java.util.Scanner;

import com.java.array.pair.Pair;
//
//class Pair<T, U>{
//	public final T firstElement;
//	public final U secondElement;
//	
//	public Pair(T firstElement, U secondElement) {
//		this.firstElement = firstElement;
//		this.secondElement = secondElement;
//	}
//}

public class Minimum_And_Second_Minimum {
	
	public static Pair<Integer, Integer> solve(int[] nums){
		
		int mini = Integer.MAX_VALUE;
		int secondMini = Integer.MAX_VALUE;
		
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] < mini) {
				secondMini = mini;
				mini = nums[i];
			}
			else if(nums[i] > mini && nums[i] < secondMini) {
				secondMini = nums[i];
			}
		}
		
		return new Pair<>(mini, secondMini);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] nums = new int[n];
		
		for(int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
		}
		
		Pair<Integer, Integer> pair = solve(nums);
		
		System.out.println("Minimum Element: "+pair.first);
		System.out.println("Second Minimum Element: "+pair.second);
		
		sc.close();
		
	}

}
