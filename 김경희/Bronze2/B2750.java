import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B2750 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 수의 개수
		int n = sc.nextInt();
		// 크기가 주어진 개수만한 배열 생성 
		int[] nums = new int[n];
		
		// 입력된 정수를 배열에 넣어줌
		for (int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
		}
		// 배열 값들을 순서대로 정렬(w/o sort())
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				int tmp = 0;
				if (nums[i] > nums[j]) {
					tmp = nums[i];
					nums[i] = nums[j];
					nums[j] = tmp;	
				}

			}
		}
		
		
		// 개행하여 출력
		for(int i = 0 ; i < n; i++) {
		System.out.println(nums[i]);
		}
		
	}
}
