package day0328;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SWEA_1952_수영장_정유준 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int[] charge;
	static int[] month;
	static int minCharge;
	static int sumCharge;

	static void input() throws IOException {
		charge = new int[4];
		month = new int[12];

		String[] input = br.readLine().split(" ");
		for (int i = 0; i < 4; i++) {
			charge[i] = Integer.parseInt(input[i]);
		}

		input = br.readLine().split(" ");
		for (int i = 0; i < 12; i++) {
			month[i] = Integer.parseInt(input[i]);
		}
		minCharge = charge[3];
		sumCharge = 0;
	}

	static void backtracking(int depth) {
		if (sumCharge > minCharge) {
			return;
		}

		if (depth >= 12) {
			minCharge = Math.min(minCharge, sumCharge);
			return;
		}

		if (month[depth] != 0) {
			sumCharge += month[depth] * charge[0];
			backtracking(depth + 1);
			sumCharge -= month[depth] * charge[0];
			sumCharge += charge[1];
			backtracking(depth + 1);
			sumCharge -= charge[1];
			sumCharge += charge[2];
			backtracking(depth + 3);
			sumCharge -= charge[2];
		} else {
			backtracking(depth + 1);
		}
	}

	static void solve() throws NumberFormatException, IOException {
		int testCase = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= testCase; tc++) {
			input();
			backtracking(0);
			System.out.println("#" + tc + " " + minCharge);
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		solve();
	}
}
