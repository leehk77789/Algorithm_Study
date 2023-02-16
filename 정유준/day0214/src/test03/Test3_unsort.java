package test03;

import java.util.Scanner;

public class Test3_unsort {

	public static void main(String[] args) {
		int[] A = {4, 9, 11, 23, 2, 19, 7};
		int idx = sequentialSearch(A, 7);
		System.out.println(idx);
	}
	
	public static int sequentialSearch(int[] A, int key) {
		int n = A.length;
		
		int i = 0;
		while(i < n && A[i] != key) {
			i++;
		}
		
		//while문을 빠져나오면 
		//1. A[i]가 key인경우 (찾음)
		//2. 끝까지 없는 경우
		if(i < n) {
			return i;
		} else {
			return -1;
		}
	}
}
