import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 정유준_조합 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int[] num;
	static int[] output;

	static void input() throws IOException {
		String[] input = br.readLine().split(" ");
		num = new int[input.length];
		for (int i = 0; i < input.length; i++) {
			num[i] = Integer.parseInt(input[i]);
		}
		int arrayLength = Integer.parseInt(br.readLine());
		output = new int[arrayLength];
	}

	static void combination(int idx, int nowIdx) {
		if (nowIdx == output.length) {
			System.out.println(Arrays.toString(output));
			return;
		}

		for (int i = idx; i <= num.length + nowIdx - output.length; i++) {
			output[nowIdx] = num[i];
			combination(idx + 1, nowIdx + 1);
		}
	}

	static void solve() throws IOException {
		input();
		combination(0, 0);
	}

	public static void main(String[] args) throws IOException {
		solve();
	}
}