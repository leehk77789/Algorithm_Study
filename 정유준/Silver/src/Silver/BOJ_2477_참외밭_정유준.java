package Silver;

import java.util.Scanner;

public class BOJ_2477_참외밭_정유준 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int chamwaeAmout = sc.nextInt();
		int[][] arr = new int[2][6];
		// 0번 인덱스에는 번호 1번 인덱스에는 길이
		for (int i = 0; i < 6; i++) {
			arr[0][i] = sc.nextInt();
			arr[1][i] = sc.nextInt();
		}

		// 빠진 부분을 제외한 전체 최대 사각형
		int max = 0;
		int idx = 0;

		// 사각형 최대값 구하기
		for (int i = 0; i < 6; i++) {
			if (max < arr[1][i] * arr[1][(i + 1) % 6]) {
				max = arr[1][i] * arr[1][(i + 1) % 6];
				idx = i;
			}
		}

		// 사각형이 최대값일 때 해당 변에서 +3 +4 해준 것이 빼야되는 넓이
		max = max - arr[1][(idx + 3) % 6] * arr[1][(idx + 4) % 6];
		System.out.println(max * chamwaeAmout);
		sc.close();
	}
}
