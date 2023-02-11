package baekjoon;

import java.util.*;

public class B2750 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Set<Integer> number = new TreeSet<>();
		// 처음 풀 때 문제를 잘못 이해했었음.....
		// 돌고 돌아 풀었지만 답은 나왔으니 오케이 입니다...
		int N = sc.nextInt();
		for(int i = 0; i < N; i++) {
			number.add(sc.nextInt());
		}
			
		Iterator<Integer> e = number.iterator(); 
		while(e.hasNext()) { 
			System.out.println(e.next());
		}		
	}
}