import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SWEA_1952_수영장_정유준 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static String[] input;
	static int day;
	static int month;
	static int three;
	static int year;
	static int[] dp;
	static int[] plan;
	static int min;

	static void input() throws NumberFormatException, IOException {
		input = br.readLine().split(" ");
		day = Integer.parseInt(input[0]);
		month = Integer.parseInt(input[1]);
		three = Integer.parseInt(input[2]);
		year = Integer.parseInt(input[3]);

		plan = new int[13];
		dp = new int[13];

		input = br.readLine().split(" ");
		for (int i = 1; i <= 12; i++) {
			plan[i] = Integer.parseInt(input[i - 1]);
		}

		dp[1] = Math.min(plan[1] * day, month);
	}

	static void find() {
		for (int i = 2; i <= 12; i++) {
			min = Integer.MAX_VALUE;

			if (i == 12) {
				min = Math.min(min, year);
			}
			if (i >= 3) {
				min = Math.min(min, dp[i - 3] + three);
			}
			if (i >= 2) {
				min = Math.min(min, dp[i - 1] + month);
			}
			if (i >= 2) {
				min = Math.min(min, dp[i - 1] + (day * plan[i]));
			}
			dp[i] = min;
		}
		sb.append(dp[12]).append("\n");
	}

	static void solve() throws NumberFormatException, IOException {
		int testCase = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= testCase; tc++) {
			sb.append("#").append(tc).append(" ");
			input();
			find();
		}
		System.out.println(sb);
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		solve();
	}
}
