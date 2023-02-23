package baekjoon;

import java.util.*;

public class B3985 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int L = sc.nextInt();
		int[] rollCake = new int[L];
		int N = sc.nextInt();
		int[][] wishCake = new int[N][2];
		for (int x = 0; x < N; x++) {
			for (int y = 0; y < 2; y++) {
				wishCake[x][y] = sc.nextInt();
			}
		}
		// 롤케이크 사람 정보 다 받았고
		// 이제 방청객 거꾸로부터 롤케이크 찜꽁 시키면 돼
		for (int idx = N - 1; idx >= 0; idx--) {
			int startCake = wishCake[idx][0] - 1;
			int lastCake = wishCake[idx][1];

			for (int K = startCake; K < lastCake; K++) {
				rollCake[K] = idx + 1;
			}
		}

//		System.out.println(Arrays.toString(rollCake));
		int expect = 0; // 이건 사람 수를 저장하는거고
		int expectNum = 0; // 이건 인덱스를 저장하는거고
		for (int idx = 0; idx < N; idx++) {
			if (wishCake[idx][1] - wishCake[idx][0] > expect) { 
				// 저 1에서 0 뺸게 원래 기대하던 케이크 수가 될거니까 
				// 아니 정확히는 1을 더해야 하긴 하지만 어차피 비교 용도라 ㄱㅊ
				expect = wishCake[idx][1] - wishCake[idx][0];
				// 기댓값이 클 때를 저장하는거고
				expectNum = idx + 1;
				// 그때의 인덱스에 1을 더해서 방청객 수를 저장하자
			}
		}

		// 이제 실제 케이크
		// 방청객 수 만큼 배열을 만들어서
		// 각 방청객이 얼마나 케이크를 차지했는지 인덱스에 따라 집어넣자
		int[] realCake = new int[N];
		int maxCake = 0;
		int maxCakeNum = 0;
		for (int idx = 0; idx < L; idx++) {
			if (rollCake[idx] > 0) {
				realCake[rollCake[idx] - 1]++;
			}
		}
		// 그런다음에 그 배열에서 최댓값을 차지하고 있는 인덱스를 구해서
		// 사람 찾으면 끝
		for (int idx = 0; idx < N; idx++) {
			if (realCake[idx] > maxCake) {
				maxCake = realCake[idx];
				maxCakeNum = idx + 1;
			}
		}

		System.out.println(expectNum);
		System.out.println(maxCakeNum);
	}
}
