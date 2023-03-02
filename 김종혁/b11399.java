package baekjoon;

import java.util.Scanner;

public class b11399 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int people = sc.nextInt();

		int[] list = new int[people];
		for (int i = 0; i < people; i++) {
			int min = sc.nextInt();

			list[i] = min;
		}
		// 정렬
		for (int i = 1; i < people; i++) {
			for (int j = 0; j < people - i; j++) {
				if (list[j] > list[j + 1]) {
					int temp = list[j];
					list[j] = list[j + 1];
					list[j + 1] = temp;
				}
			}
		}
		// 누적
		for (int k = 1; k < people; k++) {
			list[k] += list[k - 1];
		}

		// 총합
		int time = 0;
		for (int p : list) {
			time += p;
		}
		System.out.println(time);
	}
}
