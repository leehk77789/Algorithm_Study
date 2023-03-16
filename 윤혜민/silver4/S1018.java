package baekjoon;

import java.util.Scanner;

public class S1018 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		char[][] chess = new char[N][M];
		for (int i = 0; i < N; i++) {
			String line = sc.next();
			for (int j = 0; j < M; j++) {
				chess[i][j] = line.charAt(j);
			}
		}

		int minCnt = 65;
		for (int i = 0; i < N - 8 + 1; i++) {
			for (int j = 0; j < M - 8 + 1; j++) {
				int cnt = 0;
				for (int idxR = 0; idxR < 8; idxR++) {
					for (int idxC = 0; idxC < 8; idxC++) {
						if (idxR % 2 == 0 && idxC % 2 == 0) {
							if (chess[i + idxR][j + idxC] != 'W') {
								cnt++;
							}
						} else if (idxR % 2 == 1 && idxC % 2 == 1) {
							if (chess[i + idxR][j + idxC] != 'W') {
								cnt++;
							}
						}
						if (idxR % 2 == 0 && idxC % 2 == 1) {
							if (chess[i + idxR][j + idxC] != 'B') {
								cnt++;
							}
						} else if (idxR % 2 == 1 && idxC % 2 == 0) {
							if (chess[i + idxR][j + idxC] != 'B') {
								cnt++;
							}
						}
					}
				}
				cnt = Math.min(cnt, 64 - cnt);
				minCnt = Math.min(cnt, minCnt);
			}
		}
		System.out.println(minCnt);
	}
}
