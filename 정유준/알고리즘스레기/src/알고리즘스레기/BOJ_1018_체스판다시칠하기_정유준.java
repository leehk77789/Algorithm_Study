package 알고리즘스레기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1018_체스판다시칠하기_정유준 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String NM_str = br.readLine();
		int N = Integer.parseInt(NM_str.split(" ")[0]);
		int M = Integer.parseInt(NM_str.split(" ")[1]);

		String[][] arr = new String[N][M];

		// 배열로 보드를 저장
		for (int i = 0; i < N; i++) {
			String str = br.readLine();

			for (int j = 0; j < M; j++) {
				if (str.charAt(j) == 'W') {
					arr[i][j] = "W";
				} else {
					arr[i][j] = "B";
				}
			}
		}

		int min = 64;

		for (int i = 0; i < N - 7; i++) {
			for (int j = 0; j < M - 7; j++) {
				min = Math.min(min, cal(i, j, arr));
			}
		}

		System.out.println(String.valueOf(min));
	}

	public static int cal(int x, int y, String[][] WB) {

		int count = 0;

		String color = "W";

		for (int i = x; i < x + 8; i++) {
			for (int j = y; j < y + 8; j++) {

				if (!WB[i][j].equals(color)) {
					count++;
				}

				if (color.equals("W")) {
					color = "B";
				} else {
					color = "W";
				}
			}

			if (color.equals("W")) {
				color = "B";
			} else {
				color = "W";
			}
		}

		count = Math.min(count, 64 - count);

		return count;

	}
}