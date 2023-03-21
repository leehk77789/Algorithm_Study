package day0321;

public class 부분집합_2 {
	static String[] 재료 = { "참치", "우엉", "삼겹살" };
	static int N;
	static boolean[] sel; // 해당 요소 선택 했다!

	public static void main(String[] args) {
		N = 3;
		sel = new boolean[N];

		poswerset(0);
	}

	// 메소드를 작성할 때 최대한 파라미터를 심플하게
	// idx : 해당 원소를 포함할지 안할지를 결정해야함.

	static void poswerset(int idx) {
		// base case : 재귀를 빠져나갈 수 있는 조건
		// 모든 재료를 넣을지 말지에 대한 판단 완료 idx가 끝까지 갔기때문에
		if (idx == N) {
			String tmp = "";
			for (int i = 0; i < N; i++) {
				if (sel[i]) {
					tmp += 재료[i];
				}
			}
			System.out.println(tmp);
			return;
		}

		// recursive : 나 자신을 다시 호출하는 조건
		sel[idx] = true; // idx번째의 재료를 사용했다는 의미
		poswerset(idx + 1); // 다음 재료를 생각
		sel[idx] = false; // idx번째의 재료를 사용하지 않았음
		poswerset(idx + 1); // 다음 재료를 생각
	}
}
