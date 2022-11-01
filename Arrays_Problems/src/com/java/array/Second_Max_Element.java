package com.java.array;

import java.util.Scanner;

class Pair<T, U> {
    public final T first;
    public final U second;

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }
}

public class Second_Max_Element {

    public static Pair<Integer, Integer> solve(int[] arr) {
        int maxi = Integer.MIN_VALUE;
        int secondMaxi = Integer.MIN_VALUE;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxi) {
                secondMaxi = maxi;
                maxi = arr[i];
            } else if (arr[i] < maxi && arr[i] > secondMaxi) {
                secondMaxi = arr[i];
            }
        }
        return new Pair<>(maxi, secondMaxi);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Pair<Integer, Integer> pair = solve(arr);

        System.out.println("Maximum Element: " + pair.first);
        System.out.println("Second Maximum Element: " + pair.second);

        sc.close();
    }
}
