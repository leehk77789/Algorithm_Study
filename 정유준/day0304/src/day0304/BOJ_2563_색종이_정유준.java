package day0304;

import java.util.Scanner;

public class BOJ_2563_색종이_정유준 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[][] map = new int[101][101];

		int paperCount = sc.nextInt();
		for (int i = 1; i <= paperCount; i++) {
			int left = sc.nextInt() + 1;
			int bottom = sc.nextInt() + 1;
			for (int col = left; col < left + 10; col++) {
				for (int row = bottom; row < bottom + 10; row++) {
					map[col][row] = 1;
				}
			}
		}
		int count = 0;
		for (int i = 0; i < 101; i++) {
			for (int j = 0; j < 101; j++) {
				if (map[i][j] == 1) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
