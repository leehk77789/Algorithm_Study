package day0224;

import java.util.Scanner;

public class SWEA_6190_정곤이의단조증가하는수_정유준 {
	static Scanner sc = new Scanner(System.in);
	static int[] compareInt;
	static int max;
	static int compare1, compare2;
	static String checkNum;

	static void input() {
		int numAmount = sc.nextInt();
		compareInt = new int[numAmount];
		for (int i = 0; i < compareInt.length; i++) {
			compareInt[i] = sc.nextInt();
		}
		max = -100;
	}

	static void findDanzo() {
		for (int i = 0; i < compareInt.length - 1; i++) {
			for (int j = i + 1; j < compareInt.length; j++) {
				compare1 = compareInt[i];
				compare2 = compareInt[j];
				int a = checkDanzo();
				if (a > max) {
					max = a;
				}
			}
		}
	}

	static int checkDanzo() {
		int numIdx = 0;
		checkNum = Integer.toString(compare1 * compare2);
		while (numIdx != checkNum.length() - 1) {
			if (checkNum.charAt(numIdx) > checkNum.charAt(numIdx + 1)) {
				return -1;
			}
			numIdx++;
		}
		return Integer.parseInt(checkNum);
	}

	static void solve() {
		int testCase = sc.nextInt();
		for (int idx = 1; idx <= testCase; idx++) {
			input();
			findDanzo();
			System.out.println("#" + idx + " " + max);
		}
	}

	public static void main(String[] args) {
		solve();
	}
}
