package day0323;

import java.util.Arrays;

public class 순열_2 {
	static int[] nums; // 배열
	static int N; // 원소수
	static boolean[] visited; // 사용유무
	static int[] result; // 순열결과 저장

	public static void main(String[] args) {
		nums = new int[] { 0, 1, 2 };
		N = nums.length;
		result = new int[N];
		visited = new boolean[N];

		perm(0);
	}

	public static void perm(int idx) {
		if (idx == N) {
			System.out.println(Arrays.toString(result));
			return;
		}

		// 모든 요소를 반복문을 통해 돌면서
		// 사용하지 않은 원소가 있다며면 결과에 넣고 사용했다고 표시하고
		// 다음차례로 이동
		for (int i = 0; i < N; i++) {
			// 1. 원소를 사용했는지 체크
			if (visited[i]) {
				continue;
			}
			// 여기가 실행된다는 것은 i번째 원소는 사용하지 않은 원소다
			result[idx] = nums[i];
			visited[i] = true; // 해당 원소 사용했다고 체크
			perm(idx + 1); // 내려가서
			visited[i] = false; // 다시 원상복구
		}
	}
}
