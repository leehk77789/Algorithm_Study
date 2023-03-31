package day0316;

import java.util.Arrays;
import java.util.Scanner;

public class boj18511 {

	static int num;
	static int n;
	static int ans;
	static int[] arr;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 최대수
		num = sc.nextInt();
		// 원소개수
		n = sc.nextInt();
		arr = new int[n];
		// 원소 입력받음
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		dfs(0);
		System.out.println(ans);
	}

	static void dfs(int now) {
		if (now > num)
			return;

		if (ans < now)
			ans = now;

		for (int i = n - 1; i > -1; i--) {
			dfs(now * 10 + arr[i]);
		}
	}
}
