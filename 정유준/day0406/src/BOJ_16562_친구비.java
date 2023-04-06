import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_16562_친구비 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static String[] input;
	static int student;
	static int friend;
	static int money;
	static int[] par;
	static int[] charge;
	static int sum;

	static void input() throws NumberFormatException, IOException {
		input = br.readLine().split(" ");
		student = Integer.parseInt(input[0]);
		friend = Integer.parseInt(input[1]);
		money = Integer.parseInt(input[2]);
		par = new int[student + 1];
		for (int i = 1; i <= student; i++) {
			par[i] = i;
		}
		charge = new int[student + 1];
		input = br.readLine().split(" ");
		for (int i = 1; i < student; i++) {
			charge[i] = Integer.parseInt(input[i - 1]);
		}
		sum = 0;
	}

	static void make() throws IOException {
		for (int i = 1; i <= friend; i++) {
			input = br.readLine().split(" ");
			union(Integer.parseInt(input[0]), Integer.parseInt(input[1]));
		}

		int different = 0;

		for (int i = 0; i < par.length; i++) {
			find(i);
		}

	}

	static void union(int x, int y) {
		x = find(x);
		y = find(y);

		if (x == y) {
			return;
		}

		if (x > y) {
			par[y] = x;
		} else {
			par[x] = y;
		}
	}

	static int find(int x) {
		if (par[x] == x) {
			return x;
		}

		return par[x] = find(par[x]);
	}

	static void solve() throws NumberFormatException, IOException {
		int testCase = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= testCase; tc++) {
			input();

		}
		System.out.println(sb);
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		solve();
	}
}
