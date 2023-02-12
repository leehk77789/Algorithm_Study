package bronze;

import java.util.Scanner;

public class B1712 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 
		// 계수 받기
		int earlyPrice = sc.nextInt();	
		int priceForProduct = sc.nextInt();	
		int productPrice = sc.nextInt(); 	
	    
		
		if (priceForProduct >= productPrice ) { // 만약 판매금액이 생산금액보다 작으면 
			System.out.println("-1"); // -1 출력
		} 
		else {// while문으로 cnt를 카운트 해도 되지만 바로 몫
			System.out.println((earlyPrice/(productPrice-priceForProduct))+1);
		}
	}
}