package baekjoon;

import java.util.Scanner;

public class S2567 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 흰색 도화지 배열 만들기 !
		int[][] square = new int[100][100];

		// 색종이 숫자 입력받기
		int paperNum = sc.nextInt();
		for (int i = 0; i < paperNum; i++) {
			// 색종이의 정보를 배열에 입력하기
			int[] colorPaper = new int[2];
			for (int idx = 0; idx < 2; idx++) {
				colorPaper[idx] = sc.nextInt();
			}
			// 색종이의 크기는 10*10이므로
			// 색종이가 덮일 공간만큼 흰 도화지의 값을 1로 바꿔주기
			for (int n = colorPaper[0]; n < colorPaper[0] + 10; n++) {
				for (int m = colorPaper[1]; m < colorPaper[1] + 10; m++) {
					if (square[n][m] == 0) {
						square[n][m] = 1;
					}
				}
			}
		}
		// 자 이제 흰색 도화지는 1 과 0으로 이루어진 완전 디지털 세상
		// 1과 0이 맞닿아 있다면 그것은 색종이의 둘레가 될 것이므로
		// 조사를 해보자 !

		// 먼저 카운트 값을 초기화한다.
		int cnt = 0;
		// 원소를 이동시켜줄 델타배열을 만들자
		int[] dr = { 1, 0, -1, 0 };
		int[] dc = { 0, 1, 0, -1 };

		for (int r = 0; r < 100; r++) {
			for (int c = 0; c < 100; c++) {
				// 흰 도화지의 값이 0일때는 볼 필요가 없고 1일때만 확인한다.
				if (square[r][c] == 1) {
					// 델타배열로 원소의 사방을 확인한다
					int newRow = 0;
					int newCol = 0;

					for (int idx = 0; idx < 4; idx++) {
						// 델타를 이용해 4방의 인덱스를 만든다.
						newRow = r + dr[idx];
						newCol = c + dc[idx];
						// 사방 중 0이 존재한다면 그 지점이 둘레값에 해당할 것이다
						// 또한 흰 도화지의 경계라면 그것 또한 둘레값에 포함될 것이다
						if (newRow >= 100 || newRow < 0 || newCol >= 100 || newCol < 0 || square[newRow][newCol] == 0) {
							cnt++;
						}
					}
				}
			}
		}
		System.out.println(cnt);
	}
}
