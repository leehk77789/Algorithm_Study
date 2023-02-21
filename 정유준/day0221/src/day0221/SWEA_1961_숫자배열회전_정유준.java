package day0221;

import java.util.Scanner;

public class SWEA_1961_숫자배열회전_정유준 {
	static Scanner sc = new Scanner(System.in);
	static int[][] original;
	static int[][] change90;
	static int[][] change180;
	static int[][] change270;
	static int[][] answer;
	static int size;

	static void input() {
		size = sc.nextInt();
		original = new int[size][size];
		change90 = new int[size][size];
		change180 = new int[size][size];
		change270 = new int[size][size];

		for (int col = 0; col < size; col++) {
			for (int row = 0; row < size; row++) {
				original[col][row] = sc.nextInt();
			}
		}
	}

	static int[][] turn(int[][] arr) {
		int[][] change = new int[size][size];
		for (int col = 0; col < size; col++) {
			for (int row = 0; row < size; row++) {
				change[col][row] = arr[size - row - 1][col];
			}
		}
		return change;
	}

	static void makeTurn() {
		change90 = turn(original);
		change180 = turn(change90);
		change270 = turn(change180);
	}

	static void makeAnswer() {
		answer = new int[size][3];
		for (int row = 0; row < size; row++) {
			for (int col = 0; col < size; col++) {

			}
		}
	}

	public static void main(String[] args) {
		input();
		makeTurn();

	}
}
