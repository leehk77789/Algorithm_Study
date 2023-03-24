package day0324;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SubSet {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	// 주어지는 총 숫자의 개수
	static int size;

	// 주어진 숫자 배열
	static int[] numArr;

	// 출력할 배열
	static int[] outPut;

	static void input() throws IOException {
		size = Integer.parseInt(br.readLine());
		String[] input = br.readLine().split(" ");
		outPut = new int[size];
		numArr = new int[size];
		for (int i = 0; i < numArr.length; i++) {
			numArr[i] = Integer.parseInt(input[i]);
		}
	}

	static void subset(int outPutIdx, int numArrIdx) {
		if (numArrIdx == size) {
			System.out.println(Arrays.toString(outPut));
			return;
		}
		// 해당 숫자를 추가하는경우
		outPut[outPutIdx] = numArr[numArrIdx];
		subset(outPutIdx + 1, numArrIdx + 1);

		// 해당 숫자를 추가하지 않는 경우
		outPut[outPutIdx] = 0;
		subset(outPutIdx, numArrIdx + 1);
	}

	static void solve() throws IOException {
		input();
		subset(0, 0);
	}

	public static void main(String[] args) throws IOException {
		solve();
	}
}
