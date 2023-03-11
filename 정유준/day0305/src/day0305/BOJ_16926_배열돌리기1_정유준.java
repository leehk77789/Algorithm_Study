package day0305;

import java.util.Scanner;

public class BOJ_16926_배열돌리기1_정유준 {
	static int[][] map;
	static int col;
	static int row;
	static int nowCol;
	static int nowRow;

	static void doRotate() {
		for (int i = 0; i < col; i++) {
			for (int j = 0; j < row; j++) {
				if (i == nowCol) {

				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		col = sc.nextInt();
		row = sc.nextInt();
		map = new int[col][row];
		int count = 1;

		for (int i = 0; i < col; i++) {
			for (int j = 0; j < row; j++) {
				map[i][j] = count++;
			}
		}

		// 확인용
//		for (int i = 0; i < col; i++) {
//			for (int j = 0; j < row; j++) {
//				System.out.print(map[i][j]);
//			}
//			System.out.println();
//		}
	}
}
