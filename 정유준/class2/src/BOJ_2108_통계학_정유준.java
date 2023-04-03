import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_2108_통계학_정유준 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static int[] num;
	static int[][] count;
	static int[] compare;

	static void input() throws NumberFormatException, IOException {
		int numAmount = Integer.parseInt(br.readLine());
		num = new int[numAmount];
		for (int i = 0; i < numAmount; i++) {
			num[i] = Integer.parseInt(br.readLine());
		}
		count = new int[num.length][1];
		compare = new int[num.length];
		Arrays.sort(num);
	}

	static void addSum() {
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			sum += num[i];
		}
		System.out.println(sum / num.length);
	}

	static void sort() {
		sb.append(num[num.length / 2]).append("\n");
	}

	static void mostSeen() {
		int max = 0;
		for (int i = 0; i < num.length; i++) {
			count[i][0]++;
		}
		for (int i = 0; i < count.length; i++) {
			if (count[i][0] > max) {
				max = count[i][0];
			}
		}
		int same = 0;
		for (int i = 0; i < count.length; i++) {
			if (count[i][0] == max) {
				same++;
				if (same == 2) {
					sb.append(num[count[i][0]]).append("\n");
				}
			}
		}
	}

	static void maxMin() {
		sb.append(num[num.length - 1] - num[0]);
	}

	static void solve() throws NumberFormatException, IOException {
		input();
		addSum();
		sort();
		mostSeen();
		maxMin();
		System.out.println(sb);
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		solve();
	}
}
