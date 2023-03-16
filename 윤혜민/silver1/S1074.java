package baekjoon;

import java.util.Scanner;

public class S1074 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int r = sc.nextInt();
		int c = sc.nextInt();

		System.out.println(recursion(n, r, c));
	}

	static int recursion(int n, int r, int c) {
		int mid = (int) Math.pow(2, n - 1);
		if (n == 0) {
			return 0;
		}

		if (r < mid && c < mid) {
			return recursion(n - 1, r, c);
		} else if (r >= mid && c < mid) {
			return 2 * mid * mid + recursion(n - 1, r - mid, c);
		} else if (r < mid && c >= mid) {
			return mid * mid + recursion(n - 1, r, c - mid);
		} else
			return 3 * mid * mid + recursion(n - 1, r - mid, c - mid);

	}
}
