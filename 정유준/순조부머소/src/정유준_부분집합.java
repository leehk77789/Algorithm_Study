import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class 정유준_부분집합 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int[] num;
	static boolean[] check;

	static void input() throws IOException {
		String[] input = br.readLine().split(" ");
		num = new int[input.length];
		for (int i = 0; i < input.length; i++) {
			num[i] = Integer.parseInt(input[i]);
		}
		check = new boolean[num.length];
	}

	static void subset(int idx) {
		if (idx == num.length) {
			ArrayList<Integer> output = new ArrayList<>();
			for (int i = 0; i < num.length; i++) {
				if (check[i]) {
					output.add(num[i]);
				}
			}
			System.out.println(output);
			return;
		}

		check[idx] = true;
		subset(idx + 1);
		check[idx] = false;
		subset(idx + 1);
	}

	static void solve() throws IOException {
		input();
		subset(0);
	}

	public static void main(String[] args) throws IOException {
		solve();
	}
}