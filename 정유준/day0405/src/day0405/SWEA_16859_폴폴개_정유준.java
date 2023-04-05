package day0405;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SWEA_16859_폴폴개_정유준 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static String[] input;
	static int[][] map;
	static boolean[][] check;
	static int count;
	static int nR;
	static int nC;
	static int sum;
	static int size;
	static int jR;
	static int jC;

	static void input() throws NumberFormatException, IOException {
		size = Integer.parseInt(br.readLine());
		map = new int[size][size];
		check = new boolean[size][size];

		for (int row = 0; row < size; row++) {
			input = br.readLine().split(" ");
			for (int col = 0; col < size; col++) {
				map[row][col] = Integer.parseInt(input[col]);
				if (map[row][col] == 2) {
					nR = row;
					nC = col;
				}
			}
		}

		count = 3;
		sum = 0;
	}

	static void catchPari(int row, int col, int idx) {
		if (idx == count) {
			return;
		}

		if (check[row][col] == true) {
			return;
		}

		if (map[row][col] == 1) {
			sum++;
		}

		if (!isCol(row) && !isRow(col)) {
			return;
		}

		if (isRow(col)) {
			if (jR < row) {
				for (int i = 0; i < jR; i++) {
					check[row][col] = true;
					catchPari(i, col, idx + 1);
					check[row][col] = false;
				}
			} else {
				for (int i = jR; i < size; i++) {
					check[row][col] = true;
					catchPari(i, col, idx + 1);
					check[row][col] = false;
				}
			}
		}

		if (isCol(row)) {
			if (jC > col) {
				for (int i = jC; i < size; i++) {
					check[row][col] = true;
					catchPari(row, i, idx + 1);
					check[row][col] = false;
				}
			} else {
				for (int i = 0; i < jC; i++) {
					check[row][col] = true;
					catchPari(row, i, idx + 1);
					check[row][col] = false;
				}
			}
		}
	}

	static boolean isRow(int col) {
		for (int i = 0; i < size; i++) {
			if (map[i][col] == 1) {
				jR = i;
			}
			return true;
		}
		return false;
	}

	static boolean isCol(int row) {
		for (int i = 0; i < size; i++) {
			if (map[row][i] == 1) {
				jC = i;
			}
			return true;
		}
		return false;
	}

	static void solve() throws NumberFormatException, IOException {
		int testCase = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= testCase; tc++) {
			input();
			catchPari(nR, nC, 0);
			sb.append(sum);
		}
		System.out.println(sb);
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		solve();
	}
}
