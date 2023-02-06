package baekjoon;

import java.util.*;

public class B1712 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();

		// 제품 n대를 생산한다고 할 때
		// 필요로 하는 전체 비용은 A + B * n이며
		// 발생하게 될 수익은 C * n이다
		// 따라서 손익분기점을 넘기려면 A + B * n < C * n이 성립되어야 함
		// 이 식을 n에 대해서 정리하면 A / (C - B) < n이다 
		if (C - B > 0) {
			// 분모가 양수인 경우 식이 성립하므로
			System.out.println(A / (C - B) + 1);
			// 이상이 아닌 초과의 값이기에 + 1 을 해준다.
		} else {
			// 분모가 0이거나 음수인 경우 식이 성립하지 않는다.
			// 즉 손익분기점이 존재하지 않는다.
			System.out.println(-1);
		}
	}
}
