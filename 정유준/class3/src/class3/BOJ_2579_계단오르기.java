package class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2579_계단오르기 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static int amount;
	static int[] score;
	static int[] dp;

	static void input() throws NumberFormatException, IOException {
		amount = Integer.parseInt(br.readLine());
		score = new int[amount + 1];
		dp = new int[amount + 1];
		for (int i = 1; i <= amount; i++) {
			score[i] = Integer.parseInt(br.readLine());
		}
	}

	static void dp() {
		dp[amount] = score[amount];
		int count = 0;
		for (int i = amount - 1; i >= 2; i++) {
			dp[i] = dp[i + 1] + score[i];
			dp[i - 1] = Math.max(dp[i], dp[i + 1] + score[i - 1]);
		}
		sb.append(dp[1]);
	}

	static void solve() throws NumberFormatException, IOException {
		input();
		dp();
		System.out.println(sb);
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		solve();
	}
}
