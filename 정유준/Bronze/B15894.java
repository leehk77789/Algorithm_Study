import java.util.Scanner;

public class B15894 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        // 1차 시도 문제 자체를 잘못 이해함
		// int N = sc.nextInt();
		// int count = 0;
		// for(int i = N; i >= 1; i--) {
		// 	count += i*4;
		// }
		// System.out.println(count);
        //단위가 문제였다 조건이 10의 9제곱까지이기 때문
        long N = sc.nextLong();
		System.out.println(4 * N);

		sc.close();
	}
}