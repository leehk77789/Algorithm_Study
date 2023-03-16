package baekjoon;

import java.util.*;

public class S2164 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		Queue<Integer> cards = new LinkedList<>();
		for(int i = 1; i <= N; i++) {
			cards.add(i);
		}
		
		while(cards.size() != 1) {
			cards.poll();
			cards.add(cards.poll());
		}
		
		System.out.println(cards.poll());		
	}
}
