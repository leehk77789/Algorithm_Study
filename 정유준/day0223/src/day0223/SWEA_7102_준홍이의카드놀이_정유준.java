package day0223;

import java.util.Scanner;

public class SWEA_7102_준홍이의카드놀이_정유준 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		for (int idx = 1; idx <= testCase; idx++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			int[] Narr = new int[N + 1];
			int[] Marr = new int[M + 1];
			int[] addCount = new int[N + M + 2];
			int max = 0;
			for (int i = 1; i < Narr.length; i++) {
				Narr[i] = i;
			}
			for (int i = 1; i < Marr.length; i++) {
				Marr[i] = i;
			}

			for (int i = 1; i < Narr.length; i++) {
				for (int j = 1; j < Marr.length; j++) {
					int whatIdx = Narr[i] + Marr[j];
					addCount[whatIdx]++;
				}
			}

			for (int i = 1; i < addCount.length; i++) {
				if (addCount[i] > max) {
					max = addCount[i];
				}
			}

			System.out.print("#" + idx + " ");
			for (int i = 1; i < addCount.length; i++) {
				if (addCount[i] == max) {
					System.out.print(i + " ");
				}
			}
			System.out.println();
		}
	}
}
