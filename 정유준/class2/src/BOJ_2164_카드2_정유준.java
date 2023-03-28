import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class BOJ_2164_카드2_정유준 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static Queue<Integer> num;

	static void input() throws NumberFormatException, IOException {
		int N = Integer.parseInt(br.readLine());
		num = new LinkedList<Integer>();

		for (int i = 1; i <= N; i++) {
			num.offer(i);
		}
	}

	static void doShuffle() {
		while (!(num.size() == 1)) {
			num.remove();
			num.offer(num.peek());
			num.remove();
		}
	}

	static void solve() throws NumberFormatException, IOException {
		input();
		doShuffle();
		System.out.println(num.peek());
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		solve();
	}
}
