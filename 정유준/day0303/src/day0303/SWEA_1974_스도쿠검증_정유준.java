package day0303;

import java.util.Scanner;

public class SWEA_1974_스도쿠검증_정유준 {
	static Scanner sc = new Scanner(System.in);
	static int[][] map;
	static int trueFalse;

	static void input() {
		trueFalse = 1;

		map = new int[9][9];
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				map[i][j] = sc.nextInt();
			}
		}
	}

	static boolean checkBox(int col, int row) {
		int[] numBox = new int[10];

		if (col % 3 == 0) {
			if (row % 3 == 0) {
				for (int i = col; i < col + 3; i++) {
					for (int j = row; j < row + 3; j++) {
						numBox[map[i][j]]++;
					}
				}
				for (int i = 1; i <= 9; i++) {
					if (numBox[i] != 1) {
						return false;
					}
				}
			} else if (row % 3 == 1) {
				for (int i = col; i < col + 3; i++) {
					for (int j = row - 1; j < row + 2; j++) {
						numBox[map[i][j]]++;
					}
				}
				for (int i = 1; i <= 9; i++) {
					if (numBox[i] != 1) {
						return false;
					}
				}
			} else {
				for (int i = col; i < col + 3; i++) {
					for (int j = row - 2; j < row + 1; j++) {
						numBox[map[i][j]]++;
					}
				}
				for (int i = 1; i <= 9; i++) {
					if (numBox[i] != 1) {
						return false;
					}
				}
			}
		}
		if (col % 3 == 1) {
			if (row % 3 == 0) {
				for (int i = col - 1; i < col + 2; i++) {
					for (int j = row; j < row + 3; j++) {
						numBox[map[i][j]]++;
					}
				}
				for (int i = 1; i <= 9; i++) {
					if (numBox[i] != 1) {
						return false;
					}
				}
			} else if (row % 3 == 1) {
				for (int i = col - 1; i < col + 2; i++) {
					for (int j = row - 1; j < row + 2; j++) {
						numBox[map[i][j]]++;
					}
				}
				for (int i = 1; i <= 9; i++) {
					if (numBox[i] != 1) {
						return false;
					}
				}
			} else {
				for (int i = col - 1; i < col + 2; i++) {
					for (int j = row - 2; j < row + 1; j++) {
						numBox[map[i][j]]++;
					}
				}
				for (int i = 1; i <= 9; i++) {
					if (numBox[i] != 1) {
						return false;
					}
				}
			}
		}
		if (col % 3 == 2) {
			if (row % 3 == 0) {
				for (int i = col - 2; i < col + 1; i++) {
					for (int j = row; j < row + 3; j++) {
						numBox[map[i][j]]++;
					}
				}
				for (int i = 1; i <= 9; i++) {
					if (numBox[i] != 1) {
						return false;
					}
				}
			} else if (row % 3 == 1) {
				for (int i = col - 2; i < col + 1; i++) {
					for (int j = row - 1; j < row + 2; j++) {
						numBox[map[i][j]]++;
					}
				}
				for (int i = 1; i <= 9; i++) {
					if (numBox[i] != 1) {
						return false;
					}
				}
			} else {
				for (int i = col - 2; i < col + 1; i++) {
					for (int j = row - 2; j < row + 1; j++) {
						numBox[map[i][j]]++;
					}
				}
				for (int i = 1; i <= 9; i++) {
					if (numBox[i] != 1) {
						return false;
					}
				}
			}
		}
		return true;
	}

	static boolean checkCol(int row) {
		int[] numCol = new int[10];
		for (int i = 0; i < 9; i++) {
			numCol[map[i][row]]++;
		}
		for (int i = 1; i <= 9; i++) {
			if (numCol[i] != 1) {
				return false;
			}
		}
		return true;
	}

	static boolean checkRow(int col) {
		int[] numRow = new int[10];
		for (int i = 0; i < 9; i++) {
			numRow[map[col][i]]++;
		}
		for (int i = 1; i <= 9; i++) {
			if (numRow[i] != 1) {
				return false;
			}
		}
		return true;
	}

	static void solve() {
		int testCase = sc.nextInt();
		for (int idx = 1; idx <= testCase; idx++) {
			input();
			boolean flag = true;
			outer: for (int i = 0; i < 9; i++) {
				for (int j = 0; j < 9; j++) {
					if (!checkBox(i, j) || !checkCol(j) || !checkRow(i)) {
						flag = false;
						break outer;
					}
				}
			}
			if (flag) {
				System.out.println("#" + idx + " " + 1);
			} else {
				System.out.println("#" + idx + " " + 0);
			}
		}
	}

	public static void main(String[] args) {
		solve();
	}
}
