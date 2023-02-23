package baekjoon;

import java.util.*;

public class B3052 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] num = new int[10];
		for (int i = 0; i < 10; i++) {
			num[i] = sc.nextInt();
		}
		for (int i = 0; i < 10; i++) {
			num[i] = num[i] % 42;
		}
		Set<Integer> four = new HashSet<>();
		for (int i = 0; i < 10; i++) {
			four.add(num[i]);
		}
		System.out.println(four.size());
	}
}
