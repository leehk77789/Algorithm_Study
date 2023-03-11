package day0304;

import java.util.Scanner;

public class BOJ_2920_음계_정유준 {
	static int[] arr;

	static boolean checkAscending() {
		for (int i = 0; i < 8; i++) {
			if (arr[i] != i + 1) {
				return false;
			}
		}
		return true;
	}

	static boolean checkDescending() {
		int num = 8;
		for (int i = 0; i < 8; i++) {
			if (arr[i] != num) {
				return false;
			}
			num--;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		arr = new int[8];
		for (int i = 0; i < 8; i++) {
			arr[i] = sc.nextInt();
		}
		if (checkAscending()) {
			System.out.println("ascending");
		} else if (checkDescending()) {
			System.out.println("descending");
		} else {
			System.out.println("mixed");
		}
	}
}
