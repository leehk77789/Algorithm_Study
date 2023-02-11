package 백준;

import java.util.Scanner;

public class b1550 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 10진수 초기값
		int dec = 0;

		// 16진수 입력
		String hex = sc.next();
		
		//입력한 16진수를 각 자릿수로 나눔
		for(int i = 0; i < hex.length(); i++) {
			char temp = hex.charAt(i);
			// 자릿수가A 일시, 10으로 대입
			if (temp == 'A') {
				temp = 10;
				// B일시 11으로 대입
			} else if (temp == 'B') {
				temp = 11;
				// C일시 12로 대입
			} else if (temp == 'C') {
				temp = 12;
				// D일시 13으로 대입
			} else if (temp == 'D') {
				temp = 13;
				// E일시 14로 대입
			} else if (temp == 'E') {
				temp = 14;
				// F일시 15로 대입
			} else if (temp == 'F') {
				temp = 15;
				// 숫자일시 그대로 대입
			} else {
				temp = hex.charAt(i);
			}
			// 자릿수가 숫자일 시 아스키코드 변환 처리
			if (temp == hex.charAt(i)) {
				dec += ((temp - '0') * (int)Math.pow(16, hex.length()-(i+1)));				
			} else {
				// 자릿수가 알파벳일시 아스키코드 변환 처리x
				dec += ((temp) * (int)Math.pow(16, hex.length()-(i+1)));				
			}
		}
		System.out.println(dec);
	}
}

// 16진수 -> 10진수 변환 메서드
//import java.util.Scanner;
//public class Main {
//
//    public static void main(String[] args) {
//		  Scanner sc = new Scanner(System.in);
//
//        String hex = sc.next();
//
//        int decimal = Integer.decode(hex);
//        System.out.println(decimal);
//    }
//}