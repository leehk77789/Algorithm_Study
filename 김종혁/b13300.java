package baekjoon;

import java.util.Scanner;

public class b13300 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int K = sc.nextInt();

		// [남녀][반] 2차원 배열 생성
		int[][] school = new int[2][6];

		for (int i = 0; i < N; i++) {
			int gender = sc.nextInt();
			int grade = sc.nextInt();

			school[gender][grade-1]++;
		}

		int cnt = 0;
		int num = 0;
		
		// 각 성별의 각 반 인원이 짝수일 시 / K, 아닐시 + 1
		for (int k = 0; k < 2; k++) {
			for (int j = 0; j < 6; j++) {
				if (school[k][j] % K == 0) {
					num = school[k][j] / K;
				} else {
					num = ((school[k][j]) / K) + 1;
				}
				cnt += num;

			}
		}

		System.out.println(cnt);
	}
}
