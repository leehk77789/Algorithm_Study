package day0320;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class SWEA_5658_보물상자비밀번호_정유준 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static ArrayList<Integer> numArr;
	static HashSet<Integer> answerArr;
	static String input;
	static int N;
	static int K;
	static int length;

	static void input() throws IOException {
		String[] inputStr = br.readLine().split(" ");
		N = Integer.parseInt(inputStr[0]) / 4;
		K = Integer.parseInt(inputStr[1]);
		input = br.readLine();
		length = input.length();
		input += input;
		numArr = new ArrayList<Integer>();
	}

	static int makeNum(char a) {
		if ((a - 65) >= 0) {
			return a - 55;
		} else {
			return a - 48;
		}
	}

	static void makeAnswer() {
		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			int a = 0;
			int multi = N;
			int idx = 0;
			while (true) {
				multi--;
				if (multi == -1) {
					break;
				}
				a += Math.pow(16, multi) * makeNum(input.charAt(i + idx));
				idx++;
			}
			numArr.add(a);
			count++;
			if (count == length) {
				break;
			}
		}
		answerArr = new HashSet<>(numArr);
		numArr = new ArrayList<>(answerArr);
		Collections.sort(numArr);
		Collections.reverse(numArr);
	}

	static void solve() throws IOException {
		int testCase = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= testCase; tc++) {
			input();
			makeAnswer();
			System.out.println("#" + tc + " " + numArr.get(K - 1));
		}
	}

	public static void main(String[] args) throws IOException {
		solve();
	}
}
