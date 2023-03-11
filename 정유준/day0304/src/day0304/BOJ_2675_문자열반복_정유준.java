package day0304;

import java.util.Scanner;

public class BOJ_2675_문자열반복_정유준 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		for (int idx = 1; idx <= testCase; idx++) {
			int multiAmount = sc.nextInt();
			String original = sc.next();
			for (int i = 0; i < original.length(); i++) {
				for (int j = 0; j < multiAmount; j++) {
					System.out.print(original.charAt(i));
				}
			}
			System.out.println();
		}
	}
}
