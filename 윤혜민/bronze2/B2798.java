package baekjoon;

import java.util.*;

public class B2798 {
	public static void main(String[] args) {
		// 블랙잭
		Scanner sc = new Scanner(System.in);
		// 네네 숫자 다 입력받아용
		int N = sc.nextInt();
		int M = sc.nextInt();
		// 카드 배열도 만들어주고 입력도 받고 네네
		int[] black = new int[N];

		for (int i = 0; i < N; i++) {
			black[i] = sc.nextInt();
		}

		// 우리는 카드 세장의 합을 구해야 해요
		// 그렇다면 이건 전체 N장으 카드 중 3장을 고르는 조합이 될거랍니다
		// 그 조합 c는 다음의 수식이 돼여
		int c = N * (N - 1) * (N - 2) / 6;
		// c만큼 배열을 만들어줍니다!
		// 이제 카드 배열에서 카드를 3개씩 꺼내서 더한 합을 이 jack 배열에 넣을거에여
		int[] jack = new int[c];

		int idx = 0; // 얜 머지?

		// 네네 더합시다요
		for (int i = 0; i < N; i++) {
			for (int j = i + 1; j < N; j++) {
				for (int k = j + 1; k < N; k++) {

					jack[idx] = black[i] + black[j] + black[k];
					idx++; // 얘 진짜 뭐지?
				}
			}
		}
		// 교수님이 안좋아할듯 근데 어레이소트썼었네요 ㅋ
		// 합을 싹다 구했으면 오름차순으로 정렬합니다
		// 위에서 받은 M값을 넘지 않으면서 가장 가까운 값을 찾아야해요
		Arrays.sort(jack);
		int i = 0;
		int result = 0;
		for (i = 0; i < jack.length; i++) {
			// result에 하나하나 집어넣다가
			result = jack[i];
			// 얘가 M보다 클때?
			// 그 이전값을 저장하고 if문을 쫑냅니다
			if (jack[i] > M) {
				result = jack[i - 1];
				break;
			}
		}
		// 넹 끗
		System.out.println(result);
	}
}
