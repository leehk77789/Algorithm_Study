package 알고리즘스레기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BOJ_2581_소수_정유준 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int minNum;
	static int maxNum;
	static ArrayList<Integer> answer;
	static boolean[] sosu;

	static void input() throws IOException {
		minNum = Integer.parseInt(br.readLine());
		maxNum = Integer.parseInt(br.readLine());
		answer = new ArrayList<>();
	}

	static void findSosu() {
		for (int i = minNum; i <= maxNum; i++) {
			if (i == 1) {
				continue;
			}
			for (int j = 2; j <= i; j++) {
				if (j == i) {
					answer.add(i);
					break;
				}
				if (i % j == 0) {
					break;
				}
			}
		}
	}

	static void solve() throws IOException {
		input();
		findSosu();
		if (answer.isEmpty()) {
			System.out.println(-1);
		} else {
			int sum = 0;
			for (int i = 0; i < answer.size(); i++) {
				sum += answer.get(i);
			}
			System.out.println(sum);
			System.out.println(answer.get(0));
		}
	}

	public static void main(String[] args) throws IOException {
		solve();
	}
}
