package baekjoon;

import java.util.Scanner;

public class b2839 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int kilo = sc.nextInt();
		int tmp = kilo;
		int cnt = 0;

		while (tmp % 5 != 0) {
			cnt++;
			tmp -= 3;
			

			if (tmp < 0) {
				cnt = -1;
				break;
			}
		}

		if (cnt != -1) {
			int cntF = (kilo - (3 * cnt)) / 5;
			System.out.println(cnt + cntF);
		} else {
			System.out.println(cnt);
		}
	}
}