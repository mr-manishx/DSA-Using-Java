package easy.array.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Two_Sum {
	
	public static int[] solve(int[] arr, int target) {
		
		Map<Integer, Integer> mp = new HashMap<Integer, Integer>();	
		for(int i = 0; i < arr.length; i++) {
			
			int remain = target - arr[i];
			if(mp.containsKey(remain)) {
				
				return new int[] {mp.get(remain), i};
			}
			mp.put(arr[i], i);
		}
		
		return new int[] {-1, -1};
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of Array..");
		int n = sc.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Target Element..");
		int target = sc.nextInt();
		
		System.out.println("Output-----\n");
		
		int[] ans = solve(arr, target);
		
		System.out.println(ans[0]+" "+ans[1]);
		
		
		sc.close();
		
	}
}
