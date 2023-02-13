package feb;

import java.util.Scanner;

public class _1712 {

	// 고정 비용 A만원 3
	// 한대 노트북:재표비+인건비 B만원(가변) 2
	// C만원 노트북 가격 1
	// 노트북 대수 :num
	public static void main(String[] args) {

		int num = 0;

		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();

		if (B >= C) {
			System.out.println("-1");
		} else {
			for (; true; num++) {
				if (A < (C - B) * num) {
					System.out.println(num);
					break;
				}
			}
		}
	}
}
