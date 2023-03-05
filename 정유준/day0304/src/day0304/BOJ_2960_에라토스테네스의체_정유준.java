package day0304;

import java.util.Scanner;

public class BOJ_2960_에라토스테네스의체_정유준 {
	static int[] nums;
	static int count;
	static int answerIdx;

	static void checkSosu(int num) {
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				deleteNum(num);
			}
		}
	}

	static void deleteNum(int num) {
		for (int i = 1; i < nums.length; i++) {
			if (i % num == 0) {
				if (nums[i] != 0) {
					continue;
				} else {
					nums[i]++;
					count++;
				}
			}
			if (count == answerIdx) {
				System.out.println(i);
				return;
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		count = 0;

		int num = sc.nextInt();
		nums = new int[num + 1];

		answerIdx = sc.nextInt();

		for (int i = 0; i < nums.length; i++) {
			checkSosu(i);
		}
	}
}
