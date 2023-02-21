package day0220;

import java.util.Scanner;

public class SWEA_5356_의석이의세로로말해요_정유준 {
	static Scanner sc = new Scanner(System.in);
	static char[][] words = new char[5][15];

	static void input() {
		// 배열의 공백을 확인(char는 공백 확인이 없기 때문에 -입력)
		for (int row = 0; row < 5; row++) {
			for (int col = 0; col < 15; col++) {
				words[row][col] = '-';
			}
		}

		for (int row = 0; row < 5; row++) {
			String inputStr = sc.next();
			for (int col = 0; col < inputStr.length(); col++) {
				words[row][col] = inputStr.charAt(col);
			}
		}
	}

	static void print() {
		for (int col = 0; col < 15; col++) {
			for (int row = 0; row < 5; row++) {
				if (words[row][col] == '-') {
					continue;
				} else {
					System.out.print(words[row][col]);
				}
			}
		}
	}

	static void solve() {
		int testCase = sc.nextInt();
		for (int tc = 1; tc <= testCase; tc++) {
			input();
			System.out.print("#" + tc + " ");
			print();
			System.out.println();
		}
	}

	public static void main(String[] args) {
		solve();
	}
}
