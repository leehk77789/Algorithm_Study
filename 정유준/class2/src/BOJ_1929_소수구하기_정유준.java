import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1929_소수구하기_정유준 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static boolean[] checkIdx;
	static int min;
	static int max;

	static void input() throws NumberFormatException, IOException {
		String[] input = br.readLine().split(" ");
		min = Integer.parseInt(input[0]);
		max = Integer.parseInt(input[1]);
		checkIdx = new boolean[max + 1];
	}

	static void findSosu() {
		checkIdx[0] = true;
		checkIdx[1] = true;

		for (int i = 2; i <= Math.sqrt(checkIdx.length); i++) {
			if (checkIdx[i]) {
				continue;
			}

			for (int j = i * i; j < checkIdx.length; j += i) {
				checkIdx[j] = true;
			}
		}
	}

	static void solve() throws NumberFormatException, IOException {
		input();
		findSosu();
		for (int i = min; i <= max; i++) {
			if (!checkIdx[i]) {
				sb.append(i).append("\n");
			}
		}
		System.out.println(sb);
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		solve();
	}
}
