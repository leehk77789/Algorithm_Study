import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 설탕배달dp {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static String input;
	static int amount;
	static int[] dp;

	static void input() throws NumberFormatException, IOException {
		amount = Integer.parseInt(br.readLine());
		dp = new int[amount + 1];
		if (amount >= 3) {
			dp[3] = 1;
		}
		if (amount >= 5) {
			dp[5] = 1;
		}
	}

	static void find() {
		for (int i = 6; i <= amount; i++) {
			if (i % 5 == 0) {
				dp[i] = dp[i - 5] + 1;
			} else if (i % 3 == 0) {
				dp[i] = dp[i - 3] + 1;
			} else {
				if (dp[i - 3] != 0 && dp[i - 5] != 0) {
					dp[i] = Math.min(dp[i - 3], dp[i - 5]) + 1;
				}
			}
		}
		if (dp[amount] == 0) {
			sb.append(-1);
			return;
		}
		sb.append(dp[amount]);

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
