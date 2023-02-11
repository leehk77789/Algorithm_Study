package baekjoon;

import java.util.*;

public class B2355 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long A = sc.nextLong();
		long B = sc.nextLong();

		long maxNum = 0;
		long minNum = 0;

        // 두 수를 비교하여 큰수와 작은수를 정해줍니다
		if (A > B) {
			maxNum = A;
			minNum = B;
		} else {
			maxNum = B;
			minNum = A;
		}

        // 그냥 바로 가우스계산 해도 되는데 이 if문을 넣은 이유는
        // 음수와 양수가 입력되었을 경우 어차피 상쇄되는 부분이 있기 때문에 
        // 그 음수를 양수로 바꿔버리는 역할을 합니다.
        // ex) -5 9 가 입력되었을 경우, -5 부터 5까지의 합은 어차피 0입니다
        //     따라서 음수인 -5를 양수 6으로 바꿔주어 6 7 8 9 만의 계산을 수행토록 합니다.
		if (minNum < 0 && maxNum > 0) {
			if ((maxNum + minNum) > 0) {
				minNum = minNum * (-1) + 1;
			} else if ((maxNum + minNum) < 0) {
				maxNum = maxNum * (-1) - 1;
			}
		}

        // 가우스 합으로 정수의 총 합을 구해줍니다
        // 단 나열될 정수의 개수가 짝수인지 홀수인지 경우를 구분합니다.
		if ((maxNum - minNum) % 2 == 1) {
			System.out.println((maxNum + minNum) * ((maxNum - minNum + 1) / 2));
		} else if ((maxNum - minNum) % 2 == 0) {
			System.out.println((maxNum - minNum) * (maxNum + minNum) / 2 + (maxNum + minNum) / 2);
		}
	}
}