import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10828_스택_정유준 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static int top;
	static int[] stack;

	static void input() throws NumberFormatException, IOException {
		int order = Integer.parseInt(br.readLine());
		String[] input;
		top = -1;
		stack = new int[10000];

		for (int i = 1; i <= order; i++) {
			input = br.readLine().split(" ");
			if (input[0].equals("push")) {
				push(Integer.parseInt(input[1]));
			} else if (input[0].equals("top")) {
				sb.append(top() + "\n");
			} else if (input[0].equals("size")) {
				sb.append(size() + "\n");
			} else if (input[0].equals("empty")) {
				sb.append(empty() + "\n");
			} else {
				sb.append(pop(top) + "\n");
			}
		}
	}

	static void push(int x) {
		top++;
		stack[top] = x;
	}

	static int top() {
		if (top == -1) {
			return -1;
		}
		return stack[top];
	}

	static int size() {
		return top + 1;
	}

	static int empty() {
		if (top == -1) {
			return 1;
		}
		return 0;
	}

	static int pop(int x) {
		if (top == -1) {
			return -1;
		}
		int a = stack[top];
		stack[top] = 0;
		top--;
		return a;
	}

	static void solve() throws NumberFormatException, IOException {
		input();
		System.out.println(sb);
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		solve();
	}
}
