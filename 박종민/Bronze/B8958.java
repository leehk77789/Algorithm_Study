import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 테스트 케이스 입력 받기
		int testCase = sc.nextInt();
		// for문 실행
		for (int test = 1; test <= testCase; test++) {
			// 퀴즈 한 줄 받기
			String quiz = sc.next();
			// 쪼개서 배열에 입력
			char[] quizArr = new char[quiz.length()];
			for (int idx = 0; idx < quiz.length(); idx++) {
				quizArr[idx] = quiz.charAt(idx);
			}
			// 최대값을 찾을 변수와 o를 카운트 할 변수를 만듬
			int max = 0;	
			int cnt = 0;
			// for 문을 돌리자
			for (int idx = 0; idx < quiz.length(); idx++) {
				// 만약 o 이면
				if (quizArr[idx] == 'O') {
					cnt++; // 카운트를 올려줌
					max += cnt; 	// 최종값에도 더해 줌
				} else { // 아니면 cnt 를 0으로
					cnt = 0;
				}

			}
			System.out.println(max);

		}

	}
}