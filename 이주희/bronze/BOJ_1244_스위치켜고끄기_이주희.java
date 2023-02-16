package day0213;

import java.util.Scanner;

public class bj1244 {

	public static void main(String[] args) {

		// 남자면 자기가 받은 수의 배수 상태 바꾸기

		// 여자면 자기가 받은 수 번호를 중심으로 좌우 대칭이면 그 구간 다 스위치

		Scanner sc = new Scanner(System.in);

		// 스위치 개수 입력받기
		int T = sc.nextInt();

		// 스위치 상태 담는 배열
		int[] arr = new int[T + 1];

		// 스위치 상태 입력 받기
		for (int i = 1; i < T + 1; i++) {

			arr[i] = sc.nextInt();

		}

		/////////////////////////////////

		// 학생 수 입력 받기
		int num = sc.nextInt();

		// 학생 성별, 받은 수 담는 배열
		int[] student = new int[2];

		for (int j = 0; j < num; j++) {
			// 1.남자면 1, 여자면 2 2.학생이 받은 수
			for (int i = 0; i < 2; i++) {
				student[i] = sc.nextInt();

			}
			// 만약 남자라면

			if (student[0] == 1) {

				// student[1]의 배수
				for (int k = student[1]; k < T + 1; k += student[1]) {
					arr[k] = 1 - arr[k];
				}
			}

			// 만약 여자라면
			if (student[0] == 2) {

				// student[1] 사이드 값이 일치하는 지 확인
				arr[student[1]] = 1 - arr[student[1]];
				for (int k = 1; k <= Math.min(student[1] - 1, T - student[1]); k++) {
					if (arr[student[1] - k] == arr[student[1] + k]) {

						arr[student[1] - k] = 1 - arr[student[1] - k];
						arr[student[1] + k] = 1 - arr[student[1] + k];
					} else {
						break;
					}

				}

			}

		}
		for (int i = 1; i <= T; i++) {
			System.out.print(arr[i] + " ");
			if (i % 20 == 0) {
				System.out.println();
			}
		}

	}
}
