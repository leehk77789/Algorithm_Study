import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_15649_N과M1_정유준 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int num;
	static int length;
	static int[] answer;

	static void input() throws IOException {
		String[] input = br.readLine().split(" ");
		num = Integer.parseInt(input[0]);
		length = Integer.parseInt(input[1]);
		answer = new int[length];
	}

	static void combination(int inputNum, int moveIdx) {
		if (moveIdx == length) {
			for (int i = 0; i < answer.length; i++) {
				System.out.print(answer[i] + " ");
			}
			System.out.println();
			return;
		}

		for (int i = 0; i < num; i++) {
		}
		return;
	}

	static void solve() throws IOException {
		input();
		combination(1, 0);
	}

	public static void main(String[] args) throws IOException {
		solve();
	}
}
