import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_17822_원판돌리기 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static String[] input;
	static int[][] map;
	static int[][] turn;
	static boolean[][] check;
	static int[] rIdx = { -1, 1, 0, 0 };
	static int[] cIdx = { 0, 0, -1, 1 };
	static int tc;
	static int row;
	static int col;
	static boolean flag;

	static void input() throws NumberFormatException, IOException {
		input = br.readLine().split(" ");
		row = Integer.parseInt(input[0]);
		col = Integer.parseInt(input[1]);
		tc = Integer.parseInt(input[2]);
		map = new int[row][col];

		turn = new int[tc][3];

		for (int i = 0; i < row; i++) {
			input = br.readLine().split(" ");
			for (int j = 0; j < col; j++) {
				map[i][j] = Integer.parseInt(input[j]);
			}
		}

		for (int i = 0; i < tc; i++) {
			input = br.readLine().split(" ");
			turn[i][0] = Integer.parseInt(input[0]);
			turn[i][1] = Integer.parseInt(input[1]);
			turn[i][2] = Integer.parseInt(input[2]);
		}
	}

	static void doT() {
		for (int i = 0; i < turn.length; i++) {
			// d가 0이면 시계방향(오른쪽)으로 돌리고 1이면 반시계방향(왼쪽)으로 돌린다.
			rotate(turn[i][0], turn[i][1], turn[i][2]);
			bruteForce();
//			System.out.println(i + 1 + "번째 모양");
//			for (int a = 0; a < row; a++) {
//				for (int j = 0; j < col; j++) {
//					System.out.print(map[a][j] + " ");
//				}
//				System.out.println();
//			}
		}
	}

	public static void rotate(int x, int d, int k) {
		if (d == 0) {
			for (int i = 0; i < row; i++) {
				if ((i + 1) % x == 0) {
					int[] temp = new int[col];

					for (int j = 0; j < col; j++) {
						temp[(j + k) % col] = map[i][j];
					}

					for (int j = 0; j < col; j++) {
						map[i][j] = temp[j];
					}

				}
			}
		} else {
			for (int i = 0; i < row; i++) {
				if ((i + 1) % x == 0) {
					int[] temp = new int[col];

					for (int j = 0; j < col; j++) {
						int idx = (j - k < 0) ? (col + (j - k)) : (j - k);
						temp[idx] = map[i][j];
					}

					for (int j = 0; j < col; j++) {
						map[i][j] = temp[j];
					}

				}
			}
		}
	}

	static void bruteForce() {
		flag = false;
		check = new boolean[row][col];
		// 돌렸을 때 전체탐색해서 같은 부분 제거해주기
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				findSame(i, j);
			}
		}

		if (!flag) {
			findMid();
		} else {
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {
					if (check[i][j]) {
						map[i][j] = 0;
					}
				}
			}
		}
	}

	// 평균구하기 0은 넘겨야한다.
	static void findMid() {
		double sum = 0;
		int count = 0;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (map[i][j] != 0) {
					count++;
				}
				sum += (map[i][j]);
			}
		}
		sum /= count;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (map[i][j] != 0) {
					if (map[i][j] > sum) {
						map[i][j]--;
					} else if (map[i][j] < sum) {
						map[i][j]++;
					}
				}
			}
		}
	}

	static void findSame(int r, int c) {

		for (int i = 0; i < 4; i++) {
			int nr = r + rIdx[i];
			int nc = c + cIdx[i];

			if (nr < 0 || nr >= row) {
				continue;
			}
			if (nc < 0) {
				nc += col;
			}
			if (nc >= col) {
				nc %= col;
			}

			if (map[r][c] == map[nr][nc]) {
				if (map[r][c] != 0) {
					flag = true;
					check[r][c] = true;
					check[nr][nc] = true;
				}

			}
		}
	}

	static void findSum() {
		int sum = 0;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				sum += map[i][j];
			}
		}
		sb.append(sum);
	}

	static void solve() throws NumberFormatException, IOException {
		input();
		doT();
		findSum();
		System.out.println(sb);
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		solve();
	}
}
