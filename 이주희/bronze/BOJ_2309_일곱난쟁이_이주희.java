package day0214;

import java.util.Arrays;
import java.util.Scanner;

public class bj_2309 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] arr = new int[9];
		
	
		int sum = 0;

		// 제외할 난쟁이 두명 인덱스
		int people1;
		int people2 = 1;

		for (int i = 0; i < 9; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		
		Arrays.sort(arr);

		for (people2 = 0; people2 < 9; people2++) {
			for (people1 = people2 + 1; people1 < 9; people1++) {

				if (sum - (arr[people1] + arr[people2]) == 100) {
					
					for(int i=0; i<9; i++) {
						if(i!=people1&&i!=people2) {
							System.out.println(arr[i]);
						}
					}
					System.exit(0);		
				}
			}
		}
	}
}
