package com.hackerRank;

import java.util.Scanner;

public class OddEvenDiff {

	public int oddEvenDiff(int arr[]) {
		int oddsum = 0;
		int evensum = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				evensum = arr[i] + evensum;
			} else
				oddsum = arr[i] + oddsum;
		}
		return oddsum - evensum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int n = sc.nextInt();
		System.out.println("enter numbers");
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		OddEvenDiff od = new OddEvenDiff();
		System.out.println("Difference between sum of odd and sum of even numbers "+od.oddEvenDiff(arr));
		;
		sc.close();
	}

}
