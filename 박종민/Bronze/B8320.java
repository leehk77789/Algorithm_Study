import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// 정사각형 숫자 받기
		int num = sc.nextInt();
		int cnt = 0; // 개수를 셀 카운트 받기
		for (int row = 1; row <= num; row++) {// 세로로 내려가면서
			for (int col = 1; col <= num / row; col++) { // col<=num/row 이부분이 중요한데, 전체에서 row로 나눈 부분이 col보다 같거나 작을 때 까지
				if (row >= col) { // 이중으로 카운트 방지
					cnt++; // 그런 경우가 있을 때 마다 증가
				}
			}
		}
		// 정답 출력
		System.out.println(cnt);
		sc.close();// 유준이의 좋은 습관을 배우자!
	}
}