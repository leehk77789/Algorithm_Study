package day0328;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SWEA_7733_치즈도둑_정유준 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int N;
	static int maxCount;
	static int count;
	static int[][] map;
	static int[][] eattenMap;
	static boolean[][] check;
	static int[] dRow = { -1, 1, 0, 0 };
	static int[] dCol = { 0, 0, -1, 1 };

	static void input() throws NumberFormatException, IOException {
		N = Integer.parseInt(br.readLine());
		map = new int[N][N];
		eattenMap = new int[N][N];
		maxCount = 0;

		for (int i = 0; i < N; i++) {
			String[] input = br.readLine().split(" ");
			for (int j = 0; j < N; j++) {
				map[i][j] = Integer.parseInt(input[j]);
			}
		}
	}

	static void eat(int num) {
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (map[i][j] == num) {
					eattenMap[i][j] = 1;
				}
			}
		}
	}

	static void findDunguri() {
		for (int i = 0; i <= 100; i++) {
			eat(i);
			int eatten = 0;
			for (int row = 0; row < N; row++) {
				for (int col = 0; col < N; col++) {
					eatten += eattenMap[row][col];
				}
			}
			if (eatten == N * N) {
				return;
			}

			count = 0;
			check = new boolean[N][N];
			for (int row = 0; row < N; row++) {
				for (int col = 0; col < N; col++) {
					if (eattenMap[row][col] == 0 && !check[row][col]) {
						getDunguri(row, col);
						count++;
					}
				}
			}
			maxCount = Math.max(maxCount, count);
		}
	}

	static void getDunguri(int row, int col) {
		check[row][col] = true;
		for (int i = 0; i < 4; i++) {
			int nRow = row + dRow[i];
			int nCol = col + dCol[i];
			if (nRow < N && nCol < N && nRow >= 0 && nCol >= 0 && eattenMap[nRow][nCol] == 0 && !check[nRow][nCol]) {
				getDunguri(nRow, nCol);
			}
		}
	}

	static void solve() throws NumberFormatException, IOException {
		int testCase = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= testCase; tc++) {
			input();
			findDunguri();
			System.out.println("#" + tc + " " + maxCount);
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		solve();
	}
}
