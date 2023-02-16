package baekjoon;

import java.util.*;

public class B2163 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 초콜릿 문제는 깜찍하기 그지없다
		
		int N = sc.nextInt();
		int M = sc.nextInt();	
		// 굳이굳이 주석으로 풀이하자면
		// N*M 의 초콜릿을 자를 때
		// 먼저 (N-1)번 가로로 잘라버려보자
		// 그러면 조각이 N개가 생기는데
		// 이 조각들을 또 M-1번 잘라주면 된다
		
		// (N - 1) + N * (M - 1) 
		//	= N - 1 + N * M - N 
		//	= N * M - 1
		
		// 라는 풀이가 나오겠지만 난 걍 초콜릿 몇번 잘라보고 어 곱한거에다 1빼면 끝이네 ㅋ 
		// 하고 걍 제출했더니 맞았다
		System.out.println(N*M-1);
	}
}