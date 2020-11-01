package com.java.array;

import java.util.Scanner;


class GetPair<T, U>{
	public final T first;
	public final U second;
	
	public GetPair(T first, U second){
		this.first = first;
		this.second = second;
	}
}

public class Second_Max_Element {

	public static GetPair<Integer, Integer> solve(int[] arr) {
		int maxi = Integer.MIN_VALUE;
		int secondMaxi = Integer.MIN_VALUE;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > maxi) {
				secondMaxi = maxi;
				maxi = arr[i];
			}
			else if(arr[i] < maxi && arr[i] > secondMaxi) {
				secondMaxi = arr[i];
			}
		}
		return new GetPair<>(maxi, secondMaxi);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		GetPair<Integer, Integer> pair = solve(arr);
		
		System.out.println(pair.first+" "+ pair.second);
		
		sc.close();

	}

}
