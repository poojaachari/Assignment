package com.acharya.classes;

import java.util.Scanner;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[3][3];
		System.out.println("Enter the numbers");

		int count1to50 = 0;
		int count50to100 = 0;
		int count100 = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				arr[i][j] = sc.nextInt();
				if (arr[i][j] >= 1 && arr[i][j] <= 50) {
					count1to50++;
				} else if (arr[i][j] >= 51 && arr[i][j] <= 100) {
					count50to100++;
				} else if (arr[i][j] < 100) {
					count100++;
				}

			}

		}
		System.out.println("In the above array there are " + count1to50 + " number between 1 to 50");
		System.out.println("In the above array there are " + count50to100 + " number between 50 to 100");
		System.out.println("In the above array there are " + count100 + " number above 100");

	}
}
