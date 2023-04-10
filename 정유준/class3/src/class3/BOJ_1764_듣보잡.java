package class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class BOJ_1764_듣보잡 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static String[] input;
	static int count;

	static HashMap<String, Integer> map;
	static ArrayList<String> answer;

	static void input() throws NumberFormatException, IOException {
		input = br.readLine().split(" ");
		map = new HashMap<>();
		answer = new ArrayList<>();

		int dut = Integer.parseInt(input[0]);
		int bo = Integer.parseInt(input[1]);
		count = 0;
		String str;

		for (int i = 0; i < dut; i++) {
			str = br.readLine();
			map.put(str, i);
		}

		for (int i = 0; i < bo; i++) {
			str = br.readLine();
			if (map.containsKey(str)) {
				count++;
				answer.add(str);
			}
		}
		Collections.sort(answer);
		sb.append(count).append("\n");
		for (int i = 0; i < answer.size(); i++) {
			sb.append(answer.get(i)).append("\n");
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
