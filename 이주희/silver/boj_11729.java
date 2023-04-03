package day0316;

import java.util.Scanner;

public class boj_11729 {

	// 세 개의 장대가 있고 첫 번째 장대에는 반경이 서로 다른 n개의 원판이 쌓여 있다.
	// 각 원판은 반경이 큰 순서대로 쌓여있다.
	// 이제 수도승들이 다음 규칙에 따라 첫번째 장대에서 세번째로 옮길거임
	// 필요한 이동 순서를 출력하는 프로그램을 작성하라
	// 이동횟수는 최소가 되어야함

	// 1 가장 위를 3으로 옮기고
	// 1 가장 위를 2로 옮기고

	// 재귀를 통해 '가장 작은 단위'가 될 때까지 재귀 호출

	// 출력에는 총 옮긴 횟수랑
	// 이동 순서
	static StringBuilder sb = new StringBuilder();
	static int cnt=0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 장판갯수
		int n = sc.nextInt();
		// 옮긴횟수는 항상 2^n-1
		
		hanoi(n, 1, 3, 2);
		
		System.out.println(cnt);
		System.out.println(sb);
	}

	// 보조기둥이 계속 바뀜
	// 출발기둥,목표기둥,보조기둥
	//
	static void hanoi(int n, int start, int end, int sub) {
		if (n == 1) {
			cnt++;
			sb.append(start + " " + end + "\n");
			return;
		}else {
			//n-1개를 보조기둥으로 옮겨줌
			hanoi(n-1,start, sub, end);
			//큰거 목표로 옮겨줌
			cnt++;
			sb.append(start + " " + end + "\n");
			//보조 기둥에 있던 n-1개를 목표지점 옮겨주기
			hanoi(n-1,sub,end,start);
		}
		// 계속 위치를 바꿔줘야함
	}
}
