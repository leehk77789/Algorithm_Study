import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1697_숨바꼭질_정유준 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int N;
	static int K;
	static int count;
	static int left;

	static void input() throws IOException {
		String[] input = br.readLine().split(" ");
		N = Integer.parseInt(input[0]);
		K = Integer.parseInt(input[1]);
	}

	static void findWay() {
		// 걸린 시간
		count = 0;
		// 현재 위치
		int nowAt = N;
		while (true) {
			if (K - nowAt < nowAt * 2) {
				break;
			}
			nowAt *= 2;
			count++;
		}
		left = K - nowAt;
	}

	static void solve() throws IOException {
		input();
		findWay();
		System.out.println(count + left);
	}

	public static void main(String[] args) throws IOException {
		solve();
	}
}
