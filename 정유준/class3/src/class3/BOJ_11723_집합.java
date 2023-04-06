package class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BOJ_11723_집합 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static String[] input;
	static int order;
	static ArrayList<Integer> answer;

	static void input() throws NumberFormatException, IOException {
		order = Integer.parseInt(br.readLine());
		answer = new ArrayList<>();
	}

	static void doQuest() throws IOException {
		for (int i = 1; i <= order; i++) {
			input = br.readLine().split(" ");
			if (input[0].equals("add")) {
				add(Integer.parseInt(input[1]));
			} else if (input[0].equals("remove")) {
				remove(Integer.parseInt(input[1]));
			} else if (input[0].equals("check")) {
				if (check(Integer.parseInt(input[1]))) {
					sb.append(1).append("\n");
				} else {
					sb.append(0).append("\n");
				}
			} else if (input[0].equals("toggle")) {
				toggle(Integer.parseInt(input[1]));
			} else if (input[0].equals("all")) {
				all();
			} else {
				empty();
			}
		}
	}

	static void add(int x) {
		answer.add(x);
	}

	static void remove(int x) {
		for (int i = 0; i < answer.size(); i++) {
			if (answer.get(i) == x) {
				answer.remove(i);
			}
		}
	}

	static boolean check(int x) {
		if (answer.contains(x)) {
			return true;
		} else {
			return false;
		}
	}

	static void toggle(int x) {
		if (answer.contains(x)) {
			remove(x);
		} else {
			answer.add(x);
		}
	}

	static void all() {
		answer = new ArrayList<>();
		for (int i = 1; i <= 20; i++) {
			answer.add(i);
		}
	}

	static void empty() {
		answer = new ArrayList<>();
	}

	static void solve() throws NumberFormatException, IOException {
		input();
		doQuest();
		System.out.println(sb);
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		solve();
	}
}
