package bronze2;

import java.util.Scanner;

public class B2292 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rm = sc.nextInt(); // 방번호
		
		int path = 1; //시작지점도 카운트하므로 1로 시작
		int n = 1; // 바퀴가 돌 때마다 늘어가는 방 수를 6*n으로 더해준다.
		
		
		while (path < rm) {
			
			path += 6 * n;
			
			n++;
			
		}
		
		System.out.println(n);
	}
}
