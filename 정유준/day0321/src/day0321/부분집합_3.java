package day0321;

public class 부분집합_3 {
	static String[] 재료 = { "참치", "우엉", "삼겹살" };

	public static void main(String[] args) {
		// 비트마스킹을 사용해서 부분집합 구하기
		int N = 3;

		// i는 모든 부분집합을 의미한다.
		for (int i = 0; i < (1 << N); i++) {
			// i가 부분집합 중 1개라는것은 알 수 있다.
			// 하지만 i가 무슨 원소를 가진 부분집합인지는 모른다.
			// i가 무슨 원소를 가진 부분집합인지 검사해야한다.
			// N개의 원소를 검사한다.
			String tmp = "";
			for (int j = 0; j < N; j++) {
				// i의 j번째 비트에 해당 값이 있는지 체크한다.
				if ((i & (1 << j)) > 0) {
					// 해당 j번째의 요소가 이번 부분집합에는 포함되어있습니다.
					tmp += 재료[j];
				}
			}
			System.out.println(tmp);
		}
	}
}
