import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ_9012_괄호_정유준 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static Stack<String> arr;

	static void input() throws NumberFormatException, IOException {
		String[] input = br.readLine().split(" ");
		arr = new Stack<>();
		for (int i = 0; i < input.length; i++) {
			arr.add(input[i]);
		}
	}

	static void check() {
		while (true) {

		}
	}

	static void solve() throws NumberFormatException, IOException {
		int testCase = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= testCase; tc++) {
			input();
			arr.clear();
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		solve();
	}

}
