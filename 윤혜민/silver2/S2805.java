package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class S2805 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int length = sc.nextInt();
		int[] tree = new int[N];
		for (int i = 0; i < N; i++) {
			tree[i] = sc.nextInt();
		}
		Arrays.sort(tree);
		long start = 0;
		long end = tree[N - 1];
		long mid = 0;
		long cnt = 0;
		while (start <= end) {
			cnt = 0;
			mid = (start + end) / 2;
			for (int i = 0; i < N; i++) {
				if (mid < tree[i]) {
					cnt += tree[i] - mid;
				}
			}
			if (cnt < length) {
				end = mid - 1;
			} else if (cnt == length) {
				break;
			} else {
				cnt = 0;
				for (int i = 0; i < N; i++) {
					if (mid + 1 < tree[i]) {
						cnt += tree[i] - mid - 1;
					}
				}
				if (cnt < length)
					break;
				else
					start = mid + 1;
			}
		}
		System.out.println(mid);
	}
}
