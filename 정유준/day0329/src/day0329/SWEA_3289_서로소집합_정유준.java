package day0329;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SWEA_3289_서로소집합_정유준 {
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
					System.out.print(1);
				} else {
					System.out.print(0);
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
		int testCase = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= testCase; tc++) {
			System.out.print("#" + tc + " ");
			input();
			System.out.println();
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		solve();
	}
}
