package day2016;

import java.util.Scanner;

class SWEA_11315_오목판정_정유준 {
	static Scanner sc = new Scanner(System.in);
	static char[][] omokPan;
	static int panSize;
	static int[] deltaRow = { 0, 1, 1, 1 };
	static int[] deltaCol = { 1, 1, 0, -1 };
	static boolean yesOrNo;

	static void input() {
		panSize = sc.nextInt();
		omokPan = new char[panSize][panSize];
		for (int row = 0; row < panSize; row++) {
			String inputStr = sc.next();
			for (int col = 0; col < panSize; col++) {
				omokPan[row][col] = inputStr.charAt(col);
			}
		}
		yesOrNo = false;
	}

	static void findWin() {
		for (int row = 0; row < panSize; row++) {
			for (int col = 0; col < panSize; col++) {
				if (omokPan[row][col] == 'o') {
					for (int direction = 0; direction < 4; direction++) {
						int count = 1;
						for (int forCount = 1; forCount < 5; forCount++) {
							int nextRow = row + deltaRow[direction] * forCount;
							int nextCol = col + deltaCol[direction] * forCount;
							if (nextRow >= 0 && nextRow < panSize && nextCol >= 0 && nextCol < panSize
									&& omokPan[nextRow][nextCol] == 'o') {
								count++;
							}
						}
						if (count == 5) {
							yesOrNo = true;
						}
					}
				}
			}
		}
	}

	static void solve() {
		int testCase = sc.nextInt();
		for (int tc = 1; tc <= testCase; tc++) {
			input();
			findWin();
			if (yesOrNo) {
				System.out.println("#" + tc + " YES");
			} else {
				System.out.println("#" + tc + " NO");
			}
		}
	}

	public static void main(String[] args) {
		solve();
	}
}
