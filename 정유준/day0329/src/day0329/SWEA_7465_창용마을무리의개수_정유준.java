package day0329;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SWEA_7465_창용마을무리의개수_정유준 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int[] parentList;
	static int answer;

	static void input() throws NumberFormatException, IOException {
		String[] input = br.readLine().split(" ");
		int people = Integer.parseInt(input[0]);
		int line = Integer.parseInt(input[1]);
		parentList = new int[people + 1];
		for (int idx = 1; idx <= people; idx++) {
			parentList[idx] = idx;
		}

		for (int idx = 0; idx < line; idx++) {
			input = br.readLine().split(" ");
			union(Integer.parseInt(input[0]), Integer.parseInt(input[1]));
		}
		answer = 0;
	}

	// 대표찾기
	static int find(int x) {
		if (parentList[x] == x) {
			return x;
		}

		return parentList[x] = find(parentList[x]);
	}

	// 병합시키기
	static void union(int x, int y) {
		x = find(x);
		y = find(y);

		if (x > y) {
			parentList[y] = x;
		} else {
			parentList[x] = y;
		}
	}

	static void findAnswer() {
		for (int i = 1; i < parentList.length; i++) {
			if (parentList[i] == i) {
				answer++;
			}
		}
	}

	static void solve() throws NumberFormatException, IOException {
		int testCase = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= testCase; tc++) {
			input();
			findAnswer();
			System.out.println("#" + tc + " " + answer);
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		solve();
	}
}
