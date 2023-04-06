import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_18111_마인크래프트_정유준 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static String[] input;
	static long block;
	static int[][] map;
	static int max;
	static int min;
	static int sum;
	static int row;
	static int col;
	static int answer;

	static void input() throws NumberFormatException, IOException {
		input = br.readLine().split(" ");
		row = Integer.parseInt(input[0]);
		col = Integer.parseInt(input[1]);
		block = Long.parseLong(input[2]);
		map = new int[row][col];
		max = Integer.MIN_VALUE;
		min = Integer.MAX_VALUE;
		sum = Integer.MAX_VALUE;
		answer = 0;

		for (int i = 0; i < row; i++) {
			input = br.readLine().split(" ");
			for (int j = 0; j < col; j++) {
				map[i][j] = Integer.parseInt(input[j]);
				if (map[i][j] > max) {
					max = map[i][j];
				}
				if (map[i][j] < min) {
					min = map[i][j];
				}
			}
		}

//		for (int i = 0; i < row; i++) {
//			for (int j = 0; j < col; j++) {
//				System.out.print(map[i][j] + " ");
//			}
//			System.out.println();
//		}
	}

	static void find() {
		for (int i = min; i <= max; i++) {
			int curr = check(i);
			if (curr < sum) {
				sum = curr;
				answer = i;
			} else if (curr == sum) {
				if (i > answer) {
					answer = i;
				}
			}

		}
	}

	static int check(int i) {
		int nowSum = 0;
		long left = block;

		for (int a = 0; a < row; a++) {
			for (int b = 0; b < col; b++) {
				if (map[a][b] > i) {
					nowSum += (map[a][b] - i) * 2;
					left += (map[a][b] - i);
					if (nowSum > sum) {
						return Integer.MAX_VALUE;
					}
				} else if (map[a][b] < i) {
					nowSum += (i - map[a][b]);
					left -= (i - map[a][b]);
					if (nowSum > sum) {
						return Integer.MAX_VALUE;
					}
				} else {
					continue;
				}
			}
		}
		if (left <= -1) {
			return Integer.MAX_VALUE;
		} else {
			return nowSum;
		}
	}

	static void solve() throws NumberFormatException, IOException {
		input();
		find();
		sb.append(sum).append(" ").append(answer);
		System.out.println(sb);
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		solve();
	}
}
