package class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_9095_123더하기 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static String input;
	static int num;
	static int count;
	static int basic;

	static void input() throws NumberFormatException, IOException {
		num = Integer.parseInt(br.readLine());
		count = 0;
		basic = 0;
	}

	static void find() {
		if (basic > num) {
			return;
		}
		if (basic == num) {
			count++;
			return;
		}

		basic += 3;
		find();
		basic -= 3;
		basic += 2;
		find();
		basic -= 2;
		basic += 1;
		find();
		basic -= 1;
	}

	static void solve() throws NumberFormatException, IOException {
		int testCase = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= testCase; tc++) {
			input();
			find();
			sb.append(count).append("\n");
		}
		System.out.println(sb);
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		solve();
	}
}
