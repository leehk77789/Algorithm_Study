package class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class BOJ_17219_비밀번호찾기 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static String[] input;
	static HashMap<String, String> map;

	static void input() throws NumberFormatException, IOException {
		map = new HashMap<>();
		input = br.readLine().split(" ");

		int site = Integer.parseInt(input[0]);
		int find = Integer.parseInt(input[1]);

		for (int i = 0; i < site; i++) {
			input = br.readLine().split(" ");
			map.put(input[0], input[1]);
		}

		for (int i = 0; i < find; i++) {
			String str = br.readLine();
			sb.append(map.get(str)).append("\n");
		}
	}

	static void solve() throws NumberFormatException, IOException {
		input();

		System.out.println(sb);
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		solve();
	}
}
