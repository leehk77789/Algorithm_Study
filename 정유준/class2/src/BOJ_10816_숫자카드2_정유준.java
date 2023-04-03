import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_10816_숫자카드2_정유준 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int[] num;
	static int[] checkNum;
	static int[] count;

	static void input() throws NumberFormatException, IOException {
		int N = Integer.parseInt(br.readLine());
		String[] input = br.readLine().split(" ");
		num = new int[input.length];
		for (int i = 0; i < num.length; i++) {
			num[i] = Integer.parseInt(input[i]);
		}
		N = Integer.parseInt(br.readLine());
		input = br.readLine().split(" ");
		checkNum = new int[input.length];
		for (int i = 0; i < checkNum.length; i++) {
			checkNum[i] = Integer.parseInt(input[i]);
		}
		Arrays.sort(num);
		count = new int[checkNum.length];
	}

	static void split(int target, int left, int right) {
		int mid = (left + right) / 2;
		if (target == num[mid]) {
			count++;
		}
		if (target < num[mid]) {
			split(target, left, mid - 1);
		} else {
			split(target, mid + 1, right);
		}
	}

	static void solve() throws NumberFormatException, IOException {
		input();
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		solve();
	}
}
