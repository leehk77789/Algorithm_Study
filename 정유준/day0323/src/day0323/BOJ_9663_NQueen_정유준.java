package day0323;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_9663_NQueen_정유준 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int size;
	static int count;
	static int map[][];
	static final int[] dRow = { -1, -1, -1 };
	static final int[] dCol = { 0, -1, 1 };

	static void input() throws NumberFormatException, IOException {
		size = Integer.parseInt(br.readLine());
		map = new int[size][size];
		count = 0;
	}

	static void backtracking(int col) {
		if (col == size) {
			count++;
			return;
		}

		for (int idx = 0; idx < size; idx++) {
			if (check(col, idx)) {
				map[col][idx] = 1;
				backtracking(col + 1);
				map[col][idx] = 0;
			}
		}
	}

	static boolean check(int row, int col) {
		for (int d = 0; d < 3; d++) {
			int tmpRow = row;
			int tmpCol = col;

			while (true) {
				int nextRow = tmpRow + dRow[d];
				int nextCol = tmpCol + dCol[d];

				if (nextRow < 0 || nextCol < 0 || nextRow >= size || nextCol >= size) {
					tmpRow = nextRow;
					tmpCol = nextCol;
					break;
				}

				// 퀸이 이미 놓여있다면 해당 위치에서 놓을 수 없다.
				if (map[nextRow][nextCol] == 1) {
					return false;
				}
				tmpRow = nextRow;
				tmpCol = nextCol;
			}
		}
		return true;
	}

	static void solve() throws NumberFormatException, IOException {
		input();
		backtracking(0);
		System.out.println(count);
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		solve();
	}
}
