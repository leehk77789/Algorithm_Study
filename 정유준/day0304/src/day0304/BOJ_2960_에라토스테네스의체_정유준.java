package day0304;

import java.util.Scanner;

public class BOJ_2960_에라토스테네스의체_정유준 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int count = 0;

		int num = sc.nextInt();

		boolean[] nums = new boolean[num + 1];

		int answerIdx = sc.nextInt();

		for (int i = 2; i <= num; i++) {
			nums[i] = true;
		}

		outer: for (int i = 2; i <= num; i++) {
			for (int j = i; j <= num; j += i) {
				if (!nums[j]) {
					continue;
				}
				nums[j] = false;
				count++;
				if (count == answerIdx) {
					System.out.println(j);
					break outer;
				}
			}
		}
	}
}
