package day0302;

import java.util.Scanner;

public class SWEA_1232_사칙연산_정유준 {

	static Scanner sc = new Scanner(System.in);
	static char[] left;
	static char[] right;
	static char top;

	static void input() {
		int howMany = sc.nextInt();
		left = new char[1001];
		right = new char[1001];

		for (int i = 1; i <= howMany; i++) {
			String input = sc.next();
			String[] inputSplit = input.split("\\s");
			if (inputSplit.length == 2) {
				if (Integer.parseInt(inputSplit[0]) / 2 == 0) {
					left[Integer.parseInt(inputSplit[0])] = (char) Integer.parseInt(inputSplit[1]);
				}
			}
		}
	}

	public static void main(String[] args) {

	}
}
