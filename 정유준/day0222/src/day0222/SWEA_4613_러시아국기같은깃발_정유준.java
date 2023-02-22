package day0222;

import java.util.Scanner;

public class SWEA_4613_러시아국기같은깃발_정유준 {
	static Scanner sc = new Scanner(System.in);
	static char[][] gookie;
	static int colorCount;
	static int col, row;
	static int white, blue, red;

	static void input() {
		col = sc.nextInt();
		row = sc.nextInt();
		gookie = new char[col][row];
		for (int i = 0; i < col; i++) {
			String str = sc.next();
			for (int j = 0; j < row; j++) {
				gookie[i][j] = str.charAt(j);
			}
		}
	}

	static void findMin() {

		colorCount = 2100000000;
		int whiteCount = 0;
		for (white = 0; white < col - 2; white++) {
			int redCount = 0;
			int blueCount = 0;
			for (int whitej = 0; whitej < row; whitej++) {
				if (gookie[white][whitej] != 'W') {
					whiteCount++;
				}
			}
			blueCount = 0;
			for (blue = white + 1; blue < col - 1; blue++) {
				for (int bluej = 0; bluej < row; bluej++) {
					if (gookie[blue][bluej] != 'B') {
						blueCount++;
					}
				}
				redCount = 0;
				for (red = blue + 1; red < col; red++) {
					for (int redj = 0; redj < row; redj++) {
						if (gookie[red][redj] != 'R') {
							redCount++;
						}
					}
				}
				if (whiteCount + blueCount + redCount < colorCount) {
					colorCount = whiteCount + blueCount + redCount;
				}
			}
		}
	}

	static void solve() {
		int testCase = sc.nextInt();
		for (int tc = 1; tc <= testCase; tc++) {
			input();
			findMin();
			System.out.println("#" + tc + " " + colorCount);
		}
	}

	public static void main(String[] args) {
		solve();
	}
}
