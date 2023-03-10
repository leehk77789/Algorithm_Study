package day0214;

import java.util.Scanner;

public class 최빈수구하기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//테스트케이스 개수 입력받기
		int testCase = sc.nextInt();
		for(int i = 0; i < testCase; i++) {
			int testCaseNum = sc.nextInt();
			int maxIdx = 0;
			//최대값
			int max = 0;
			
			int[] arr = new int[1000];
			//점수 저장용 배열 생성 (0~100 이니깐 101까지 생성해야 100을 담을 수 있다)
			int[] score = new int[101];
			
			//arr 배열에 점수 넣기
			for(int idx = 0; idx < arr.length; idx++) {
				arr[idx] = sc.nextInt();
			}
			
			//arr[idx]값에 해당하는 idx를 가진 score배열 값++
			for(int idx = 0; idx < arr.length; idx++) {
				score[arr[idx]]++;
			}
			
			//제일 많은 점수를 출력
			for(int idx = score.length-1; idx >= 0; idx--) {
				if(score[idx] > max) {
					max = score[idx];
					maxIdx = idx;
				}
			}
			
			System.out.println("#" + (i+1) + " " + maxIdx);
			
		}
		sc.close();
	}
}
