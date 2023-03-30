package 알고리즘스레기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class BOJ_20040_사이클게임_정유준 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static int[] par;
	static String[] input;
	static int[][] link;

	static void input() throws NumberFormatException, IOException {
		input = br.readLine().split(" ");
		int spot = Integer.parseInt(input[0]);
		int line = Integer.parseInt(input[1]);
		par = new int[spot + 1];
		for (int idx = 1; idx <= spot; idx++) {
			par[idx] = idx;
		}
		int answer = 0;
		link = new int[line][2];
		for (int i = 0; i < line; i++) {
			input = br.readLine().split(" ");
			link[i][0] = Integer.parseInt(input[0]) + 1;
			link[i][1] = Integer.parseInt(input[1]) + 1;
		}

		Arrays.sort(link, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[0] - o2[0];
			}
		});

//		for (int i = 0; i < line; i++) {
//			for (int j = 0; j < 2; j++) {
//				System.out.print(link[i][j] + " ");
//			}
//			System.out.println();
//		}
	}

	static boolean union(int x, int y) {
		x = find(x);
		y = find(y);

		if (x == y) {
			return false;
		}
		if (x > y) {
			par[y] = x;
		} else {
			par[x] = y;
		}
		return true;
	}

	static int find(int x) {
		if (par[x] == x) {
			return x;
		}

		return par[x] = find(par[x]);
	}

	static void findAnswer() {
		int answer = par[par.length - 1];
		for (int i = 0; i < link.length; i++) {
			union(link[i][0], link[i][1]);
			System.out.println(Arrays.toString(par));
			for (int j = 1; j <= par.length - 1; j++) {
				find(par[j]);
			}
			for (int j = 1; j <= par.length - 1; j++) {
				if (answer != par[j]) {
					break;
				} else {
					sb.append(i + 1);
					System.out.println(i + 1);
					return;
				}
			}
		}
		sb.append(0);
	}

	static void solve() throws NumberFormatException, IOException {
		input();
		findAnswer();
		System.out.println(sb);
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		solve();
	}
}
