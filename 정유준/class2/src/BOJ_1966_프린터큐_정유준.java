import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class BOJ_1966_프린터큐_정유준 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static Queue<Integer> q;
	static int num;
	static int targetIdx;
	static int target;
	static int idx;
	static int turn;

	static void input() throws NumberFormatException, IOException {
		q = new LinkedList<Integer>();
		String[] input = br.readLine().split(" ");
		num = Integer.parseInt(input[0]);
		targetIdx = Integer.parseInt(input[1]);
		input = br.readLine().split(" ");
		for (int i = 0; i < input.length; i++) {
			if (i == targetIdx) {
				target = Integer.parseInt(input[i]);
			}
			q.add(Integer.parseInt(input[i]));
		}
		idx = 1;
		turn = 1;
	}

	static void doPick() {
		int a;
		while (true) {
			a = q.peek();
			if (a == idx) {
				q.poll();
				if (a == target) {
					sb.append(turn).append("\n");
					return;
				}
				turn++;
				if (!q.contains(idx)) {
					idx++;
				}
			} else {
				q.add(q.poll());
			}
		}
	}

	static void solve() throws NumberFormatException, IOException {
		int testCase = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= testCase; tc++) {
			input();
			doPick();
		}
		System.out.println(sb);
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		solve();
	}
}
