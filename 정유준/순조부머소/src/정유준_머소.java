import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 정유준_머소 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int[] num;
	static int[] tmp;

	static void input() throws IOException {
		String[] input = br.readLine().split(" ");
		num = new int[input.length];

		for (int i = 0; i < num.length; i++) {
			num[i] = Integer.parseInt(input[i]);
		}

		tmp = new int[num.length];
	}

	static void merge(int left, int right) {
		if (left == right) {
			return;
		}

		int mid = (left + right) / 2;

		merge(left, mid);
		merge(mid + 1, right);
		sort(left, mid, right);
	}

	static void sort(int left, int mid, int right) {
		int leftIdx = left;
		int rightIdx = mid + 1;
		int nowIdx = left;

		while (leftIdx <= mid && rightIdx <= right) {
			if (num[leftIdx] <= num[rightIdx]) {
				tmp[nowIdx++] = num[leftIdx++];
			} else {
				tmp[nowIdx++] = num[rightIdx++];
			}
		}

		if (leftIdx > mid) {
			while (rightIdx <= right) {
				tmp[nowIdx++] = num[rightIdx++];
			}
		} else {
			while (leftIdx <= mid) {
				tmp[nowIdx++] = num[leftIdx++];
			}
		}
		System.out.println(Arrays.toString(tmp));
		for (int idx = left; idx <= right; idx++) {
			num[idx] = tmp[idx];
		}
	}

	static void solve() throws IOException {
		input();
		merge(0, num.length - 1);
		System.out.println(Arrays.toString(num));
	}

	public static void main(String[] args) throws IOException {
		solve();
	}
}
