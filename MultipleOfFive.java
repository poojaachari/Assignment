package Assignment;

import java.util.Scanner;

public class MultipleOfFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the array elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		printMultiples(arr);

	}

	public static void printMultiples(int arr[]) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 5 == 0) {

				count++;
			}
		}
		System.out.println(count);
	}

}
