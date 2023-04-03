import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ_9012_괄호_정유준 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static Stack<Character> arr;
	static String str;
	static int length;

	static void input() throws IOException {
		arr = new Stack<>();
		str = br.readLine();
		length = str.length();
	}

	static void check() throws IOException {
		for (int i = 0; i < length; i++) {
			char ch = str.charAt(i);

			if (ch == '(') {
				arr.push(ch);
			} else {
				int size = arr.size();
				if (size == 0) {
					arr.push(ch);
					break;
				} else {
					arr.pop();
				}
			}
		}
		if (arr.isEmpty()) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		arr.clear();
	}

	static void solve() throws NumberFormatException, IOException {
		int testCase = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= testCase; tc++) {
			input();
			check();
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		solve();
	}

}
