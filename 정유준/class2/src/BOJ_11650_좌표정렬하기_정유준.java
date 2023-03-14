import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class BOJ_11650_좌표정렬하기_정유준 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		int[][] arr = new int[N][2];
		for (int i = 0; i < arr.length; i++) {
			String[] input = br.readLine().split(" ");
			arr[i][0] = Integer.parseInt(input[0]);
			arr[i][1] = Integer.parseInt(input[1]);
		}

		Arrays.sort(arr, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				if (o1[0] == o2[0]) {
					return o1[1] - o2[1];
				} else {
					return o1[0] - o2[0];
				}
			}
		});

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < 2; j++) {
				sb.append(arr[i][j] + " ");
			}
			sb.append("\n");
		}
		System.out.println(sb);
		br.close();
	}
}
