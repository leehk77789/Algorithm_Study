package baekjoon;

import java.util.*;

public class S1978 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] prime = new int[N];
		for (int i = 0; i < N; i++) {
			prime[i] = sc.nextInt();
		}
		int cnt = 0;

		for (int i = 0; i < N; i++) {
			if ((int) Math.sqrt(prime[i]) == 1 && prime[i] != 1) {
				cnt++;
				continue;
			}
			for(int j = 2; j < prime[i]; j++) {						
				double checkPrime = prime[i];				
				if(checkPrime/j-(int)(checkPrime/j) != 0) {
					if(j == prime[i]-1) {
						cnt++;
						break;
					}
					continue;
				} else {
					break;
				}			
			}

//			for (int j = 2; j <= (int) Math.sqrt(prime[i]); j++) {
//				if (prime[i] % j != 0) {
//					if (j == (int) Math.sqrt(prime[i])) {
//						cnt++;
//						break;
//					}
//					continue;
//				} else {
//					break;
//				}
//			}
		}
		System.out.println(cnt);
	}
}
