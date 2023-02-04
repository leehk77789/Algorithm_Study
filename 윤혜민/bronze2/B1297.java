package baekjoon;

import java.util.Scanner;

public class B1297 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double D = sc.nextInt();
		// 다음에 나올 나눗셈 연산에서
		// 0으로 떨어져버릴 수 있으므로
		// D는 실수인 double로 받아옵니다
		int H = sc.nextInt();
		int W = sc.nextInt();
		
		// 피타고라스...를 역으로 계산하고
		// 제곱근을 구해줍니다
		double n = Math.sqrt(D*D/(H*H+W*W));

		// 출력을 정수로 받아야 하므로 
		// 형변환을 위해 변수를 추가합니다
		int A = (int)(H*n);
		int B = (int)(W*n);
		System.out.println(A+" "+B);
	}
}
