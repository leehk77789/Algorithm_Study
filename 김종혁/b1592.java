package baekjoon;

import java.util.Scanner;

public class b1592 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int L = sc.nextInt();
		// 공 현재 위치
		int ball = 0;
		// 공이 움직인 횟수
		int cnt = 0;
		// 각 사람의 위치가 들어있는 배열 생성
		int[] people = new int[N];
		// 공의 시작 위치
		people[ball] = 1;

		// 반복문
		while(true) {
			// 공을 받은 횟수가 M과 같을 시 반복문 종료
			if(people[ball] == M) {
				break;
			}
			// 짝수일 시
			if (people[ball] % 2 == 0) {
				// 공의 위치 + L
				ball += L;
				// 공의 위치가 배열의 크기를 초과할 시 몫으로 계산
				if(ball >= N){
					ball %= N;
				}
				// 공을 받은 횟수 1 추가
				people[ball]++;
				// 공이 움직인 횟수 1 추가
				cnt++;
				// 홀수일 시
			} else {
				// 공의 위치 - L
				ball -= L;
				// 공의 위치가 배열보다 작을 시 +N으로 계산
				if(ball < 0) {
					ball += N;
				}
				people[ball]++;
				cnt++;
			}
		}
		// 출력
		System.out.println(cnt);
	}
}
