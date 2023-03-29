package day0329;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SWEA_7465_창용마을무리의개수_정유준 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int[] parentList;
	static int[][] connect;

	static void input() throws NumberFormatException, IOException {
		String[] input = br.readLine().split(" ");
		int people = Integer.parseInt(input[0]);
		int line = Integer.parseInt(input[1]);
		parentList = new int[people + 1];
		for (int idx = 0; idx < people + 1; idx++) {
			parentList[idx] = idx;
		}
		linkList
	}

	// 대표찾기
	static int find(int x) {
	}

	// 병합시키기
	static void union(int x, int y) {
	}

	static void solve() throws NumberFormatException, IOException {
		int testCase = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= testCase; tc++) {
			input();
			findLink();
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		solve();
	}
}
