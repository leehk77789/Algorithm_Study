package day0220;

import java.util.Scanner;

public class SEWA_2007_패턴마디의길이_정유준 {
	static Scanner sc = new Scanner(System.in);
	static String str;
	static char[] arr;
	static int answerLength;

	static void input() {
		str = sc.next();
		arr = str.toCharArray();
	}

	static void findPattern() {
		// 반복되는지 파악
		for (int idx = 0; idx < arr.length / 2; idx++) {
			// 비교할 2개
			String compare1 = "";
			String compare2 = "";
			for (int i = 0; i <= idx; i++) {
				compare1 += arr[i];
			}
			for (int i = idx + 1; i <= (idx * 2) + 1; i++) {
				compare2 += arr[i];
			}
			if (compare1.equals(compare2)) {
				answerLength = compare1.length();
				break;
			}
		}
	}

	static void solve() {
		int testCase = sc.nextInt();
		for (int tc = 1; tc <= testCase; tc++) {
			input();
			findPattern();
			System.out.println("#" + tc + " " + answerLength);
		}
	}

	public static void main(String[] args) {
		solve();
	}
}
