package 알고리즘스레기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_20040_사이클게임_정유준 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static int[] par;
	static String[] input;
	static int answer;

	static void input() throws NumberFormatException, IOException {
		input = br.readLine().split(" ");
		int spot = Integer.parseInt(input[0]);
		int line = Integer.parseInt(input[1]);
		par = new int[spot];
		for (int idx = 0; idx < spot; idx++) {
			par[idx] = idx;
		}

		answer = 0;

		for (int i = 1; i <= line; i++) {
			input = br.readLine().split(" ");
			int a = Integer.parseInt(input[0]);
			int b = Integer.parseInt(input[1]);
			if (!union(a, b)) {
				answer = i;
				break;
			}
		}

		sb.append(answer);

//		for (int i = 0; i < line; i++) {
//			for (int j = 0; j < 2; j++) {
//				System.out.print(link[i][j] + " ");
//			}
//			System.out.println();
//		}
	}

	static boolean union(int x, int y) {
		x = find(x);
		y = find(y);

		if (x == y) {
			return false;
		}

		par[x] = y;
		return true;
	}

	static int find(int x) {
		if (par[x] == x) {
			return x;
		}

		return par[x] = find(par[x]);
	}

	static void solve() throws NumberFormatException, IOException {
		input();
		System.out.println(sb);
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		solve();
	}
}
