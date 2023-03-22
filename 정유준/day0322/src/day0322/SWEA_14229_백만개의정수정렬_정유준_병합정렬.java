package day0322;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SWEA_14229_백만개의정수정렬_정유준_병합정렬 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int[] num;
	static int[] answer;

	static void input() throws IOException {
		String[] input = br.readLine().split(" ");
		num = new int[input.length];
		for (int i = 0; i < num.length; i++) {
			num[i] = Integer.parseInt(input[i]);
		}
		answer = new int[num.length];
	}

	static void mergeSort(int left, int right) {
		if (left < right) {
			int mid = (left + right) / 2;

			mergeSort(left, mid);
			mergeSort(mid + 1, right);
			merge(left, mid, right);
		}
	}

	static void merge(int left, int mid, int right) {
		int leftIdx = left;
		int rightIdx = mid + 1;
		int idx = left;
		while (leftIdx <= mid && rightIdx <= right) {
			if (num[leftIdx] <= num[rightIdx]) {
				answer[idx++] = num[leftIdx++];
			} else {
				answer[idx++] = num[rightIdx++];
			}
		}

		if (leftIdx <= mid) {
			for (int i = leftIdx; i <= mid; i++) {
				answer[idx++] = num[i];
			}
		} else {
			for (int j = rightIdx; j <= right; j++) {
				answer[idx++] = num[j];
			}
		}
		for (int i = left; i <= right; i++) {
			num[i] = answer[i];
		}
	}

	static void solve() throws IOException {
		input();

		mergeSort(0, num.length - 1);

		System.out.println(num[500000]);
	}

	public static void main(String[] args) throws IOException {
		solve();
	}
}
