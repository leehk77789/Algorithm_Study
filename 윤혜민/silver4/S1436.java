package baekjoon;

import java.util.Scanner;

public class S1436 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		long num = 0;
		int cnt = 0;
		while (cnt < N) {
			strNum = Long.toString(num);
			if (checkSix()) {
				cnt++;
			}
			if (cnt < N)
				num++;

		}

		System.out.println(num);
	}

	static String strNum;

	public static boolean checkSix() {

		for (int i = 0; i < strNum.length() - 2; i++) {
			if (strNum.charAt(i) == '6' && strNum.charAt(i + 1) == '6' && strNum.charAt(i + 2) == '6') {
				return true;
			}
		}

		return false;
	}
}