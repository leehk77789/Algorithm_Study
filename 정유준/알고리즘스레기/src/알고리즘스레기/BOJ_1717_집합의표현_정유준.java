package 알고리즘스레기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1717_집합의표현_정유준 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static String[] input;
	static int[] parent;

	static void input() throws NumberFormatException, IOException {
		input = br.readLine().split(" ");
		int size = Integer.parseInt(input[0]);
		parent = new int[size + 1];
		for (int idx = 1; idx <= size; idx++) {
			parent[idx] = idx;
		}
		int arrNum = Integer.parseInt(input[1]);
		for (int i = 1; i <= arrNum; i++) {
			input = br.readLine().split(" ");
			if (input[0].equals("0")) {
				union(Integer.parseInt(input[1]), Integer.parseInt(input[2]));
			} else {
				if (doFind(Integer.parseInt(input[1]), Integer.parseInt(input[2]))) {
					System.out.println("YES");
				} else {
					System.out.println("NO");
				}
			}
		}
	}

	static boolean doFind(int x, int y) {
		if (find(x) == find(y)) {
			return true;
		}
		return false;
	}

	static void union(int x, int y) {
		x = find(x);
		y = find(y);

		if (x == y) {
			return;
		}

		if (x > y) {
			parent[y] = x;
		} else {
			parent[x] = y;
		}
	}

	static int find(int x) {
		if (parent[x] == x) {
			return x;
		}

		return parent[x] = find(parent[x]);
	}

	static void solve() throws NumberFormatException, IOException {
		input();
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		solve();
	}
}
