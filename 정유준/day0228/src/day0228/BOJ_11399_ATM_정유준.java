package day0228;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ_11399_ATM_정유준 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 사람 수
		int humanAmount = sc.nextInt();

		// 시간 배열
		int[] time = new int[humanAmount];
		for (int i = 0; i < time.length; i++) {
			time[i] = sc.nextInt();
		}

		// 시간 순서대로 정렬하고
		Arrays.sort(time);
		int sum = 0;

		// 첫번째 사람, 첫번째 두번째 사람, 첫번째 두번째 세번째 사람 식으로 시간을 더해준다
		// 한번 범위가 돌았으면 전체 총합에 더해준다
		for (int i = 0; i < time.length; i++) {
			int tempsum = 0;
			for (int j = 0; j <= i; j++) {
				tempsum += time[j];
			}
			sum += tempsum;
		}
		System.out.println(sum);
	}
}
