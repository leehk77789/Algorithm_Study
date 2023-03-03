package baekjoon;

import java.util.Scanner;

public class b8958 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int testCase = sc.nextInt();

		for (int i = 0; i < testCase; i++) {
			String ox = sc.next();
			
			int[] scores = new int[ox.length()];
			int score = 0;
			// X가 나올 때까지 증가하면서 추가하면서 배열에 값 넣어주기
			for (int j = 0; j < ox.length(); j++) {
				if (ox.charAt(j) != 'X') {
					score++;
					scores[j] = score;
				} else {
					// X가 나오면 초기화
					scores[j] = 0;
					score = 0;
				}
			}
			// 총합
			int ans = 0;
			for (int s : scores) {
				ans += s;
			}

			System.out.println(ans);
		}
	}
}