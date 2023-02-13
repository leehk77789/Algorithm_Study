package 백준;

import java.util.Scanner;

public class b2745 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 10진수 초기값
		int dec = 0;
			
		// n진수 입력
		String num = sc.next();
		
		// b진법 b입력
		int b = sc.nextInt();
		
		//입력한 16진수를 각 자릿수로 나눔
		for(int i = 0; i < num.length(); i++) {
			char temp = num.charAt(i);
			
			// 자릿수가 숫자일 시 아스키코드 변환 처리
			if (Character.isDigit(temp) == true){
				dec += ((temp - '0') * (int)Math.pow(b, num.length()-(i+1)));
			} else {
				// 자릿수가 알파벳일시 아스키코드 변환 처리
				dec += ((temp - '7') * (int)Math.pow(b, num.length()-(i+1)));				
			}
		}
		System.out.println(dec);
	}
}