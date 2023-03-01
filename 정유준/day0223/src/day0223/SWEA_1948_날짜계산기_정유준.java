package day0223;

import java.util.Scanner;

public class SWEA_1948_날짜계산기_정유준 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		for (int idx = 1; idx <= testCase; idx++) {
			int count = 0;
			int month1 = sc.nextInt();
			int day1 = sc.nextInt();
			int month2 = sc.nextInt();
			int day2 = sc.nextInt();

			int[] date = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
			if (month1 != month2) {
				count += (date[month1] - day1) + day2;
				month1++;
				while (month1 != month2 && month1 <= 12) {
					count += date[month1];
					month1++;
				}
			} else {
				count = day2 - day1;
			}

			System.out.println("#" + idx + " " + (count + 1));
		}
	}
}
