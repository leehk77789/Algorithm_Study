import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ_10773_제로_정유준 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static Stack<Integer> num;
	static int sum;

	static void input() throws NumberFormatException, IOException {
		num = new Stack<>();
		sum = 0;
		int amount = Integer.parseInt(br.readLine());
		for (int i = 1; i <= amount; i++) {
			int inputNum = Integer.parseInt(br.readLine());
			if (inputNum == 0) {
				num.pop();
			} else {
				num.add(inputNum);
			}
		}
	}

	static void checkSum() {
		while (!num.isEmpty()) {
			sum += num.pop();
		}
	}

	static void solve() throws NumberFormatException, IOException {
		input();
		checkSum();
		System.out.println(sum);
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		solve();
	}
}
