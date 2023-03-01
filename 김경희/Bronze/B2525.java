package bronze3;

import java.util.Scanner;

public class B2525 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int givenHr = sc.nextInt();
		int givenMin = sc.nextInt();
		int cookTime = sc.nextInt();
		
		
		
		// 주어진 시각의 분단위와 걸리는 시간(분)을 더한 값에서 시간과 분을 분리
		int a = (givenMin + cookTime)/60 ; //시간
		int minHand = (givenMin + cookTime)%60;  //분
		// 주어진 시각의 시는 아직 안 더했다. 24시가 넘어가면 0부터 시작하게 만들어보자.
		int hourHand = (givenHr + a)%24;
		
		//출력
		System.out.println(hourHand + " " + minHand);
				
	}
}
