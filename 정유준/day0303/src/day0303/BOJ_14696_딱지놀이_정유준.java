package day0303;

import java.util.Scanner;

public class BOJ_14696_딱지놀이_정유준 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int testCase = sc.nextInt();
		for (int i = 1; i <= testCase; i++) {
			int aDdakzzi = sc.nextInt();
			int[] a = new int[5];
			for (int j = 1; j <= aDdakzzi; j++) {
				int ddakziNum = sc.nextInt();
				a[ddakziNum]++;
			}

			int bDdakzzi = sc.nextInt();
			int[] b = new int[5];
			for (int j = 1; j <= bDdakzzi; j++) {
				int ddakziNum = sc.nextInt();
				b[ddakziNum]++;
			}

			for (int j = 4; j >= 1; j--) {
				if (b[j] > a[j]) {
					System.out.println("B");
					break;
				} else if (a[j] > b[j]) {
					System.out.println("A");
					break;
				}
				if (j == 1) {
					System.out.println("D");
				}
			}
		}
	}
}
