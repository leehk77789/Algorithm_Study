package class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1003_피보나치함수 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static String[] input;
	static Integer[][] arr;

	static void input() throws NumberFormatException, IOException {
		arr = new Integer[41][2];
		arr[0][0] = 1;
		arr[0][1] = 0;
		arr[1][0] = 0;
		arr[1][1] = 1;
	}

	static void find() throws NumberFormatException, IOException {
		int tc = Integer.parseInt(br.readLine());

		while (true) {
			int N = Integer.parseInt(br.readLine());
			jaegui(N);
			sb.append(arr[N][0] + " " + arr[N][1]).append("\n");
			tc--;
			if (tc == 0) {
				break;
			}
		}
	}

	static Integer[] jaegui(int n) {
		if (arr[n][0] == null || arr[n][1] == null) {
			arr[n][0] = jaegui(n - 1)[0] + jaegui(n - 2)[0];
			arr[n][1] = jaegui(n - 1)[1] + jaegui(n - 2)[1];
		}
		return arr[n];
	}

	static void solve() throws NumberFormatException, IOException {
		input();
		find();
		System.out.println(sb);
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		solve();
	}
}
