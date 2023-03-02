package baekjoon;

import java.util.Scanner;

public class b10158 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 가로 길이
		int w = sc.nextInt();

		// 세로 길이
		int h = sc.nextInt();

		// 개미 위치 x & y
		int p = sc.nextInt();
		int q = sc.nextInt();

		// t 시간
		int t = sc.nextInt();

		// 얼마나 움직였는지
		int x = t % (2 * w);
		int y = t % (2 * h);

		// 움직인 후의 위치
		p = p + x;

		// 초과했을 경우 방향 전환
		if (p > w) {
			p = w - (p - w);
		}
		if (p < 0) {
			p *= -1;
		}

		// 움직인 후의 위치
		q = q + y;

		// 초과했을 경우 방향 전환
		if (q > h) {
			q = h - (q - h);
		}
		if (q < 0) {
			q *= -1;
		}

		System.out.println(p + " " + q);
	}
}
