package baekjoon;

import java.util.Scanner;

public class S1244 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 스위치 켜고 끄기
		// 스위치 수와 스위치 초기값 입력받기
		int switchNum = sc.nextInt();
		int[] switchs = new int[switchNum];
		for (int idx = 0; idx < switchs.length; idx++) {
			switchs[idx] = sc.nextInt();
		}
		// 학생 정보 입력받기
		int students = sc.nextInt();
		int[][] studentsList = new int[students][2];
		for (int idx1 = 0; idx1 < students; idx1++) {
			for (int idx2 = 0; idx2 < 2; idx2++) {
				studentsList[idx1][idx2] = sc.nextInt();
			}
		}

		// 이제 학생이 남학생인지 여학생인지 구분합니당
		for (int idx1 = 0; idx1 < students; idx1++) {

			if (studentsList[idx1][0] == 1) {
				// 남자일 때
				// 해당 번호의 배수만큼 스위치 전환
				for (int idx = 0; idx < switchs.length; idx++) {
					if ((idx + 1) % studentsList[idx1][1] == 0) {
						if (switchs[idx] == 0) {
							switchs[idx] = 1;
						} else if (switchs[idx] == 1) {
							switchs[idx] = 0;
						}
					}
				}
			} else if (studentsList[idx1][0] == 2) {
				// 여자일 때
				// 해당 번호의 좌우가 대칭인지 확인
				int idx = 0;
				// 일단 스위치 범위를 벗어나지 않는 한에서
				while (studentsList[idx1][1] - 1 + idx < switchs.length && studentsList[idx1][1] - 1 - idx >= 0) {
					// 대칭이라면?? idx를 더해줘요
					if (switchs[studentsList[idx1][1] - 1 + idx] == switchs[studentsList[idx1][1] - 1 - idx]) {
						idx++;
					} else {
						break;
					}
				}
				// 그럼 대칭 수 만큼 idx 값이 저장되어 있겠죵
				for (int swIdx = 0; swIdx < idx; swIdx++) {
					if (switchs[studentsList[idx1][1] - 1 + swIdx] == 0
							&& switchs[studentsList[idx1][1] - 1 - swIdx] == 0) {
						// 양쪽 대칭 값이 0이라면 1로 바꾸고
						switchs[studentsList[idx1][1] - 1 + swIdx] = 1;
						switchs[studentsList[idx1][1] - 1 - swIdx] = 1;
					} else if (switchs[studentsList[idx1][1] - 1 + swIdx] == 1
							&& switchs[studentsList[idx1][1] - 1 - swIdx] == 1) {
						// 1이라면 0으로 바꾸는 뭐 그런... if문
						switchs[studentsList[idx1][1] - 1 + swIdx] = 0;
						switchs[studentsList[idx1][1] - 1 - swIdx] = 0;
					}
				}
			}
		}

		// 이 문제의 사실상 복병은 20개씩 끊어 출력하는게 아니었을까...
		// 이거 어케 쉽게 하나요 저 이따구로 풀었어요
		for (int i = 0; i < switchs.length / 20; i++) {
			for (int j = 20 * i; j < (i + 1) * 20; j++) {
				System.out.print(switchs[j] + " ");
			}
			System.out.println();
		}
		for (int i = (switchs.length / 20) * 20; i < switchs.length; i++) {
			System.out.print(switchs[i] + " ");
		}
	}
}
