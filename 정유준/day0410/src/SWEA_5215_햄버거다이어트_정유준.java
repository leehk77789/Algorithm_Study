import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SWEA_5215_햄버거다이어트_정유준 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static String[] input;
	static int[] del;
	static int[] kal;
	static int[] dp;
	static int jae;
	static int limit;

	static void input() throws NumberFormatException, IOException {
		input = br.readLine().trim().split(" ");
		jae = Integer.parseInt(input[0]);
		limit = Integer.parseInt(input[1]);

		del = new int[jae + 1];
		kal = new int[jae + 1];

		for (int i = 1; i <= jae; i++) {
			input = br.readLine().trim().split(" ");
			del[i] = Integer.parseInt(input[0]);
			kal[i] = Integer.parseInt(input[1]);
		}

		dp = new int[limit + 1];
	}

	static void find() {
		for (int i = 1; i <= jae; i++) {
			for (int j = limit; j >= 1; j--) {
				if (kal[i] <= j) {
					dp[j] = Math.max(dp[j], dp[j - kal[i]] + del[i]);
				}
			}
		}
	}

	static void solve() throws NumberFormatException, IOException {
		int testCase = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= testCase; tc++) {
			input();
			find();
			sb.append("#").append(tc).append(" ").append(dp[limit]).append("\n");
		}
		System.out.println(sb);
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		solve();
	}
}
