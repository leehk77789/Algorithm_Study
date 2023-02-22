package bochung;

import java.util.Scanner;

public class SWEA1945 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		for (int idx = 1; idx <= testCase; idx++) {
			int N = sc.nextInt();
			int[] divideCount = new int[5];

			while (N % 2 == 0) {
				N /= 2;
				divideCount[0]++;
			}
			while (N % 3 == 0) {
				N /= 3;
				divideCount[1]++;
			}
			while (N % 5 == 0) {
				N /= 5;
				divideCount[2]++;
			}
			while (N % 7 == 0) {
				N /= 7;
				divideCount[3]++;
			}
			while (N % 11 == 0) {
				N /= 11;
				divideCount[4]++;
			}
			System.out.printf("#%d %d %d %d %d %d", idx, divideCount[0], divideCount[1], divideCount[2], divideCount[3],
					divideCount[4]);
			System.out.println();
		}

	}
}
