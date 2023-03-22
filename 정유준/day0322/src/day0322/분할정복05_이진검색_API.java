package day0322;

import java.util.Arrays;

public class 분할정복05_이진검색_API {
	static int[] arr;
	static int key;

	public static void main(String[] args) {
		// 정렬된 상태의 배열
		arr = new int[] { 2, 4, 6, 7, 8, 9, 17 };
		key = 6;

		// 없는 key값을 찾으면 음수를 반환
		System.out.println(Arrays.binarySearch(arr, 5));
	}
}
