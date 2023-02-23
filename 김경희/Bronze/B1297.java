package bronze2;

import java.util.Scanner;

public class B1297 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 정수 인자이지만 계산에서 int로 처리 시 round 되는 것을 막기 위해 double로 받는다.
		double d = sc.nextInt();
		double h = sc.nextInt();
		double w = sc.nextInt();
		
		// 비율로 주어진 h와 w에 곱해 실제 길이를 구할 계수 a를 설정한다.
		double a = Math.sqrt((d*d) / ((h*h)+(w*w)));
		
		// 실제 길이
		double realHeight = a*h;
		double realWidth = a*w;

		System.out.println((int)realHeight +" "+ (int)realWidth);
	}

}
