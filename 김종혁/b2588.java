import java.util.Scanner;

public class b2588 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 입력값 2개
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum = 0;
		
		// b의 자릿수 길이
		int lengthOfB = String.valueOf(b).length();
		
		// 반복문 통해 b의 각 자릿수 곱하기 a
		for(int i = 0; i < lengthOfB; i++) {
			int pow = (int) Math.pow(10, i);
			int c = (a * (b % 10));
			int d = (a * (b % 10)) * pow;
			System.out.println(c);
			b /= 10;
			sum += d;
		}
		System.out.println(sum);
	}
}
