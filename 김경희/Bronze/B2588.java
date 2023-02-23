package bronze3;

import java.util.Scanner;

public class B2588 {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	// a, b는 입력받은 세자리 자연수 두 개
	int a = sc.nextInt();
	int b = sc.nextInt();
	
	// b에서 각 자리 수를 분리해보자
	// 백의 자리 수
	int hunDigit = b/100;
	// 십의 자리 수
	int tenDigit = (b-(hunDigit*100))/10;
	// 일의 자리 수
	int oneDigit = b%10;
	
	// 처음으로 입력받은 a * 각자릿수
	int first = a*oneDigit; //(3)
	int second = a*tenDigit; //(4)
	int third = a*hunDigit; //(5)
	int sum = first + (second*10) + (third*100);
	
		
	
	System.out.println(first);
	System.out.println(second);
	System.out.println(third);
	System.out.println(sum);
	

	}
}
