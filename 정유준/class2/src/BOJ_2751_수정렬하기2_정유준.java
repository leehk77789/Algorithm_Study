import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_2751_수정렬하기2_정유준 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		int[] arr = new int[N];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		Arrays.sort(arr);

		StringBuilder sb = new StringBuilder();

		sb.append(arr[0] + "\n");

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] == arr[i - 1]) {
				continue;
			}
			sb.append(arr[i] + "\n");
		}
		System.out.println(sb);
	}
}