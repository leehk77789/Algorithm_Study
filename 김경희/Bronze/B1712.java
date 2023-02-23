package bronze2;

import java.util.Scanner;

public class B1712 { //손익분기점
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		// a+bn < cn이 되는 최소 n을 구해야한다
		// 정리해보면 a < (c-b)n
		// 이때, (양의 정수)n의 최솟값을 구해야하는데 c-b <=0이면 성립하지 않는 식.

		if (c - b <= 0) {
			System.out.println(-1);
		} else {
			int n = a / (c - b) + 1; // 버림해서 나온 정수에 1을 더한다. (부등호에 등호가 포함되지 않음)
			System.out.println(n);
		}

	}
}
