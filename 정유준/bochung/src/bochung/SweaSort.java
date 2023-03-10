package bochung;

import java.util.Arrays;
import java.util.Scanner;

public class SweaSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int testCase = sc.nextInt();
		
		for(int i = 0; i < testCase; i++) {
			int N = sc.nextInt();
			int[] arr = new int[N];
			
			for(int j = 0; j < N; j++) {
				arr[j] = sc.nextInt();
			}
			
			Arrays.sort(arr);
			System.out.print("#" + (i+1) + " ");
			for(int j = 0; j < N; j++) {
				System.out.print(arr[j] + " ");
			}
			System.out.println();
			
		}
		sc.close();
	}
}

