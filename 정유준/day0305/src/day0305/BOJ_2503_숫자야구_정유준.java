package day0305;

import java.util.Scanner;

public class BOJ_2503_숫자야구_정유준 {
	static int N;
	static int[] condition;
	static int[] strike;
	static int[] ball;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt(); // 질문 수

		condition = new int[N];
		strike = new int[N];
		ball = new int[N];

		// 질문 수만큼 조건, 스트라이크, 볼 개수 입력 받기
		for (int i = 0; i < N; i++) {
			condition[i] = sc.nextInt();
			strike[i] = sc.nextInt();
			ball[i] = sc.nextInt();
		}
		int ans = 0; // 답 개수
		// 반복문 돌리면서 123~987까지 가능한 수가 몇개나 있는지 카운트
		for (int i = 123; i < 988; i++) {
			if (check(i))
				ans++;
		}
		System.out.println(ans);
		sc.close();
	}

	static boolean check(int x) {
		int h = x / 100; // 백의 자리
		int t = x / 10 % 10; // 십의 자리
		int o = x % 10; // 일의 자리

		// 숫자는 서로 다르고, 1~9인 수라고 했으므로 0이거나 서로 같으면 안됨
		if (h == t || h == o || t == o || h == 0 || t == 0 || o == 0)
			return false;
		for (int i = 0; i < N; i++) {
			int sCnt = 0; // 스트라이크 개수
			int bCnt = 0; // 볼 개수
			int ch = condition[i] / 100; // 조건의 백의 자리
			int ct = condition[i] / 10 % 10; // 조건의 십의 자리
			int co = condition[i] % 10; // 조건의 일의 자리

			// 같은 자리이면서 숫자도 같은 경우면 스트라이크
			if (h == ch)
				sCnt++;
			if (t == ct)
				sCnt++;
			if (o == co)
				sCnt++;
			// 다른 자리인데 값이 같은 경우면 볼
			if (h == ct || h == co)
				bCnt++;
			if (t == ch || t == co)
				bCnt++;
			if (o == ch || o == ct)
				bCnt++;

			if (sCnt != strike[i] || bCnt != ball[i])
				return false;
		}
//		System.out.println(x);
		return true;
	}
}
