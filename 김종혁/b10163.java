package baekjoon;

import java.util.Scanner;

public class b10163 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[][] flat = new int[1001][1001];

		int num = sc.nextInt();

		int d = 1;
		for (int i = 1; i <= num; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int width = sc.nextInt();
			int height = sc.nextInt();


			for (int r = 1001-y-height; r < 1001-y; r++) {
				for (int c = x; c < x + width; c++) {
					flat[r][c] = d;
				}
			}
			d++;
		}

		
		
		for (int j = 1; j <= num; j++) {
			int area = 0;
			for (int r = 0; r < 1001; r++) {
				for (int c = 0; c < 1001; c++) {
					if (flat[r][c] == j) {
						area++;
					}
				}
			}
			System.out.println(area);
		}
	}
}
