package day0224;

import java.util.Scanner;

public class SWEA_2805_농작물수확하기_정유준 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();

		for (int idx = 1; idx <= testCase; idx++) {
			int nongZangSize = sc.nextInt();
			int middle = nongZangSize / 2;
			int sum = 0;

			for (int row = 0; row < nongZangSize; row++) {
				String nongzakmul = sc.next();
				for (int col = 0; col < nongZangSize; col++) {
					if (Math.abs(middle - row) + Math.abs(middle - col) <= middle) {
						sum += Character.getNumericValue(nongzakmul.charAt(col));

					}
				}
			}
			System.out.println("#" + idx + " " + sum);
		}
	}
}
