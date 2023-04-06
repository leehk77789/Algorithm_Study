package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_11726_2xN타일링_정유준 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int col = Integer.parseInt(br.readLine());
		long[] arr = new long[col + 1];
		arr[0] = 1;
		arr[1] = 1;
		for (int i = 2; i <= col; i++) {
			arr[i] = arr[i - 1] + arr[i - 2];
			arr[i] %= 10007;
		}
		System.out.println(arr[col]);

	}
}
