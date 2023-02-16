package baekjoon;

import java.util.Scanner;

public class b2798 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total = 0;
		int max = 0;
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] cards = new int[N];
		
		for(int i = 0; i < N; i++) {
			int cardNum = sc.nextInt();
			cards[i] = cardNum;
		}
		
		for(int a = 0; a < N - 2; a++) {
			for(int b = 1 + a; b < N - 1; b++) {
				for (int c = 1 + b; c < N; c++) {
					total = cards[a] + cards[b] + cards[c];
					if(total <= M) {	
						if(total > max) {
							max = total;
						}
					} 
				}
			}
		}
		System.out.println(max);
	}
}
