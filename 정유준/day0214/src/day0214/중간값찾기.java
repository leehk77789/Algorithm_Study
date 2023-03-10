package day0214;

import java.util.Arrays;
import java.util.Scanner;

public class 중간값찾기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		
		//배열값 입력
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		//대소크기로 정렬
		//sort사용
		//Arrays.sort(arr);
		
		//버블 정렬
		for(int i = arr.length-1; i >= 0; i--) {
			for(int j = 0; i < i; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		System.out.println(arr[N/2]);
		
		sc.close();
	}
}
