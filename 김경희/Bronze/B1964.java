package bronze2;

import java.util.Scanner;

public class B1964 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int firstDots = sc.nextInt();
		
		long finalDots = 5;
		for(int i = 2 ; i <= firstDots ; i++) {
			finalDots += (i*3 +1) ;
		}
		
		System.out.println(finalDots);
		
				
	}
}
