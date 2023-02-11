package backJoon;

import java.util.Scanner;

public class Bronze1152 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // 입력 받기 위한 스캐너
		int cnt = 0; // 공백을 카운트 하기 위한 변수
		
		String sentence = sc.nextLine();// 한 줄 다 받기

		// for 문 이용해서 한 글자씩 스페이스와 비교, 이때 "" 쓰면 String이 되서 ''써야함
		for (int i=1; i<sentence.length()-1;i++) { // 맨 처음과 끝이 스페이스 올 수 있어서 변수 조정
			if (sentence.charAt(i) == ' ') {
				cnt++; // 스페이스 마다 카운트 올려줌
			}
		}
		System.out.println(cnt+1); // 출력
	}
}