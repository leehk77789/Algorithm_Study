package bochung;

import java.util.Scanner;

public class SWEA1986 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		for (int i = 1; i <= testCase; i++) {
			int N = sc.nextInt();
			int sum = 0;
			for (int idx = 1; idx <= N; idx++) {
				if (idx % 2 == 0) {
					sum -= idx;
				} else {
					sum += idx;
				}
			}
			System.out.println("#" + i + " " + sum);
		}
	}
}
