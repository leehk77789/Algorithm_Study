package day0305;

import java.util.Scanner;

public class BOJ_2606_바이러스_정유준 {

	static Scanner sc = new Scanner(System.in);

	static int node;

	static int linkedNum;

	static int[][] virus;

	static int count;

	static boolean[] check;

	static void input() {
		count = 0;
		node = sc.nextInt();
		linkedNum = sc.nextInt();
		virus = new int[node + 1][node + 1];
		check = new boolean[node + 1];

		for (int i = 0; i < linkedNum; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			virus[a][b] = virus[b][a] = 1;
		}
	}

	static void dfs(int a) {
		check[a] = true;

		count++;

		for (int i = 0; i <= node; i++) {
			if (virus[a][i] == 1 && !check[i]) {
				dfs(i);
			}
		}
	}

	static void solve() {
		input();
		dfs(1);
		System.out.println(count - 1);
	}

	public static void main(String[] args) {
		solve();
	}
}
