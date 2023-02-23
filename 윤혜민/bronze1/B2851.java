package baekjoon;

import java.util.Scanner;

public class B2851 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] mushrooms = new int[10];
		for (int idx = 0; idx < 10; idx++) {
			mushrooms[idx] = sc.nextInt();
		}

		int sum = 0;
		int idx = 0;

		for (int i = 0; i < 10; i++) {
			sum += mushrooms[i];
			if (sum > 100) {
				idx = i;
				break;
			}
		}

		if (sum <= 100) {
			System.out.println(sum);
		} else if (sum - 100 <= 100 - sum + mushrooms[idx]) {
			System.out.println(sum);
		} else {
			System.out.println(sum - mushrooms[idx]);
		}
	}
}
