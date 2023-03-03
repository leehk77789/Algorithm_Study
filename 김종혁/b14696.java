package baekjoon;

import java.util.Scanner;

public class b14696 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		for (int i = 0; i < N; i++) {
			int[] A = new int[4];
			int[] B = new int[4];

			int a = sc.nextInt();
			for (int j = 0; j < a; j++) {
				int aa = sc.nextInt();
				A[aa - 1]++;
			}
			int b = sc.nextInt();
			for (int k = 0; k < b; k++) {
				int bb = sc.nextInt();
				B[bb - 1]++;
			}

			if (A[3] > B[3]) {
				System.out.println("A");
			} else if (A[3] < B[3]) {
				System.out.println("B");
			} else if (A[2] > B[2]) {
				System.out.println("A");
			} else if (A[2] < B[2]) {
				System.out.println("B");
			} else if (A[1] > B[1]) {
				System.out.println("A");
			} else if (A[1] < B[1]) {
				System.out.println("B");
			} else if (A[0] > B[0]) {
				System.out.println("A");
			} else if (A[0] < B[0]) {
				System.out.println("B");
			} else {
				System.out.println("D");
			}

		}
	}
}
