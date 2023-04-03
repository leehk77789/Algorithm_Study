package day0403;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SWEA_5650_핀볼게임_정유준 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static String[] input;
	static int size;
	static int[][] map;
	// 상 우 하 좌
	static int[] rIdx = { -1, 0, 1, 0 };
	static int[] cIdx = { 0, 1, 0, -1 };
	static int originalRow;
	static int originalCol;
	static int count;
	static int maxCount;
	static int[] now;

	static void input() throws NumberFormatException, IOException {
		originalRow = 0;
		originalCol = 0;
		maxCount = Integer.MIN_VALUE;
		now = new int[2];

		size = Integer.parseInt(br.readLine());

		map = new int[size][size];
		for (int r = 0; r < size; r++) {
			input = br.readLine().split(" ");
			for (int c = 0; c < size; c++) {
				map[r][c] = Integer.parseInt(input[c]);
			}
		}
	}

	static void bruteForce() {
		for (int r = 0; r < size; r++) {
			for (int c = 0; c < size; c++) {
				if (map[r][c] == 0) {
					for (int idx = 0; idx < 4; idx++) {
						count = 0;
						originalRow = r;
						originalCol = c;
						playGame(r, c, idx);
					}
				}
			}
		}
	}

	private static void playGame(int row, int col, int idx) {
		// 끝내는 조건
		// 1. 처음시작이 아닌 상태에서 다시 시작점으로 돌아옴
		// 2. 블랙홀을 만남
		if ((originalRow == row && originalCol == col && count != 0) || map[row][col] == -1) {
			if (count > maxCount) {
				maxCount = count;
			}
			return;
		}

		int nR = row + rIdx[idx];
		int nC = col + cIdx[idx];
		// 범위 안에 다음값이 존재하면 진행 아니면 리턴
		if (nR >= 0 && nC >= 0 && nR < size && nC < size) {
			row = nR;
			col = nC;
			if (map[row][col] == 1) {
				count++;
				idx = oneBlock(idx);

				nR = row + rIdx[idx];
				nC = col + cIdx[idx];

				if (nR >= 0 && nC >= 0 && nR < size && nC < size) {
					playGame(nR, nC, idx);
				} else {
					return;
				}
			} else if (map[row][col] == 2) {
				count++;
				idx = twoBlock(idx);
				nR = row + rIdx[idx];
				nC = col + cIdx[idx];
				if (nR >= 0 && nC >= 0 && nR < size && nC < size) {
					playGame(nR, nC, idx);
				} else {
					return;
				}
			} else if (map[row][col] == 3) {
				count++;
				idx = threeBlock(idx);
				nR = row + rIdx[idx];
				nC = col + cIdx[idx];
				if (nR >= 0 && nC >= 0 && nR < size && nC < size) {
					playGame(nR, nC, idx);
				} else {
					return;
				}
			} else if (map[row][col] == 4) {
				count++;
				idx = fourBlock(idx);
				nR = row + rIdx[idx];
				nC = col + cIdx[idx];
				if (nR >= 0 && nC >= 0 && nR < size && nC < size) {
					playGame(nR, nC, idx);
				} else {
					return;
				}
				count--;
			} else if (map[row][col] == 5) {
				count++;
				idx = fiveBlock(idx);
				nR = row + rIdx[idx];
				nC = col + cIdx[idx];
				if (nR >= 0 && nC >= 0 && nR < size && nC < size) {
					playGame(nR, nC, idx);
				} else {
					return;
				}
			} else if (map[row][col] == 6 || map[row][col] == 7 || map[row][col] == 8 || map[row][col] == 9
					|| map[row][col] == 10) {
				count++;
				playGame(now[0], now[1], idx);
			}
		} else {
			idx = (idx + 2) % 4;
			playGame(row, col, idx);
		}
	}

	// 상 우 하 좌
	static int oneBlock(int idx) {
		if (idx == 0) {
			return 2;
		} else if (idx == 1) {
			return 3;
		} else if (idx == 2) {
			return 1;
		} else {
			return 0;
		}
	}

	static int twoBlock(int idx) {
		if (idx == 0) {
			return 1;
		} else if (idx == 1) {
			return 3;
		} else if (idx == 2) {
			return 0;
		} else {
			return 2;
		}
	}

	static int threeBlock(int idx) {
		if (idx == 0) {
			return 3;
		} else if (idx == 1) {
			return 2;
		} else if (idx == 2) {
			return 0;
		} else {
			return 1;
		}
	}

	static int fourBlock(int idx) {
		if (idx == 0) {
			return 2;
		} else if (idx == 1) {
			return 0;
		} else if (idx == 2) {
			return 3;
		} else {
			return 1;
		}
	}

	static int fiveBlock(int idx) {
		return (idx + 2) % 4;
	}

	static void warmHole(int row, int col, int num) {

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (map[i][j] == num && i != row && i != col) {
					now[0] = i;
					now[1] = j;
				}
			}
		}
	}

	static void solve() throws NumberFormatException, IOException {
		int testCase = Integer.parseInt(br.readLine());
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
