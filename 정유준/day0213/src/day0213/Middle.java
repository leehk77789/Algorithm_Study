package day0213;

import java.util.Arrays;
import java.util.Scanner;

public class Middle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//tastcase 개수 입력
		int tastcase = sc.nextInt();
		
		//자리가 10개인 배열 선언
		int[] arr;
		
		
		for(int i = 0; i < tastcase; i++) {
			arr = new int[10];
			//총 합 계산
			double sum = 0;
			//arr값 입력
			for(int j = 0; j < arr.length; j++) {
				arr[j] = sc.nextInt();
			}
			//크기 순서대로 정렬
			Arrays.sort(arr);
			//최소, 최대 제외 총 합 계산
			for(int j = 1; j < arr.length-1; j++) {
				sum += arr[j];
			}
			//총합 에서 최대값, 최소값 뺀 개수인 8나누기
			System.out.println("#" + (i+1) + " " + Math.round(sum/8));
		}
		sc.close();
	}
}
