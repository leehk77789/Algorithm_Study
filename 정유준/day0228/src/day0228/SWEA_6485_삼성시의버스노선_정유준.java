package day0228;

import java.util.Scanner;

public class SWEA_6485_삼성시의버스노선_정유준 {
	static Scanner sc = new Scanner(System.in);
	static int busNosunMove[];
	static int busJeongruejangNum[];
	static int busNosun;
	static int count;
	static int busJeongruejang;

	static void input() {
		// N
		busNosun = sc.nextInt();

		// 버스 노선 운행할 배열 생성
		busNosunMove = new int[5001];

		for (int i = 1; i <= busNosun; i++) {
			// A
			int busNosunMin = sc.nextInt();

			// B
			int busNosunMax = sc.nextInt();
			for (int j = busNosunMin; j <= busNosunMax; j++) {
				busNosunMove[j]++;
			}
		}

		// P
		busJeongruejang = sc.nextInt();

		// C값들 입력받기
		for (int i = 0; i < busJeongruejang; i++) {
			int idx = sc.nextInt();
			System.out.print(busNosunMove[idx] + " ");
		}
	}

	static void solve() {
		int testCase = sc.nextInt();
		for (int idx = 1; idx <= testCase; idx++) {
			System.out.print("#" + idx + " ");
			input();
			System.out.println();
		}
	}

	public static void main(String[] args) {
		solve();
	}

}
