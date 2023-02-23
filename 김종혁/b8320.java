package baekjoon;

import java.util.Scanner;

public class b8320 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt = 0;

		// 각 수의 약수 및 약수의 약수 구하기
		for (int i = n; i > 0; i--) {
			for (int a = 1; a <= i; a++) {
				if (i % a == 0)
					cnt++;
				// a*a의 경우의 수는 한 번 더 추가
				if (a*a == i)
					cnt++;
			}
		}

		System.out.println((cnt/2));
	}
}
