package day0321;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SWEA_2817_부분수열의합_정유준_조합 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int givenNum;
	static int totalLength;
	static int count;
	static int[] numArr;
	static int sum;

	static void input() throws IOException {
		String[] input = br.readLine().split(" ");
		// N값, K값 받기
		int[] num = new int[input.length];
		for (int i = 0; i < num.length; i++) {
			num[i] = Integer.parseInt(input[i]);
		}

		int numLength = num[0];
		givenNum = num[1];

		// 자연수 수열 A만들기
		numArr = new int[numLength];
		input = br.readLine().split(" ");
		for (int i = 0; i < input.length; i++) {
			numArr[i] = Integer.parseInt(input[i]);
		}

		// 끝내는 조건을 위한 static변수 설정
		totalLength = numArr.length;

		// input받을 시 다음 테케이므로 count초기화
		count = 0;
	}

	static void combination(int[] selectList, int selectCount, int currentIdx) {
		if (selectCount == selectList.length) {
			// 모든 원소를 골랐다.
			int tmpSum = 0;
			for (int idx = 0; idx < selectList.length; idx++) {
				tmpSum += selectList[idx];
			}

			if (tmpSum == givenNum) {
				count++;
			}
			return;
		}

		if (currentIdx == numArr.length) {
			return;
		}

		selectList[selectCount] = numArr[currentIdx];
		combination(selectList, selectCount + 1, currentIdx + 1);

		selectList[selectCount] = 0;
		combination(selectList, selectCount, currentIdx + 1);
	}

	static void solve() throws IOException {
		int testCase = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= testCase; tc++) {
			input();
			for (int selectCount = 1; selectCount <= totalLength; selectCount++) {
				combination(new int[selectCount], 0, 0);
			}
			System.out.println("#" + tc + " " + count);
		}
	}

	public static void main(String[] args) throws IOException {
		solve();
	}
}
