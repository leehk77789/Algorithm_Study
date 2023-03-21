package day0321;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SWEA_5215_햄버거다이어트_정유준_조합 {
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

	static void combination(int numList[], int arrIdx, int scoreIdx) {
		if (calSum > cal) {
			return;
		}

		if (arrIdx == numList.length) {
			if (sum < matSum) {
				sum = matSum;
			}
			return;
		}

		if (scoreIdx == score.length) {
			return;
		}

		matSum += score[scoreIdx][0];
		calSum += score[scoreIdx][1];
		combination(numList, arrIdx + 1, scoreIdx + 1);
		matSum -= score[scoreIdx][0];
		calSum -= score[scoreIdx][1];
		combination(numList, arrIdx, scoreIdx + 1);
	}

	static void solve() throws NumberFormatException, IOException {
		int testCase = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= testCase; tc++) {
			input();
			for (int i = 1; i <= numAmount; i++) {
				combination(new int[i], 0, 0);
			}
			System.out.println("#" + tc + " " + sum);
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		solve();
	}
}
