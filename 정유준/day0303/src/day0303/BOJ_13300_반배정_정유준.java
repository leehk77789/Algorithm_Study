package day0303;

import java.util.Scanner;

public class BOJ_13300_반배정_정유준 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int studentNum = sc.nextInt();
		int maxNum = sc.nextInt();

		// 숫자 받을 배열 생성
		int[][] makeRoom = new int[2][7];

		// 학생 수 넣어주기
		for (int i = 0; i < studentNum; i++) {
			// a = 성별
			int a = sc.nextInt();

			// b = 학년
			int b = sc.nextInt();
			makeRoom[a][b]++;
		}

		int result = 0;

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 7; j++) {
				result += makeRoom[i][j] / maxNum;
				if (makeRoom[i][j] % maxNum != 0) {
					result++;
				}
			}
		}
		System.out.println(result);
	}
}
