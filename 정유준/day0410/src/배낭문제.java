import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 배낭문제 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static int N;
	static int W;
	static int[] weights;
	static int[] cost;
	static int[][] dp;

	static void input() throws NumberFormatException, IOException {
		N = Integer.parseInt(br.readLine());
		W = Integer.parseInt(br.readLine());
		weights = new int[N + 1];
		cost = new int[N + 1];

		for (int i = 1; i <= N; i++) {
			weights[i] = Integer.parseInt(br.readLine());
			cost[i] = Integer.parseInt(br.readLine());
		}
		dp = new int[N + 1][N + 1];
	}

	static void find() {
		for (int i = 1; i <= N; i++) {
			// 각각의 아이템을 이용하여 최적해 갱신
			// w : 임시 배낭의 크기
			for (int w = 0; w <= W; w++) {
				if (weights[i] <= w) {
					// 해당 물건을 넣을지 말지 판단을 해보겠다.
					// 해당 w의 최적해 : dp[i-1][w]
					// 이번 물건을 고려하는 최적해 : dp[i-1][w-weights[i]]+cost[i]
					dp[i][w] = Math.max(dp[i - 1][w], dp[i - 1][w - weights[i]] + cost[i]);
				} else {
					// 현재 임시무게가 지금 물건을 담을 수 없어서 고려 제외
					dp[i][w] = dp[i - 1][w];
				}
				sb.append(dp[i][w]);
			}
		}
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
