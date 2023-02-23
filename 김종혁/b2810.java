package baekjoon;

import java.util.Scanner;

public class b2810 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 좌석의 수
		int num = sc.nextInt();
		// 커플석 개수
		int cntL = 0;
		// 싱글석 개수
		int cntS = 0;
		String seat = sc.next();

		// 좌석 세기
		for (int i = 0; i < seat.length(); i++) {
			if (seat.charAt(i) == 'L') {
				cntL++;
			}
			if (seat.charAt(i) == 'S') {
				cntS++;
			}
		}

		// 커플석이 있으면 2로 나눈 뒤 1 더하기 + 싱글석 개수
		for (int i = 0; i < seat.length(); i++) {
			if (seat.contains("L")) {
				System.out.println((cntL/2) + 1 + cntS);
				break;
			} else {
				System.out.println(cntS);
				break;
			}
		}
	}
}
