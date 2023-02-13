package day0213;

import java.util.Scanner;

public class BigNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//testcase 개수 입력
		int testcase = sc.nextInt();
		//배열 선언
		int[] arr;
		
		for(int i = 0; i < testcase; i++) {
			//배열 초기화
			arr = new int[10];
			
			//최대값
			int max = 0;
			for(int j = 0; j < arr.length; j++) {
				//배열 값 입력
				arr[j] = sc.nextInt();
			}
			
			for(int j = 0; j < arr.length; j++) {
				//자리 수 하나마다 최대값인지 비교
				if (arr[j] > max) {
					max = arr[j];
				}
			}
			System.out.println("#" + (i+1) + " " + max);
		}
		
	}
}
