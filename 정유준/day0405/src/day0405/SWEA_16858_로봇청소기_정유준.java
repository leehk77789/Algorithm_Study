package day0405;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SWEA_16858_로봇청소기_정유준 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static String[] input;
	static int[][] map;

	// 먼지의 위치
	static int[][] munzi;
	static int size;
	static int count;
	static int turn;
	// 0 : 오, 1 : 상, 2 : 좌, 3 : 하
	static int idx;

	static void input() throws NumberFormatException, IOException {
		size = Integer.parseInt(br.readLine().trim());
		map = new int[size][size];
		// 먼지의 개수 세기
		count = 0;
		turn = 0;
		idx = 0;

		for (int row = 0; row < size; row++) {
			input = br.readLine().trim().split(" ");
			for (int col = 0; col < size; col++) {
				map[row][col] = Integer.parseInt(input[col]);
				if (map[row][col] != 0) {
					count++;
				}
			}
		}

		munzi = new int[count + 1][2];
		for (int row = 0; row < size; row++) {
			for (int col = 0; col < size; col++) {
				if (map[row][col] != 0) {
					munzi[map[row][col]][0] = row;
					munzi[map[row][col]][1] = col;
				}
			}
		}
	}

	static void findMunzi(int row, int col, int depth) {
		if (count == depth - 1) {
			sb.append(turn).append("\n");
			return;
		}

		if (idx == 0) {
			// 오른쪽
			if (munzi[depth][0] < row && munzi[depth][1] < col) {
				// 좌상
				turn += 3;
				idx = 1;
				row = munzi[depth][0];
				col = munzi[depth][1];
				findMunzi(row, col, depth + 1);
			} else if (munzi[depth][0] > row && munzi[depth][1] < col) {
				// 좌하
				turn += 2;
				idx = 2;
				row = munzi[depth][0];
				col = munzi[depth][1];
				findMunzi(row, col, depth + 1);
			} else if (munzi[depth][0] < row && munzi[depth][1] > col) {
				// 우상
				turn += 3;
				idx = 1;
				row = munzi[depth][0];
				col = munzi[depth][1];
				findMunzi(row, col, depth + 1);
			} else {
				// 우하
				turn += 1;
				idx = 3;
				row = munzi[depth][0];
				col = munzi[depth][1];
				findMunzi(row, col, depth + 1);
			}
		} else if (idx == 1) {
			// 위
			if (munzi[depth][0] < row && munzi[depth][1] < col) {
				// 좌상
				turn += 3;
				idx = 2;
				row = munzi[depth][0];
				col = munzi[depth][1];
				findMunzi(row, col, depth + 1);
			} else if (munzi[depth][0] > row && munzi[depth][1] < col) {
				// 좌하
				turn += 3;
				idx = 2;
				row = munzi[depth][0];
				col = munzi[depth][1];
				findMunzi(row, col, depth + 1);
			} else if (munzi[depth][0] < row && munzi[depth][1] > col) {
				// 우상
				turn += 1;
				idx = 0;
				row = munzi[depth][0];
				col = munzi[depth][1];
				findMunzi(row, col, depth + 1);
			} else {
				// 우하
				turn += 2;
				idx = 3;
				row = munzi[depth][0];
				col = munzi[depth][1];
				findMunzi(row, col, depth + 1);
			}
		} else if (idx == 2) {
			// 왼쪽
			if (munzi[depth][0] < row && munzi[depth][1] < col) {
				// 좌상
				turn += 1;
				idx = 1;
				row = munzi[depth][0];
				col = munzi[depth][1];
				findMunzi(row, col, depth + 1);
			} else if (munzi[depth][0] > row && munzi[depth][1] < col) {
				// 좌하
				turn += 3;
				idx = 3;
				row = munzi[depth][0];
				col = munzi[depth][1];
				findMunzi(row, col, depth + 1);
			} else if (munzi[depth][0] < row && munzi[depth][1] > col) {
				// 우상
				turn += 2;
				idx = 0;
				row = munzi[depth][0];
				col = munzi[depth][1];
				findMunzi(row, col, depth + 1);
			} else {
				// 우하
				turn += 3;
				idx = 3;
				row = munzi[depth][0];
				col = munzi[depth][1];
				findMunzi(row, col, depth + 1);
			}
		} else {
			// 아래쪽
			if (munzi[depth][0] < row && munzi[depth][1] < col) {
				// 좌상
				turn += 2;
				idx = 1;
				row = munzi[depth][0];
				col = munzi[depth][1];
				findMunzi(row, col, depth + 1);
			} else if (munzi[depth][0] > row && munzi[depth][1] < col) {
				// 좌하
				turn += 1;
				idx = 2;
				row = munzi[depth][0];
				col = munzi[depth][1];
				findMunzi(row, col, depth + 1);
			} else if (munzi[depth][0] < row && munzi[depth][1] > col) {
				// 우상
				turn += 3;
				idx = 0;
				row = munzi[depth][0];
				col = munzi[depth][1];
				findMunzi(row, col, depth + 1);
			} else {
				// 우하
				turn += 3;
				idx = 0;
				row = munzi[depth][0];
				col = munzi[depth][1];
				findMunzi(row, col, depth + 1);
			}
		}
	}

	static void solve() throws NumberFormatException, IOException {
		int testCase = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= testCase; tc++) {
			input();
			sb.append("#").append(tc).append(" ");
			findMunzi(1, 1, 1);
		}
		System.out.println(sb);
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		solve();
	}
}
