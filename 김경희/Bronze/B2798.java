package bronze2;

import java.util.Scanner;

public class 블랙잭2798 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cardAll = sc.nextInt();
		int maxSum = sc.nextInt();
		
		int[] cards = new int[cardAll];
		
		for(int i = 0 ; i < cardAll ; i++) {
			cards[i] = sc.nextInt();
		}
			int max = 0;
		for(int i = 0 ; i < cardAll ; i++) {	// 순열활용
			for(int j = 0 ; j < cardAll ; j++) {
				if(i!=j) {
					for(int k = 0 ; k < cardAll ; k++) {
						if(i!=k && j!=k) {
							int cardSum = cards[i] + cards[j] + cards[k];	//세 장 뽑아서 더해보고
							if(cardSum <= maxSum) {		// 넘으면 안 되는 수 안 넘으면
								max = Math.max(max, cardSum);	// max 계산해보고
							}else {		// 넘어버리면
								continue;	// 계속 구해보자.
							}
							
						}
					}
				}
			}
		}
		System.out.println(max);
		
	
		
	}

}
