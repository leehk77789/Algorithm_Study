import java.util.Arrays;
import java.util.Scanner;

public class BOJ_10989_수정렬하기3_정유준 {

	public static void main(String[] args) {
		// bufferedreader 쓰면 풀림
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[] arr = new int[a];
		for (int idx = 0; idx < a; idx++) {
			arr[idx] = sc.nextInt();
		}

		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
