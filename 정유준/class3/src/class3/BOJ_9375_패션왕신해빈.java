package class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class BOJ_9375_패션왕신해빈 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static String[] input;
	static HashMap<String, Integer> map;
	static int count;

	static void input() throws NumberFormatException, IOException {
		map = new HashMap<>();
		count = 0;

		int num = Integer.parseInt(br.readLine());
		for (int i = 1; i <= num; i++) {
			input = br.readLine().split(" ");
			if (!map.containsKey(input[1])) {
				map.put(input[1], 1);
			} else {
				map.put(input[1], map.get(input[1]) + 1);
			}
		}
	}

	static void find() {
		count = 1;
		for (int val : map.values()) {
			count *= val + 1;
		}
		sb.append(count - 1).append("\n");
	}

	static void solve() throws NumberFormatException, IOException {
		int testCase = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= testCase; tc++) {
			input();
			find();
		}
		System.out.println(sb);
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		solve();
	}
}
