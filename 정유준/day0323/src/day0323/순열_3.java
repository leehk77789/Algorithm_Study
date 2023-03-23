package day0323;

import java.util.Arrays;

public class 순열_3 {
	static int[] nums; // 배열
	static int N; // 원소수

	public static void main(String[] args) {
		nums = new int[] { 0, 1, 2 };
		N = nums.length;
	}

	// idx : 현재 판단하는 위치
	static void perm(int idx) {
		// 기저조건
		if (idx == N) {
			System.out.println(Arrays.toString(nums));
			return;
		}
		// 재귀조건
		for (int i = idx; i < N; i++) {
			swap(i, idx);
			perm(idx + 1);
			// 다시 원상복구 하는 과정이 필요함
			swap(i, idx);
		}
	}

	// swap 메서드
	// 바꿀 인덱스 2개가 인자로 넘어와야한다.
	static void swap(int a, int b) {
		int tmp = nums[a];
		nums[a] = nums[b];
		nums[b] = tmp;
	}
}
