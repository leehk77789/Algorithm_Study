package day0321;

import java.util.Arrays;

public class 조합_1 {
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
		if (idx == N) {
			return;
		}
		// recursive case
		sel[sidx] = 토핑[idx]; // sidx자리에 현재 보고있는 idx 토핑을 저장
		combination(idx + 1, sidx + 1); // 이번 재료는 사용했고 다음재료로 가자
		combination(idx + 1, sidx); // 이번 재료 안사용했고 다음재료로 가자
	}
}
