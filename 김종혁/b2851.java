package baekjoon;

import java.util.Scanner;

public class b2851 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int min = Integer.MAX_VALUE;
		int difference = 0;
		int scores = 0;
		int ans = 0;
		
		// 점수 누적
		for(int i = 0; i < 10; i++) {
			int mushrooms = sc.nextInt();
			scores += mushrooms;
			
			// 점수 절대값
			difference = Math.abs(100 - scores);
			
			// 어차피 누적되면 차이가 적어지다가 커지기 시작하는 순간 멈추면 됨
			if(difference <= min) {
				min = difference;
				ans = scores;
			} else {
				break;
			}
		}
		
		System.out.println(ans);
		
		
	}
}
