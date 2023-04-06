package class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1676_팩토리얼0의개수 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static String input;
	static int num;
	static int count;

	static void input() throws NumberFormatException, IOException {
		num = Integer.parseInt(br.readLine());
		count = 0;
	}

	static void fac() {
		while (num >= 5) {
			count += num / 5;
			num /= 5;
		}
		sb.append(count);
	}

	static void solve() throws NumberFormatException, IOException {
		input();
		fac();
		System.out.println(sb);
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		solve();
	}
}
