package baekjoon;

import java.util.*;

public class B23968 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 배열의 크기와 교환 횟수를 입력받는다.
		int N = sc.nextInt();
		int K = sc.nextInt();

		// 비교 대상이 될 진행형 교환 횟수를 초기화한다.
		int cnt = 0;
		// 배열 sort를 생성하고, 주어진 수를 배열에 집어넣는다.
		int[] sort = new int[N];	
		for (int i = 0; i < N; i++) {
			sort[i] = sc.nextInt();
		}
		// 버블 정렬
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N - 1; j++) {
				int tmp = sort[j + 1];

				// 교환이 한 번 이루어질때마다 cnt를 증가시켜
				// 진행 실시간의 cnt를 파악한다.
				if (sort[j] > sort[j + 1]) {
					sort[j + 1] = sort[j];
					sort[j] = tmp;
					cnt++;

					// 만일 cnt가 K에 도달했다면, 그 시점에서 교환되는 수를 구해야 하므로 출력 후 반복문을 빠져나온다.
					if (cnt == K) {
						System.out.println(sort[j] + " " + sort[j + 1]);
						break;
					}
				}
			}
		}
		// 반복문이 완전히 종료되어도, 즉 버블 정렬이 오름차순으로 이루어진 이후에도
		// cnt값이 K값보다 작다면
		// 문제에 제시된 것 처럼 -1을 출력한다.
		if (cnt < K) {
			System.out.println(-1);
		} 
	}
}