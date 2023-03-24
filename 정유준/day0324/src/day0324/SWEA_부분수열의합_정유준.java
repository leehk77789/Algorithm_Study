package day0324;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SWEA_부분수열의합_정유준 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	// 주어지는 총 숫자의 개수
	static int size;

	// 조합 목표 숫자
	static int makeNum;

	// 주어진 숫자 배열
	static int[] numArr;

	// 총 합
	static int sum;

	// 조건을 만족하는 개수 세기;
	static int count;

	static void input() throws IOException {
		String[] input = br.readLine().split(" ");
		size = Integer.parseInt(input[0]);
		makeNum = Integer.parseInt(input[1]);
		input = br.readLine().split(" ");
		numArr = new int[size];
		for (int i = 0; i < numArr.length; i++) {
			numArr[i] = Integer.parseInt(input[i]);
		}
		count = 0;
		sum = 0;
	}

	static void subset(int idx) {
		if (sum > makeNum) {
			return;
		}

		if (idx == size) {
			if (sum == makeNum) {
				count++;
			}
			return;
		}

		sum += numArr[idx];
		subset(idx + 1);
		sum -= numArr[idx];
		subset(idx + 1);
	}

	static void solve() throws IOException {
		int testCase = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= testCase; tc++) {
			input();
			subset(0);
			System.out.println("#" + tc + " " + count);
		}
	}

	public static void main(String[] args) throws IOException {
		solve();
	}
}
