package baekjoon;

import java.util.Scanner;

public class b3052 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		int[] rest = new int[42];
		// 나머지를 카운팅 배열에 넣기
		for(int i = 0; i < 10; i++) {
			int num = sc.nextInt();
			
			int left = num % 42;
			
			rest[left]++;
		}
		
		// 카운트 된 수가 몇 개가 있는지 세기
		for(int i = 0; i < 42; i++) {
			if(rest[i] != 0) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
