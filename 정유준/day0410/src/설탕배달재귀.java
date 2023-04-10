import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 설탕배달재귀 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static String input;
	static int amount;
	static int sum;
	static int count;
	static int min;
	static boolean flag;

	static void input() throws NumberFormatException, IOException {
		amount = Integer.parseInt(br.readLine());
		sum = 0;
		count = 0;
		min = Integer.MAX_VALUE;
		flag = false;
	}

	static void find() {
		if (flag == true) {
			return;
		}

		if (sum > amount) {
			return;
		}

		if (count > min) {
			return;
		}

		if (sum == amount) {
			if (count < min) {
				min = count;
				flag = true;
			}
			return;
		}
		count++;
		sum += 5;
		find();
		sum -= 5;
		sum += 3;
		find();
		sum -= 3;
		count--;
	}

	static void solve() throws NumberFormatException, IOException {
		input();
		find();
		if (!flag) {
			sb.append(-1);
		} else {
			sb.append(min);
		}
		System.out.println(sb);
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		solve();
	}
}
