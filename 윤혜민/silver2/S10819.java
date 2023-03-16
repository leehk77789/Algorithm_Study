package baekjoon;

import java.util.Scanner;

public class S10819 {
	// 차이를 최대로
	static int N;
	static int[] arr;
	static int[] result;
	static boolean[] checked;
	static int maxSum;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		arr = new int[N];
		result = new int[N + 1];
		checked = new boolean[N + 1];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		// 입력을 다 받고 최댓값을 0으로 초기화해준다
		maxSum = 0;
		// 계산하러가자!
		solve(0);
		System.out.println(maxSum);
	}

	static void solve(int K) {
		if (K == N) {
			calculate();
			return;
		}
		for (int i = 0; i < arr.length; i++) {
			// 1부터 N까지 확인하며 아직 쓰이지 않은 수 찾아내기

			if (!checked[i]) {
				// 사용되지 않은 수가 있다면
				result[K] = arr[i];
				checked[i] = true;
				solve(K + 1);
				// 다시 false로 되돌리는거구나
				checked[i] = false;
			}
		}
	}

	static void calculate() {
		int sum = 0;
		for (int i = 0; i < N - 1; i++) {
			sum += Math.abs(result[i] - result[i + 1]);
		}
		maxSum = Math.max(sum, maxSum);
	}

}
