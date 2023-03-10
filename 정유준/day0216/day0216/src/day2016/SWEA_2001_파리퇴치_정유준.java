package day2016;

import java.util.Scanner;

public class SWEA_2001_파리퇴치_정유준 {

	static Scanner sc = new Scanner(System.in);
	static int arrSize;
	static int dmgSize;
	static int row;
	static int col;
	static int[][] arr;
	static int maxDmg;
	static int addDmg;

	static void input() {
		arrSize = sc.nextInt();
		dmgSize = sc.nextInt();
		arr = new int[arrSize][arrSize];
		for (int row = 0; row < arrSize; row++) {
			for (int col = 0; col < arrSize; col++) {
				arr[row][col] = sc.nextInt();
			}
		}
	}

	static void compareDmg() {
		maxDmg = 0;
		for (row = 0; row < arrSize - dmgSize + 1; row++) {
			for (col = 0; col < arrSize - dmgSize + 1; col++) {
				addDmg();
				if (maxDmg < addDmg) {
					maxDmg = addDmg;
				}
			}
		}
	}

	static void addDmg() {
		addDmg = 0;
		for (int rowIdx = row; rowIdx < row + dmgSize; rowIdx++) {
			for (int colIdx = col; colIdx < col + dmgSize; colIdx++) {
				addDmg += arr[rowIdx][colIdx];
			}
		}
	}

	static void solve() {
		int testCase = sc.nextInt();
		for (int idx = 1; idx <= testCase; idx++) {
			input();
			compareDmg();
			System.out.println("#" + idx + " " + maxDmg);
		}
	}

	public static void main(String[] args) {
		solve();
		sc.close();
	}
}
