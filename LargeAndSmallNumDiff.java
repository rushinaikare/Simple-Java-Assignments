package com.hackerRank;

import java.util.Scanner;

public class LargeAndSmallNumDiff {

	public int largeAndSmallNumDiff(int arr[]) {
		int smallNum = arr[0];
		int largeNum = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < smallNum) {
				smallNum = arr[i];
			}
			if (arr[i] > largeNum) {
				largeNum = arr[i];
			}
		}
		return largeNum - smallNum;
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

		LargeAndSmallNumDiff d = new LargeAndSmallNumDiff();
		System.out.println("Difference between large and small number in array  "+d.largeAndSmallNumDiff(arr));
		sc.close();
	}

}
