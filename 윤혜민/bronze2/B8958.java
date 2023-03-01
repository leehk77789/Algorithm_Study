package baekjoon;

import java.util.*;

public class B8958 {
	// OX퀴즈
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		
		int testCase = sc.nextInt();
		
		for(int tc = 0; tc < testCase; tc++) {
			// 스트링으로 받은 다음 캐릭터 배열로 변환하자
			String quiz = sc.next();
			char[] answer = quiz.toCharArray();
			// 점수 카운트 초기화
			int cnt = 0;
			// 위의 캐릭터 배열 원소 마다 누적 점수를 입력할 배열을 만들자
			int[] point = new int[answer.length];
			// 0 부터 배열끝까지 O가 입력되었다면 1을 넣자
			// 일단 문제를 맞았다면 1을 넣는다는거다
			for(int idx = 0; idx < answer.length; idx++) {
				if(answer[idx] == 'O') {
					point[idx] = 1;
				}
			}			
			// 이제 직전 원소랑 비교해서 둘 다 0이 아니라면
			// 직전 원소에서 1을 더한 값을 현재 원소에 넣자
			// 직전은 1인데 현재원소가 0이면 현재원소에서는 문제를 틀렸으니 배점이 없고
			// 직전은 0인데 현재가 1이라면 누적을 시킬 수 없다
			// 둘 다 0이면 ㅁ ㅓ 넘어가야지 어째
			for(int idx = 1; idx < answer.length; idx++) {
				if(point[idx - 1] != 0 && point[idx] != 0) {
					point[idx] = point[idx - 1] + 1;
				}
				
			}			
			// 누적합을 구하자!
			for(int idx = 0; idx < point.length; idx++) {
				cnt += point[idx];
			}
			
			System.out.println(cnt);
		}
		
	}
}
