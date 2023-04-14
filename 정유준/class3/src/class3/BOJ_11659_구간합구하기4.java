package class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_11659_구간합구하기4 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static String[] input;
	static int numAmount;
	static int count;
	static int[] arr;
	static int[] answer;

	static void input() throws NumberFormatException, IOException {
		input = br.readLine().split(" ");
		numAmount = Integer.parseInt(input[0]);
		count = Integer.parseInt(input[1]);
		arr = new int[numAmount + 1];
		answer = new int[numAmount + 1];
		input = br.readLine().split(" ");
		for (int i = 0; i < input.length; i++) {
			arr[i + 1] = Integer.parseInt(input[i]);
		}
		for (int i = 1; i < answer.length; i++) {
			answer[i] = answer[i - 1] + arr[i];
		}
	}

	static void find() throws IOException {
		for (int i = 1; i <= count; i++) {
			input = br.readLine().split(" ");
			int num = answer[Integer.parseInt(input[1])] - answer[Integer.parseInt(input[0]) - 1];
			sb.append(num).append("\n");
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
