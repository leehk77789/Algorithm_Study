package day0403;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SWEA_5656_벽돌깨기 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static String[] input;
	static int shootCount;
	static int nowShoot;
	static int[][] map;
	static int count;
	static int maxCount;

	static void input() throws NumberFormatException, IOException {
		count = 0;
		maxCount = 0;

		input = br.readLine().split(" ");
		shootCount = Integer.parseInt(input[0]);
		int width = Integer.parseInt(input[1]);
		int hight = Integer.parseInt(input[2]);

		map = new int[hight][width];

		for (int row = 0; row < hight; row++) {
			input = br.readLine().split(" ");
			for (int col = 0; col < width; col++) {
				map[row][col] = Integer.parseInt(input[col]);
			}
		}
	}

	static void playGame() {
		for (int col = 0; col < map[0].length; col++) {
			int startPoint = 0;
			for (int row = 0; row < map.length; row++) {
				if (map[row][col] != 0) {
					startPoint = row;
					break;
				}
			}
			crush(col, map[startPoint][col]);
		}
	}

	static void crush(int col, int power) {

	}

	static void solve() throws NumberFormatException, IOException {
		int testCase = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= testCase; tc++) {
			input();
			for (int i = 1; i <= shootCount; i++) {
				playGame();
			}

		}
		System.out.println(sb);
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		solve();
	}
}
