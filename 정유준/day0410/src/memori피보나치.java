
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class memori피보나치 {
	static long callFibo;
	static long[] memo;
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static String[] input;
	static int N;

	static void input() throws NumberFormatException, IOException {
		N = Integer.parseInt(br.readLine());

		memo = new long[N + 1];
		memo[1] = 1;
	}

	static long fibo1(int n) {
		callFibo++;
		if (n >= 2 && memo[n] == 0) {
			memo[n] = fibo1(n - 1) + fibo1(n - 2);
		}
		return memo[n];
	}

	static long fibo2(int n) {
		long[] dp = new long[n + 1];
		dp[1] = 1;

		for (int i = 2; i <= n; i++) {
			dp[i] = dp[i - 2] + dp[i - 1];
		}
		return dp[n];
	}

	static void solve() throws NumberFormatException, IOException {
		input();
		sb.append(fibo1(N)).append("\n");
		sb.append(callFibo).append("\n");
		sb.append(fibo2(N)).append("\n");
		sb.append(callFibo).append("\n");

		System.out.println(sb);
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		solve();
	}
}
