package 알고리즘스레기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1976_여행가자_정유준 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int[] par;
	static String[] input;
	static int[] plan;
	static int[][] map;

	static void input() throws NumberFormatException, IOException {
		int cityAmount = Integer.parseInt(br.readLine());
		int planAmount = Integer.parseInt(br.readLine());

		par = new int[cityAmount + 1];
		for (int idx = 1; idx <= cityAmount; idx++) {
			par[idx] = idx;
		}
		map = new int[cityAmount + 1][cityAmount + 1];
		for (int idx = 1; idx <= cityAmount; idx++) {
			input = br.readLine().split(" ");
			for (int j = 1; j <= cityAmount; j++) {
				map[idx][j] = Integer.parseInt(input[j - 1]);
			}
		}

		for (int i = map.length - 1; i >= 1; i--) {
			for (int j = map.length - 1; j >= 1; j--) {
				if (map[i][j] == 1) {
					union(i, j);
				}
			}
		}

//		for (int i = 1; i <= planAmount; i++) {
//			for (int j = 1; j <= planAmount; j++) {
//				System.out.print(map[i][j] + " ");
//			}
//			System.out.println();
//		}

//		for (int i = 0; i < input.length; i++) {
//			if (input[i].equals("1")) {
//				union(idx, (i + 1));
//			}
//		}

		input = br.readLine().split(" ");
		plan = new int[input.length];
		for (int idx = 0; idx < input.length; idx++) {
			plan[idx] = Integer.parseInt(input[idx]);
		}
	}

	static void union(int x, int y) {
		x = find(x);
		y = find(y);

		if (x == y) {
			return;
		}

		if (x > y) {
			par[y] = x;
		} else {
			par[x] = y;
		}
	}

	static int find(int x) {
		if (par[x] == x) {
			return x;
		}

		return par[x] = find(par[x]);
	}

	static boolean check() {
		int check = par[plan[0]];
		for (int i = 0; i < plan.length; i++) {
			if (par[plan[i]] != check) {
				return false;
			}
		}
		return true;
	}

	static void solve() throws NumberFormatException, IOException {
		input();
		if (check()) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		solve();
	}
}
