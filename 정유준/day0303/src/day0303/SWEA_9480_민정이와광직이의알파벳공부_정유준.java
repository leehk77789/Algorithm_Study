package day0303;

import java.util.Scanner;

public class SWEA_9480_민정이와광직이의알파벳공부_정유준 {

	static Scanner sc = new Scanner(System.in);
	static String[] wordArr;

	static void input() {
		int wordAmount = sc.nextInt();
		wordArr = new String[wordAmount];
		for (int i = 0; i < wordArr.length; i++) {
			wordArr[i] = sc.next();
		}
	}

	static void makeSet() {

	}

	static void solve() {
		int testCase = sc.nextInt();
		for (int idx = 1; idx <= testCase; idx++) {
			input();
			makeSet();
			System.out.println("#" + idx + " " + );
		}
	}

	public static void main(String[] args) {
		solve();
	}
}
