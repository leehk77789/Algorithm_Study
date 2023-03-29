package day0323;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SWEA_6808_규영이와인영이의카드게임_정유준 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int[] gyu;
	static int[] in;
	static boolean[] inUse;
	static int gyuWinCount;
	static int inWinCount;

	static void input() throws IOException {
		gyu = new int[9];
		in = new int[9];
		inUse = new boolean[9];
		gyuWinCount = 0;
		inWinCount = 0;
		boolean[] checkNum = new boolean[18];
		String[] input = br.readLine().split(" ");

		// 18중에 어떤 숫자를 사용했는지 만들기
		for (int i = 0; i < input.length; i++) {
			checkNum[Integer.parseInt(input[i]) - 1] = true;
		}

		// String을 int로 변경하기
		for (int i = 0; i < input.length; i++) {
			gyu[i] = Integer.parseInt(input[i]);
		}

		// in의 인덱스를 idx로 잡고 checkNum의 false(gyu에서 사용안된숫자) 넣어주기
		int idx = 0;
		for (int i = 1; i <= 18; i++) {
			if (checkNum[i - 1] == false) {
				in[idx++] = i;
			}
		}
		// 값 넣기 완료
	}

	static void permutation(int idx, int score) {
		if (idx == 9) {
			if (score <= 85) {
				gyuWinCount++;
			} else {
				inWinCount++;
			}
			return;
		}

		for (int i = 0; i < 9; i++) {
			if (inUse[i]) {
				continue;
			}
			inUse[i] = true;
			if (gyu[idx] > in[i]) {
				permutation(idx + 1, score + (in[i] + gyu[idx]));
			} else {
				permutation(idx + 1, score);
			}
			inUse[i] = false;
		}
	}

	static void solve() throws IOException {
		int testCase = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= testCase; tc++) {
			input();
			permutation(0, 0);
			System.out.println("#" + tc + " " + inWinCount + " " + gyuWinCount);
		}
	}

	public static void main(String[] args) throws IOException {
		solve();
	}
}
