package baekjoon;

import java.util.Scanner;

public class S2839 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int cnt = 1;
		int result = 0;
		while (cnt < N) {
			// N의 범위 확인하기

			// 1. 일단 범위 안에 들어오는지 확인한다
			// 1-1. 범위 안에 들어온다면 해당 cnt로 if문 진입
			// 범위 안에 들어오지 않는다면 else로 cnt++
			if (N >= 3 * cnt && N <= 5 * cnt) {
				// 2. 범위 안에 들어왔다면 배열안의 숫자와 일치하는지 확인한다
				// 2-2. 배열 안의 숫자와 일치 한다면 그때의 cnt 출력
				// 일치하는 숫자가 배열에 없다면 cnt++해서 if문 다시돌린다.

				// 배열 생성
				int[] numList = new int[cnt + 1];
				// 배열에 각 값 입력
				for (int i = 0; i < numList.length; i++) {
					numList[i] = 3 * cnt + i * 2;
				}
				// 배열을 돌면서 확인한다. 일치하는 값이 존재하나?
				for (int i = 0; i < numList.length; i++) {
					// 존재 한다면
					if (numList[i] == N) {
						// 그때의 cnt를 출력값에 할당한다
						result = cnt;
						// 존재하지 않는다면 다시 바깥의 if문으로 빼낸다.
					}
				}
				if (result == cnt) {
					System.out.println(result);
					// 일치했음을 위의 for문에서 인지하고 값이 할당되었다면
					// 출력 후 while문을 빠져나온다.
					break;
				}
				cnt++;
			} else {
				cnt++;
			}
		}
		if (result == 0) {
			System.out.println(-1);
		}
	}
}
