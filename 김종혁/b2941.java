package baekjoon;

import java.util.Scanner;

public class b2941 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		String croatian = sc.next();

		String[] croatianAlphabet = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };

		// 브루트포스를 통해 크로아티아 알파벳이 나올 때 횟수 +1
		// dz=과 z=가 겹치지만, 어차피 dz=는 3의 길이에서 1을 만들어줘야 되기에 중복되어 -2가 되어도 상관없음
		for (int i = 0; i < 8; i++) {
			cnt += BruteForceFor(croatian.toCharArray(), croatianAlphabet[i].toCharArray());
			
		}
		// 문자열 총 길이에서 크로아티아 알파벳 개수만큼 빼기
		System.out.println(croatian.length() - cnt);
	}

	// BruteForceFor 메서드
	private static int BruteForceFor(char[] t, char[] p) {
		// 횟수 초기값
		int cnt = 0;
		int n = t.length;
		int m = p.length;
		// pattern이 한 칸씩 shift가 최대 n-m+1번 수행
		for (int i = 0; i < n - m + 1; i++) {
			boolean flag = true;
			// 각 shift에서 1:1 비교가 최대 m번 수행
			for (int j = 0; j < m; j++) {
				if (p[j] != t[i + j]) {
					flag = false;
					break;
				}
			}
			if (flag)
				cnt++;

		}
		// 다 돌면 횟수 return
		return cnt;
	}
}