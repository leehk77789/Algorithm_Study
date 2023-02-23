package baekjoon;

import java.util.Scanner;

public class b3985 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] cake = new int[sc.nextInt()];
		int max = 0;
		int people = sc.nextInt();
		int maxExpected = 0;
		
		// 가장 많이 먹을 것으로 예상되는 사람 구하기
		for(int i = 1; i <= people; i++){
			int p = sc.nextInt();
			int k = sc.nextInt();
			int expected = k - p;
			for(int j = p - 1; j < k; j++) {
				if(cake[j] == 0)
				cake[j] = i;
			}
			if(expected > max) {
				max = expected;
				maxExpected = i;
			}
		}
		
		// 최빈값과 그것의 인덱스 구하기
		int modeMax = 0;
		int mode = 0;
		int[] index = new int[cake.length];
		
		for(int i = 0; i < cake.length; i++) {
			index[cake[i]]++;
		}
		
		for(int i = 1; i < cake.length; i++) {
			if(index[i] > modeMax) {
				modeMax = index[i];
				mode = i;
			}
		}
		
		System.out.println(maxExpected);
		System.out.println(mode);
		
	}
}
