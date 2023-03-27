package day0327;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SWEA_1247_최적경로_정유준 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int n;
	static int[] x;
	static int[] y;
	static int min;
	static int sum;
	static boolean[] check;
	static int[] result;

	static int getDist(int i, int j) {
		return Math.abs(x[i] - x[j]) + Math.abs(y[i] - y[j]);
	}

	static void input() throws IOException {
		int a = Integer.parseInt(br.readLine());
		String[] input = br.readLine().split(" ");
		int idx = 0;
		n = input.length / 2;
		x = new int[n];
		y = new int[n];
		check = new boolean[n];

		for (int i = 0; i < input.length; i++) {
			if (i % 2 == 0) {
				x[idx] = Integer.parseInt(input[i]);
			} else {
				y[idx++] = Integer.parseInt(input[i]);
			}
		}

		// 집 위치를 가장 마지막으로 보내주기
		int xTmp = x[1];
		int yTmp = y[1];
		x[1] = x[n - 1];
		y[1] = y[n - 1];
		x[n - 1] = xTmp;
		y[n - 1] = yTmp;

		min = Integer.MAX_VALUE;
		sum = 0;
		result = new int[n];
		result[0] = 0;
		result[n - 1] = n - 1;
	}

	// result의 idx번째 인덱스를 채우는 함수...
	static void backtracking(int idx) {
		if (idx == n) {
			if (sum < min) {
				min = sum;
			}
			return;
		}

		for (int i = 1; i < n; i++) {
			if (check[i]) {
				continue;
			}
			result[idx] = i;

			int tmpDist = getDist(result[idx], result[idx - 1]);
			sum += tmpDist;
			if (sum > min) {
				sum -= tmpDist;
				return;
			}

			check[i] = true;

			backtracking(idx + 1);

			sum -= tmpDist;
			check[i] = false;
		}
	}

	static void solve() throws NumberFormatException, IOException {
		int testCase = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= testCase; tc++) {
			input();
			backtracking(1);
			System.out.println("#" + tc + " " + min);
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		solve();
	}
}