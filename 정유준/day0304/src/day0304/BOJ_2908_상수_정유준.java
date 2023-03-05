package day0304;

import java.util.Scanner;

public class BOJ_2908_상수_정유준 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num1 = sc.next();
		String num2 = sc.next();
		String reverseNum1 = "";
		String reverseNum2 = "";
		for (int i = 2; i >= 0; i--) {
			reverseNum1 += num1.charAt(i);
			reverseNum2 += num2.charAt(i);
		}

		int a = Integer.parseInt(reverseNum1);
		int b = Integer.parseInt(reverseNum2);

		if (a > b) {
			System.out.println(a);
		} else {
			System.out.println(b);
		}
	}
}
