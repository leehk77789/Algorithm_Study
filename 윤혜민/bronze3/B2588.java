package baekjoon;

import java.util.*;

public class B2588 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int H = sc.nextInt();
		int M = sc.nextInt();
		int oven = sc.nextInt();

		int hour = 0;
		int min = 0;

		hour = H + oven / 60;
		if (hour >= 24) {
			hour %= 24;
		}

		min = M + oven % 60;
		if (min >= 60) {
			min %= 60;
			hour++;
		}
//		if (H + oven / 60 < 24) {
//			hour = (H + oven / 60);
//
//		} else if (H + oven / 60 >= 24) {
//			hour = (H + oven / 60) - 24;
//		}
//
//		if (M + oven % 60 < 60) {
//			min = M + oven % 60;
//		} else if (M + oven % 60 >= 60) {
//			min = M + oven % 60 - 60;
//			hour += 1;
//		}
		if (hour == 24)
			hour = 0;

		System.out.println(hour + " " + min);
	}

}
