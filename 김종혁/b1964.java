package 백준;

import java.util.Scanner;

public class b1964 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// N번째 오각형 입력
		int N = sc.nextInt();
		
		// 기본값
		long sum = 5;
		
			// 1일 경우 5 출력
			if (N == 1) {
				System.out.println(sum);
			} else {
				// 1을 초과할 시 각 변 N+1개 점 빼기 겹치는 2개
				for (int i = 2; i <= N; i++) {
					sum += ((i+1)*3-2);
				}
				// 45678를 나눈 나머지 출력
				System.out.println(sum%45678);
			}
	}
}
