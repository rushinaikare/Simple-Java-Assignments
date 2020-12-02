package com.hackerRank;

import java.util.Scanner;

public class MaxDiffBetweenAdjacentNum {

	public int maxDiffBetweenAdjc(int arr[]) {
		int diff = 0;
		for (int i = 0; i < arr.length - 1; i++) {

			int diff1 = arr[i + 1] - arr[i];
			if (diff1 > diff) {
				diff = diff1;
			}
		}
		return diff;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array ");
		int n = sc.nextInt();
		System.out.println("Enter numbers");
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		MaxDiffBetweenAdjacentNum m = new MaxDiffBetweenAdjacentNum();
		System.out.println("Maximum difference between adjacent number in array" + m.maxDiffBetweenAdjc(arr));
		sc.close();
	}

}
