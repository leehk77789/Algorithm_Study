package day0304;

import java.util.Scanner;

public class BOJ_1978_소수찾기_정유준 {
	static int[] arr;

	static boolean findSosu(int a) {
		for (int i = 2; i < a; i++) {
			if (a % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numAmount = sc.nextInt();

		arr = new int[numAmount];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			if (findSosu(arr[i]) && arr[i] != 1) {
				count++;
			}
		}

		System.out.println(count);
	}
}
