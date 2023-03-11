package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class S1920 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int originNums = Integer.parseInt(br.readLine());
		origin = new int[originNums];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < originNums; i++) {
			origin[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(origin);

		int findNums = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < findNums; i++) {
			int find = Integer.parseInt(st.nextToken());
			System.out.println(findNumber(find));
		}
	}

	public static int[] origin;

	private static int findNumber(int i) {
		int start = 0;
		int end = origin.length - 1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (origin[mid] == i) {
				return 1;
			} else if (origin[mid] > i) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return 0;
	}
}
