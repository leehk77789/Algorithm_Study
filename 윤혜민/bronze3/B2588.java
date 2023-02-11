package algorithm;

import java.util.*;

public class B2588 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 두 정수를 입력받는다
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		// 출력값이 들어갈 배열을 생성한다
		int[] numList = new int[3];

		// 두번째 정수의 자릿수를 계산한다
		// 첫번째 출력값의 경우 두번쨰 정수를 10으로 나누었을 때 나머지를 첫번째 정수와 곱한 값이다.
		for (int i = 0; i < 3; i++) {
			numList[i] = num1 * (num2 % 10);
			num2 /= 10;
		}

		// 배열에 들어간 수들을 곱셈으로 만들어준다.
		int multiple = numList[0] + numList[1] * 10 + numList[2] * 100;

		System.out.println(numList[0]);
		System.out.println(numList[1]);
		System.out.println(numList[2]);
		System.out.println(multiple);
	}
}