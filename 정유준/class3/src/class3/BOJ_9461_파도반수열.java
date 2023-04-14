package class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BOJ_9461_파도반수열 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static String[] input;
	static ArrayList<Long> arr;
	static int num;

	static void input() throws NumberFormatException, IOException {
		num = Integer.parseInt(br.readLine());
		arr = new ArrayList<>();
		arr.add((long) 0);
		arr.add((long) 1);
		arr.add((long) 1);
		arr.add((long) 1);
		arr.add((long) 2);
	}

	static void find() {
		if (num == 1 || num == 2 || num == 3) {
			sb.append(1).append("\n");
			return;
		} else if (num == 4) {
			sb.append(2).append("\n");
			return;
		}

		int idx = 5;
		while (true) {
			if (idx == num) {
				sb.append(arr.get(idx - 2) + arr.get(idx - 3)).append("\n");
				break;
			}
			arr.add(arr.get(idx - 2) + arr.get(idx - 3));
			idx++;
		}
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
