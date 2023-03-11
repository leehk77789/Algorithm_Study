package day0305;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class BOJ_1931_회의실배정_정유준 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int amount = sc.nextInt();
		int[][] time = new int[amount][2];
		int maxNum = 0;
		for (int i = 0; i < amount; i++) {
			time[i][0] = sc.nextInt();
			time[i][1] = sc.nextInt();
		}

		// Comparator 를 override하여 2차원 배열을 정렬할 수 있음
		Arrays.sort(time, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if (o1[1] == o2[1]) {
					return o1[0] - o2[0];
				} else {
					return o1[1] - o2[1];
				}
			}
		});

		int count = 0;
		int beforeEnd = 0;

		// 이전 회의의 종료시간이 다음 회의 시작보다 작거나 같으면 count증가함
		for (int i = 0; i < amount; i++) {
			if (beforeEnd <= time[i][0]) {
				beforeEnd = time[i][1];
				count++;
			}
		}

		System.out.println(count);
	}
}
