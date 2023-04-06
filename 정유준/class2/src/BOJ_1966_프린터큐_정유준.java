import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BOJ_1966_프린터큐_정유준 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static String[] input;
	static int where;
	static ArrayList<Integer> num;
	static int count;
	static int max;

	static void input() throws NumberFormatException, IOException {
		input = br.readLine().split(" ");
		int munsuoNum = Integer.parseInt(input[0]);
		where = Integer.parseInt(input[1]);
		num = new ArrayList<>();
		input = br.readLine().split(" ");
		max = 0;
		for (int i = 0; i < munsuoNum; i++) {
			num.add(Integer.parseInt(input[i]));
			if (Integer.parseInt(input[i]) > max) {
				max = Integer.parseInt(input[i]);
			}
		}
		count = 0;
	}

	static void doPop() {
		while (true) {
			if (num.size() == 0) {
				return;
			}

			if (num.get(0) == max) {
				max = 0;
				count++;
				if (where == 0) {
					sb.append(count).append("\n");
					return;
				}
				num.remove(0);
				where--;
				if (where <= -1) {
					where = num.size() - 1;
				}
				for (int i = 0; i < num.size(); i++) {
					if (max < num.get(i)) {
						max = num.get(i);
					}
				}
			} else {
				num.add(num.get(0));
				num.remove(0);
				where--;
				if (where <= -1) {
					where = num.size() - 1;
				}
			}
		}
	}

	static void solve() throws NumberFormatException, IOException {
		int testCase = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= testCase; tc++) {
			input();
			doPop();
		}
		System.out.println(sb);
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		solve();
	}
}
