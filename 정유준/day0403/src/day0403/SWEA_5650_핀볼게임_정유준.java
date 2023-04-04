package day0403;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SWEA_5650_핀볼게임_정유준 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static String[] input;
	static int[][] map;

	static int[] ridx = { 0, 1, 0, -1 };
	static int[] cidx = { 1, 0, -1, 0 };
	static int originR;
	static int originC;
	static int maxCount;
	static int size;
	static int[][][] hole;
	static int idx;

	static void input() throws NumberFormatException, IOException {
		maxCount = 0;
		size = Integer.parseInt(br.readLine().trim());

		map = new int[size + 1][size + 1];
		hole = new int[11][2][2];

		// 값넣기
		for (int r = 1; r <= size; r++) {
			input = br.readLine().trim().split(" ");
			for (int c = 1; c <= size; c++) {
				map[r][c] = Integer.parseInt(input[c - 1]);
				if (map[r][c] >= 6) {
					if (hole[map[r][c]][0][0] == 0) {
						hole[map[r][c]][0][0] = r;
						hole[map[r][c]][0][1] = c;
					} else {
						hole[map[r][c]][1][0] = r;
						hole[map[r][c]][1][1] = c;
					}
				}
			}
		}
//		System.out.println(Arrays.toString(hole[6][0]));
//		System.out.println(Arrays.toString(hole[6][1]));
//		System.out.println(Arrays.toString(hole[7][0]));
//		System.out.println(Arrays.toString(hole[7][1]));

//		for (int i = 1; i <= size; i++) {
//			for (int j = 1; j <= size; j++) {
//				System.out.print(map[i][j] + " ");
//			}
//			System.out.println();
//		}
	}

	static void bruteForce() {
		for (int row = 1; row <= size; row++) {
			for (int col = 1; col <= size; col++) {
				if (map[row][col] == 0) {
					originR = row;
					originC = col;
					for (int i = 0; i < 4; i++) {
						idx = i;
						pinball(row, col);
					}
				}
			}
		}
	}

	private static void pinball(int row, int col) {
		int count = 0;
		int originIdx = idx;
		while (true) {
			row += ridx[idx];
			col += cidx[idx];
//			System.out.println("현재 방향 : " + idx);
//			System.out.println("최초 시작점 row : " + originR + ", col : " + originC + "최초 시작방향 : " + originIdx);
//			System.out.println("현재 위치 row : " + row + ", col : " + col);
			if (row < 1 || col < 1 || row > size || col > size) {
				count++;
				idx = (idx + 2) % 4;
				continue;
			}

			if (row == originR && col == originC) {
				maxCount = Math.max(maxCount, count);
				break;
			}

			if (map[row][col] == -1) {
				maxCount = Math.max(maxCount, count);
				break;
			}

			if (1 <= map[row][col] && map[row][col] <= 5) {
				count++;
				block(row, col);
				continue;
			}

			if (map[row][col] > 5) {
				int a = map[row][col];
				if (row == hole[a][0][0] && col == hole[a][0][1]) {
					row = hole[a][1][0];
					col = hole[a][1][1];
				} else {
					row = hole[a][0][0];
					col = hole[a][0][1];
				}
			}
		}
	}

	static void block(int row, int col) {
		if (map[row][col] == 1) {
			if (idx == 0)
				idx = 2;
			else if (idx == 1)
				idx = 0;
			else if (idx == 2)
				idx = 3;
			else if (idx == 3)
				idx = 1;

		} else if (map[row][col] == 2) {
			if (idx == 0)
				idx = 2;
			else if (idx == 1)
				idx = 3;
			else if (idx == 2)
				idx = 1;
			else if (idx == 3)
				idx = 0;

		} else if (map[row][col] == 3) {
			if (idx == 0)
				idx = 1;
			else if (idx == 1)
				idx = 3;
			else if (idx == 2)
				idx = 0;
			else if (idx == 3)
				idx = 2;

		} else if (map[row][col] == 4) {
			if (idx == 0)
				idx = 3;
			else if (idx == 1)
				idx = 2;
			else if (idx == 2)
				idx = 0;
			else if (idx == 3)
				idx = 1;

		} else if (map[row][col] == 5) {
			if (idx == 0)
				idx = 2;
			else if (idx == 1)
				idx = 3;
			else if (idx == 2)
				idx = 0;
			else if (idx == 3)
				idx = 1;
		}
	}

	static void solve() throws NumberFormatException, IOException {
		int testCase = Integer.parseInt(br.readLine().trim());
		for (int tc = 1; tc <= testCase; tc++) {
			input();
			bruteForce();
			sb.append("#").append(tc).append(" ").append(maxCount).append("\n");
		}
		System.out.println(sb);
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		solve();
	}
}
