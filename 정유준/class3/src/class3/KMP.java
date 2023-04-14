package class3;

public class KMP {

	public static void main(String[] args) {
		String text = "ABCBAABCCABAABABACACA";
		String pattern = "ABABACA";
	}

	// 실패테이플 getPi(
	public static int[] getPi(String pt) {
		// 접두사와 접미사가 일치하는 최대길이를 담을 배열
		// 0~i까지의 부분문자열에서 접미사 / 접두사 일치
		int[] pi = new int[pt.length()];

		int j = 0; // 여기까지는 같다
		// i, j가 가리키는 값이 같다면, 포인트 증가
		// i는 무조건 증가
		for (int i = 1; i < pt.length(); i++) {
			// 지금 두 포인트가 가리키는 값이 다르다면
			// 지금 두 포인트가 가리키는 값이 같다면
			if (pt.charAt(i) == pt.charAt(j)) {
				// i번째의 최대길이는 ++j한 값
				pi[i] = ++j;
			}
		}
		return pi;
	}

	public static void kmp(String text, String pt) {
		int[] pi = getPi(pt);

		int j = 0;
		for (int i = 0; i < text.length(); i++) {
			// 실패했을 때 j점프
			while (j > 0 && text.charAt(i) != pt.charAt(j)) {
				j = pi[j - 1];
			}

			if (text.charAt(i) == pt.charAt(j)) {
				if (j == pt.length() - 1) {
					System.out.println("패턴을 찾았습니다.");
					j = pi[j];
				} else {
					// 다 찾은게 아니라면 계속 진행해야하니깐 j증가
					j++;
				}
			}
		}
	}
}
