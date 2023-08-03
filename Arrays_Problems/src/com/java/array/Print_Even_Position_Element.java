package com.java.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Print_Even_Position_Element {

    public static List<Integer> solve(int[] nums){

        List<Integer> templist = new ArrayList<>();

        for(int i = 0; i < nums.length; i++){
            if(i%2 == 0){
                templist.add(nums[i]);
            }
        }
        return templist;
    }
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];

        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }

        List<Integer> ans = solve(nums);

        ans.forEach(item->System.out.print(item+" "));

        sc.close();

    }

}
