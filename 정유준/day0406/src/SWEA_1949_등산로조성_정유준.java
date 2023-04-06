import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SWEA_1949_등산로조성_정유준 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static String[] input;
	static int[][] map;
	// 방문 여부
	static boolean[][] check;
	// 맵 사이즈
	static int size;
	// 최대 팔 수 있는 깊이
	static int max;
	// 최대로 많이 간 거리
	static int answer;
	// 상하좌우
	static int[] rIdx = { -1, 1, 0, 0 };
	static int[] cIdx = { 0, 0, -1, 1 };
	// 땅파기 찬스 썼는지 여부
	static int chance;

	static int maxNum;

	static void input() throws NumberFormatException, IOException {
		input = br.readLine().split(" ");
		size = Integer.parseInt(input[0]);
		max = Integer.parseInt(input[1]);
		map = new int[size][size];
		check = new boolean[size][size];
		for (int row = 0; row < size; row++) {
			input = br.readLine().split(" ");
			for (int col = 0; col < size; col++) {
				map[row][col] = Integer.parseInt(input[col]);
			}
		}

		maxNum = 0;

		for (int row = 0; row < size; row++) {
			for (int col = 0; col < size; col++) {
				if (map[row][col] > maxNum) {
					maxNum = map[row][col];
				}
			}
		}

		answer = 0;
		chance = 1;
	}

	static void findRoad(int row, int col, int depth) {
		int nR = 0;
		int nC = 0;

		if (depth > answer) {
			answer = depth;
		}

		for (int i = 0; i < 4; i++) {
			nR = row + rIdx[i];
			nC = col + cIdx[i];
			if (nR < 0 || nC < 0 || nR >= size || nC >= size) {
				continue;
			}

			if (check[nR][nC] == true) {
				continue;
			}

			if (map[nR][nC] < map[row][col]) {
				check[nR][nC] = true;
				findRoad(nR, nC, depth + 1);
				check[nR][nC] = false;
			} else if (map[nR][nC] >= map[row][col] && chance == 1) {
				for (int idx = 1; idx <= max; idx++) {
					if (map[nR][nC] - idx >= map[row][col]) {
						continue;
					} else {
						map[nR][nC] -= idx;
						check[nR][nC] = true;
						chance--;
						findRoad(nR, nC, depth + 1);
						map[nR][nC] += idx;
						check[nR][nC] = false;
						chance++;
					}
				}
			}
		}
	}

	static void solve() throws NumberFormatException, IOException {
		int testCase = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= testCase; tc++) {
			sb.append("#").append(tc).append(" ");
			input();
			for (int i = 0; i < size; i++) {
				for (int j = 0; j < size; j++) {
					if (map[i][j] == maxNum) {
						check[i][j] = true;
						findRoad(i, j, 1);
						check[i][j] = false;
					}
				}
			}
			sb.append(answer).append("\n");
		}
		System.out.println(sb);
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		solve();
	}
}
