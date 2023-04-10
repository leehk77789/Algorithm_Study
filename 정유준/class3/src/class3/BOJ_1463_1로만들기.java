package class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1463_1로만들기 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int target;
	static int[] dp;

	static void input() throws NumberFormatException, IOException {
		target = Integer.parseInt(br.readLine());
		dp = new int[target + 1];
		dp[1] = 0;
		if (target >= 2) {
			dp[2] = 1;
		}
		if (target >= 3) {
			dp[3] = 1;
		}
	}

	static void find() {
		if (target == 3 || target == 2) {
			System.out.println(1);
			return;
		}
		if (target == 1) {
			System.out.println(0);
			return;
		}

		for (int i = 4; i <= target; i++) {
			dp[i] = dp[i - 1] + 1;
			if (i % 3 == 0 && dp[i] > dp[i / 3] + 1) {
				dp[i] = dp[i / 3] + 1;
			}
			if (i % 2 == 0 && dp[i] > dp[i / 2] + 1) {
				dp[i] = dp[i / 2] + 1;
			}
		}
		System.out.println(dp[target]);
	}

	static void solve() throws NumberFormatException, IOException {
		input();
		find();
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		solve();
	}
}
