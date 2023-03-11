package class2;

import java.util.Scanner;

public class BOJ_2231_분해합_정유준 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		boolean flag = false;
		for (int i = 1; i <= N; i++) {
			String a = Integer.toString(i);

			char[] arr = a.toCharArray();

			int sum = 0;
			for (int j = 0; j < arr.length; j++) {
				sum += (arr[j] - '0');
			}
			if (sum + i == N) {
				flag = true;
				System.out.println(i);
				break;
			}
		}
		if(!flag) {
			System.out.println(0);
		}
	}
}
