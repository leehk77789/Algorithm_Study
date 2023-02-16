package Silver;

import java.util.Scanner;

class S1244 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 스위치개수
		int switchNum = sc.nextInt();

		// 스위치 상태 생성, 값 입력
		int[] switchState = new int[switchNum];
		for (int i = 0; i < switchState.length; i++) {
			switchState[i] = sc.nextInt();
		}

		// 학생 수 입력
		int studentNum = sc.nextInt();

		for (int i = 0; i < studentNum; i++) {
			// 성별 입력
			int gender = sc.nextInt();

			// 스위치 값 받기
			int studentSwitchNum = sc.nextInt();

			if (gender == 1) {
				// 남자
				// 남자 배수용 카운트
				int manCount = 1;
				while (studentSwitchNum * manCount <= switchState.length) {
					// 변하는 인덱스 번호가 최대 길이보다 낮을 때까지
					// 1이면 0으로 변환하고 배율 높임
					if (switchState[(studentSwitchNum * manCount) - 1] == 1) {
						switchState[(studentSwitchNum * manCount) - 1] = 0;
						manCount++;
					} else {
						// 0이면 1로 변환하고 배율 높임
						switchState[(studentSwitchNum * manCount) - 1] = 1;
						manCount++;
					}
				}
			} else {
				// 입력받은 자리 인덱스값 먼저 변환
				if (switchState[studentSwitchNum - 1] == 1) {
					switchState[studentSwitchNum - 1] = 0;
				} else {
					switchState[studentSwitchNum - 1] = 1;
				}
				// 여자
				// 여자 자리수 카운트
				int girlCount = 1;
				// 만약 해당 자리수 -count, +count의 값이 같다면
				while (((studentSwitchNum - girlCount - 1) >= 0
						&& (studentSwitchNum + girlCount - 1) <= switchState.length - 1 && switchState[studentSwitchNum
								- girlCount - 1] == switchState[studentSwitchNum + girlCount - 1])) {
					// 해당 자리 index값이 1일 때
					if (switchState[studentSwitchNum - girlCount - 1] == 1) {
						switchState[studentSwitchNum - girlCount - 1] = 0;
						switchState[studentSwitchNum + girlCount - 1] = 0;
						girlCount++;
					} else {
						// 1이 아니면
						switchState[studentSwitchNum - girlCount - 1] = 1;
						switchState[studentSwitchNum + girlCount - 1] = 1;
						girlCount++;
					}
				}
			}
		}
		for (int i = 0; i < switchState.length; i++) {
			System.out.print(switchState[i] + " ");
			if (i != 0 && (i + 1) % 20 == 0) {
				System.out.println();
			}
		}

		sc.close();
	}
}
