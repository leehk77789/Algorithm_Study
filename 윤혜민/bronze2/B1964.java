package baekjoon;

import java.util.*;

public class B1964 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 대체 왜 long으로 받아야하는지는 모르겠지만
        // int넣었더니 오류뜬다.
		long N = sc.nextLong();

        // 왼쪽 아래 꼭짓점 1개를 sum의 초기화 값으로 보겠음
		long sum = 1;

		// 이 문제는 점화식이다
        // A(1) = 1 + 3*n + 1 = 5
        // A(n) = A(n-1) + 3*n + 1
		for (int i = 1; i <= N; i++) {
            // for문을 통해 sum에게 반복적으로 더해서 구할 수 있다
			sum += 3 * i + 1;
		}
        // 근데 또 틀렸다 문제를 제대로 안읽었기 때문이다
        // 45678로 나누랜다 내힘들다   
        // 진짜 끝-
		System.out.println(sum % 45678);
	}
}
