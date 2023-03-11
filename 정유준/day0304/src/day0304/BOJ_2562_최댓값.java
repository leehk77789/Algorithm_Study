package day0304;

import java.util.Scanner;

public class BOJ_2562_최댓값 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[9];
		for (int i = 0; i < 9; i++) {
			num[i] = sc.nextInt();
		}
		int max = 0;
		int idx = 0;
		for (int i = 0; i < 9; i++) {
			if (num[i] > max) {
				max = num[i];
				idx = i;
			}
		}
		System.out.println(max);
		System.out.println(idx + 1);
	}
}
