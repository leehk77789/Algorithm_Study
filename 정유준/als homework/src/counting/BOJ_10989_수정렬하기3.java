package counting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10989_수정렬하기3 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static int[] arr;
	static int[] count;
	static int[] result;

	static void input() throws NumberFormatException, IOException {
		int num = Integer.parseInt(br.readLine());
		int max = 0;
		arr = new int[num];
		result = new int[num];

		for (int i = 0; i < num; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		count = new int[max + 1];
	}

	static void countingSort() {
		for (int i = 0; i < arr.length; i++) {
			count[arr[i]]++;
		}

		for (int i = 1; i < count.length; i++) {
			count[i] += count[i - 1];
		}

		for (int i = arr.length - 1; i >= 0; i--) {
			int value = arr[i];
			count[value]--;
			result[count[value]] = value;
		}

		for (int i = 0; i < result.length; i++) {
			sb.append(result[i]).append("\n");
		}
	}

	static void solve() throws NumberFormatException, IOException {
		input();
		countingSort();
		System.out.println(sb);
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		solve();
	}
}
