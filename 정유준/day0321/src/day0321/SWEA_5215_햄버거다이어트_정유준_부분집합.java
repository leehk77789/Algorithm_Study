package day0321;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SWEA_5215_햄버거다이어트_정유준_부분집합 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int count;
	static int cal;
	static int[][] score;
	static int numAmount;
	static int calSum;
	static int matSum;
	static int sum;

	static void input() throws IOException {
		calSum = 0;
		matSum = 0;
		sum = 0;
		String[] input = br.readLine().split(" ");

		numAmount = Integer.parseInt(input[0]);

		cal = Integer.parseInt(input[1]);

		score = new int[numAmount][2];

		for (int i = 0; i < numAmount; i++) {
			input = br.readLine().split(" ");
			// score[i][0] == 맛, score[i][1] == 칼로리
			score[i][0] = Integer.parseInt(input[0]);
			score[i][1] = Integer.parseInt(input[1]);
		}
	}

	static void subset(int idx) {
		if (calSum > cal) {
			return;
		}

		if (idx == numAmount) {
			if (sum < matSum) {
				sum = matSum;
			}
			return;
		}

		matSum += score[idx][0];
		calSum += score[idx][1];
		subset(idx + 1);

		matSum -= score[idx][0];
		calSum -= score[idx][1];
		subset(idx + 1);
	}

	static void solve() throws NumberFormatException, IOException {
		int testCase = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= testCase; tc++) {
			input();
			subset(0);
			System.out.println("#" + tc + " " + sum);
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		solve();
	}
}
