import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 동전거스름돈 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static String[] input;
	static int money;
	static int[] dp;

	static void input() throws NumberFormatException, IOException {
		money = Integer.parseInt(br.readLine());
		// 거스름돈의 최소개수를 구하고 싶다.
		// 사용할 수 있는 동전의 가지수는 1, 4, 6

		dp = new int[money + 1];
	}

	static void find() {
		for (int i = 1; i <= money; i++) {
			int min = Integer.MAX_VALUE;
			// 1원 작은 부분문제에 1원을 추가하는 경우
			min = Math.min(min, dp[i - 1] + 1);
			// 4원 작은 부분문제에 4원을 추가하는 경우
			if (i >= 4) {
				min = Math.min(min, dp[i - 4] + 1);
			}
			// 6원 작은 부분문제에 6원을 추가하는 경우
			if (i >= 6) {
				min = Math.min(min, dp[i - 6] + 1);
			}
			dp[i] = min;
		}
		sb.append(dp[money]);
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
