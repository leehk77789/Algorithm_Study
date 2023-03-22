package day0322;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SWEA_14229_백만개의정수정렬_정유준_퀵정렬Hoare {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int[] num;

	static void input() throws IOException {
		String[] input = br.readLine().split(" ");
		num = new int[input.length];
		for (int i = 0; i < num.length; i++) {
			num[i] = Integer.parseInt(input[i]);
		}
	}

	static int hoare(int left, int right) {
		int pivot = num[left];
		int leftIdx = left + 1;
		int rightIdx = right;

		while (leftIdx <= rightIdx) {
			while (leftIdx <= rightIdx && num[leftIdx] <= pivot) {
				leftIdx++;
			}
			while (num[rightIdx] > pivot) {
				rightIdx--;
			}
			if (leftIdx < rightIdx) {
				swap(leftIdx, rightIdx);
			}
		}
		swap(left, rightIdx);
		return rightIdx;
	}

	static void swap(int a, int b) {
		int temp = num[a];
		num[a] = num[b];
		num[b] = temp;
	}

	static void solve() throws IOException {
		input();
		hoare(0, num.length - 1);
		System.out.println(Arrays.toString(num));
//		System.out.println(num[500000]);
	}

	public static void main(String[] args) throws IOException {
		solve();
	}
}
