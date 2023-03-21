package day0321;

import java.util.Arrays;

public class 조합_2 {
	// 재귀를 이용해서 조합을 만든다.
	static String[] 토핑 = { "상추", "패티", "토마토", "치즈" };
	static int N;
	static int R;
	static String[] sel;

	public static void main(String[] args) {
		N = 4; // 전체 개수 4개
		R = 2; // 4개중에 2개를 뽑겠습니다.
		sel = new String[R]; // 내가 선택한 토핑
		combination(0, 0);
	}

	// idx : 내가 이번 깊이에서 고려할 재료
	// sidx : 현재 뽑을 자리
	static void combination(int idx, int sidx) {
		// base case
		if (sidx == R) {
			System.out.println(Arrays.toString(sel));
			return;
		}
		// recursive case
		// 경계값 결정을 해야함
		for (int i = idx; i <= N - R + sidx; i++) {
			sel[sidx] = 토핑[i];
			combination(i + 1, sidx + 1);
		}
	}
}
