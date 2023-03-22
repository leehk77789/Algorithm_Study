package day0322;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SWEA_1217_거듭제곱_정유준 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int basicNum;
	static int multi;

	static void input() throws IOException {
		String[] input = br.readLine().split(" ");
		basicNum = Integer.parseInt(input[0]);
		multi = Integer.parseInt(input[1]);
	}

	static long cal(int basicNum, int multi) {
		if (multi == 0) {
			return 1;
		}
		return basicNum * cal(basicNum, multi - 1);
	}

	static void solve() throws NumberFormatException, IOException {
//		for (int tc = 1; tc <= 10; tc++) {
		int testCase = Integer.parseInt(br.readLine());
		input();
		long answer = cal(basicNum, multi);
//		System.out.println("#" + tc + " " + answer);
		System.out.println(answer);
//		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		solve();
	}
}
