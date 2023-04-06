package counting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class countingWhite {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static String[] input;
	static int[] arr;
	static int[] count;
	static int[] result;

	static void input() throws NumberFormatException, IOException {
		// 0~100
		arr = new int[101];
		count = new int[101];
		result = new int[101];

		// 갑 입력받기
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 101);
		}
	}

	static void countingSort() {
		// 카운팅 배열의 개수 올려주기
		for (int i = 0; i < arr.length; i++) {
			count[arr[i]]++;
		}

		// 누적합
		for (int i = 1; i < count.length; i++) {
			count[i] += count[i - 1];
		}

		// i번째에 존재하는 원소를 인덱스로 갖는 count배열을 감소하고
		// count배열의 값을 인덱스로 하여 result에 값을 저장
		for (int i = arr.length - 1; i >= 0; i--) {
			int value = arr[i];
			count[value]--;
			result[count[value]] = value;
		}

		sb.append(Arrays.toString(result));
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
