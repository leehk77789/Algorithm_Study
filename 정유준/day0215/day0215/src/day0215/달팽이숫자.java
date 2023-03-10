package day0215;

import java.util.Scanner;

public class 달팽이숫자 {
	static Scanner sc = new Scanner(System.in);
	static int arr[][];
	static int snailSize;
	static int[] xMove = { 1, 0, -1, 0 };
	static int[] yMove = { 0, 1, 0, -1 };

	static void input() {
		// 달팽이의 크기
		snailSize = sc.nextInt();
		arr = new int[snailSize][snailSize];
	}

	static void moveSnail() {
		int x = 0;
		int y = 0;
		int count = 1;
		int directionChoice = 0;

		while (count <= (snailSize * snailSize)) {
			arr[y][x] = count;
			count++;
			x += xMove[directionChoice];
			y += yMove[directionChoice];

			if (x > snailSize - 1 || y > snailSize - 1 || x < 0 || y < 0 || arr[y][x] != 0) {
				x -= xMove[directionChoice];
				y -= yMove[directionChoice];

				if (directionChoice == 3) {
					directionChoice = 0;
				} else {
					directionChoice++;
				}

				x += xMove[directionChoice];
				y += yMove[directionChoice];
			}
			
		}
	}

	static void printSnail() {
		for (int y = 0; y < snailSize; y++) {
			for (int x = 0; x < snailSize; x++) {
				System.out.print(arr[y][x] + " ");
			}
			System.out.println();
		}
	}

	static void solve() {
		int testCase = sc.nextInt();
		for (int i = 1; i <= testCase; i++) {
			input();
			moveSnail();
			System.out.println("#" + i);
			printSnail();
		}
	}

	public static void main(String[] args) {
		solve();
		sc.close();
	}
}
