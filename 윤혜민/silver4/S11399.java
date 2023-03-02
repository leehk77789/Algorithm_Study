package baekjoon;

import java.util.*;

public class S11399 {
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] atm = new int[N];
		
		for(int i = 0 ; i < N; i++) {
			atm[i] = sc.nextInt();
		}
		
		Arrays.sort(atm);
		
		int sum = 0;
		for(int i = 0; i < N; i++) {
			sum += atm[i]*(N-i);
		}
		System.out.println(sum);		
	}
}
