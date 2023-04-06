import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ_1874_스택수열_정유준 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static String[] input;
	static Stack<Integer> num;
	static int amount;
	static int basic;

	static void input() throws NumberFormatException, IOException {
		num = new Stack<>();
		amount = Integer.parseInt(br.readLine());
		basic = 0;
	}

	static void find() throws NumberFormatException, IOException {
		while (amount >= 1) {
			int given = Integer.parseInt(br.readLine());

			if (given > basic) {
				for (int idx = basic + 1; idx <= given; idx++) {
					num.push(idx);
					sb.append("+").append("\n");
				}
				basic = given;
			} else if (num.peek() != given) {
				System.out.println("NO");
				return;
			}

			num.pop();
			sb.append("-").append("\n");
			amount--;
		}
		System.out.println(sb);
	}

	static void solve() throws NumberFormatException, IOException {
		input();
		find();
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		solve();
	}
}
