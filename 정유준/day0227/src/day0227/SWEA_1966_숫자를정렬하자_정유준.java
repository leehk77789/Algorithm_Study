package day0227;

import java.util.Scanner;

public class SWEA_1966_숫자를정렬하자_정유준 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();

		for (int idx = 1; idx <= testCase; idx++) {
			int arraySize = sc.nextInt();
			int[] sortArray = new int[arraySize];
			for (int i = 0; i < sortArray.length; i++) {
				sortArray[i] = sc.nextInt();
			}
			for (int i = 1; i < sortArray.length; i++) {
				int temp = i;
				int nowIdx = sortArray[i];

				while (temp > 0 && sortArray[temp - 1] > nowIdx) { 15378
					sortArray[temp] = sortArray[temp - 1];
					temp--;
				}
				sortArray[temp] = nowIdx;
			}
			System.out.print("#" + idx + " ");
			for (int i = 0; i < sortArray.length; i++) {
				System.out.print(sortArray[i] + " ");
			}
			System.out.println();
		}
	}
}
