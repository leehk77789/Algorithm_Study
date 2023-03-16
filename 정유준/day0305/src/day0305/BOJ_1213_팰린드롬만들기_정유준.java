package day0305;

import java.util.Scanner;

public class BOJ_1213_팰린드롬만들기_정유준 {

	static Scanner sc = new Scanner(System.in);
	static String str;
	static int[] ch;
	static int middle;
	static char[] answer;

	static void input() {
		str = sc.next();
		ch = new int[26];
		answer = new char[str.length()];

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'A') {
				ch[0]++;
			} else if (str.charAt(i) == 'B') {
				ch[1]++;
			} else if (str.charAt(i) == 'C') {
				ch[2]++;
			} else if (str.charAt(i) == 'D') {
				ch[3]++;
			} else if (str.charAt(i) == 'E') {
				ch[4]++;
			} else if (str.charAt(i) == 'F') {
				ch[5]++;
			} else if (str.charAt(i) == 'G') {
				ch[6]++;
			} else if (str.charAt(i) == 'H') {
				ch[7]++;
			} else if (str.charAt(i) == 'I') {
				ch[8]++;
			} else if (str.charAt(i) == 'J') {
				ch[9]++;
			} else if (str.charAt(i) == 'K') {
				ch[10]++;
			} else if (str.charAt(i) == 'L') {
				ch[11]++;
			} else if (str.charAt(i) == 'M') {
				ch[12]++;
			} else if (str.charAt(i) == 'N') {
				ch[13]++;
			} else if (str.charAt(i) == 'O') {
				ch[14]++;
			} else if (str.charAt(i) == 'P') {
				ch[15]++;
			} else if (str.charAt(i) == 'Q') {
				ch[16]++;
			} else if (str.charAt(i) == 'R') {
				ch[17]++;
			} else if (str.charAt(i) == 'S') {
				ch[18]++;
			} else if (str.charAt(i) == 'T') {
				ch[19]++;
			} else if (str.charAt(i) == 'U') {
				ch[20]++;
			} else if (str.charAt(i) == 'V') {
				ch[21]++;
			} else if (str.charAt(i) == 'W') {
				ch[22]++;
			} else if (str.charAt(i) == 'X') {
				ch[23]++;
			} else if (str.charAt(i) == 'Y') {
				ch[24]++;
			} else if (str.charAt(i) == 'Z') {
				ch[25]++;
			}
		}
	}

	static boolean checkHol() {
		int count = 0;
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] % 2 != 0) {
				count++;
				middle = i;
			}
			if (count == 2) {
				return false;
			}
		}
		return true;
	}

	static void makeArr() {
		answer[answer.length / 2] = (char) (65 + middle);
		for(int i = 0; i < )
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	}
}
