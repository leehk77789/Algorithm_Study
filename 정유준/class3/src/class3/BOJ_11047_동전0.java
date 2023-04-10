package class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_11047_동전0 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static String[] input;
	static int[] value;
	static int target;
	static int count;

	static void input() throws NumberFormatException, IOException {
		input = br.readLine().split(" ");
		int amount = Integer.parseInt(input[0]);
		target = Integer.parseInt(input[1]);
		value = new int[amount];

		for (int i = 0; i < amount; i++) {
			value[i] = Integer.parseInt(br.readLine());
		}
	}

	static void find() {
		int idx = value.length - 1;
		while (true) {
			if (target == 0) {
				sb.append(count);
				return;
			}
			if (target - value[idx] >= 0) {
				target -= value[idx];
				count++;
			} else {
				idx--;
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
