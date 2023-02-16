package day0214;

import java.util.Scanner;

public class Bj_1592 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 사람 수 (3보다 크거나 같고, 50보다 작거나 같은 자연수)
		int peopleNum = sc.nextInt();
		
		
		// 게임 끝나는 공의 횟수 (50보다 작거나 같은 자연수)
		int endBoll = sc.nextInt();
		// 홀수면 시계방향, 짝수면 반시계방향 돌리는 +,- 카운트(사람수-1보다 작거나 같은 수)
		int locationCnt = sc.nextInt();

		// 현재위치
		int currentNum = 1;

		// 공 던지는 횟수
		int cnt = 0;

		int[] arr = new int[peopleNum + 1];
		
		// 1위치에서 시작하니까 일단 카운트
		arr[1] = 1;

		while (true) {


			// 한 사람이 endBoll 만큼 받으면 게임 끝남
			if (arr[currentNum] == endBoll) {	
				break;
			}

			// 만약 현재 받은 수가 홀수면 시계방향으로
			if (arr[currentNum] % 2 == 1) {

				cnt++;

				currentNum += locationCnt;

				// 내위치%사람수 == 내 자리임
				if (currentNum % peopleNum == 0) {
					currentNum = peopleNum;
				} else {
					currentNum %= peopleNum;

				}

				arr[currentNum] = arr[currentNum] + 1;
			

				// 만약 현재받은 수가 짝수면 반시계방향
			} else {
				
				cnt++;
				currentNum -= locationCnt;

				
				// 위치가 음수가 되면 거꾸로 가니까 위치 선정 다시해줌
				if (currentNum < 0) {
					currentNum +=peopleNum;
				}
				
				
				// 내위치%사람수 == 내 자리임
				if (currentNum % peopleNum == 0) {
					currentNum = peopleNum;
				} else {
					currentNum %= peopleNum;
				}
			
				arr[currentNum] = arr[currentNum] + 1;
			}

		}
		System.out.println(cnt);
	}
}