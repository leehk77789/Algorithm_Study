package day0330;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class SWEA_1238_Contact_정유준 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static int dataAmount;
	static int[][] adj;
	static boolean[] check;
	static int[] depth;
	static Queue<Integer> q = new LinkedList<Integer>();
	static int answer;
	static int start;
	static int curr;

	static void input() throws NumberFormatException, IOException {
		String[] input = br.readLine().split(" ");
		dataAmount = Integer.parseInt(input[0]);
		start = Integer.parseInt(input[1]);
		adj = new int[101][101];
		curr = 0;
		answer = 0;

		input = br.readLine().split(" ");
		for (int idx = 0; idx < input.length; idx += 2) {
			adj[Integer.parseInt(input[idx])][Integer.parseInt(input[idx + 1])] = 1;
		}
	}

	static void BFS(int num) {
		check = new boolean[101];
		depth = new int[101];

		q.offer(num);
		check[num] = true;
		depth[num] = 0;

		while (!q.isEmpty()) {
			curr = q.poll();
			for (int i = 0; i < adj.length; i++) {
				if (!check[i] && adj[curr][i] == 1) {
					q.offer(i);
					check[i] = true;
					depth[i] = depth[curr] + 1;
				}
			}
		}

		int max = 0;
		for (int i = 1; i < 101; i++) {
			if (depth[i] >= max) {
				max = depth[i];
				answer = i;
			}
		}
	}

	static void solve() throws NumberFormatException, IOException {
		for (int tc = 1; tc <= 10; tc++) {
			input();
			BFS(start);
			sb.append("#" + tc + " " + answer + "\n");
		}
		System.out.println(sb);
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		solve();
	}
}
