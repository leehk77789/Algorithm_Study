package silver;

import java.util.Arrays;
import java.util.Scanner;

public class ATM11399 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int ppl = sc.nextInt();
		int[] timePerPpl = new int[ppl];
		
		for(int i = 0 ; i < ppl ; i++) {
			timePerPpl[i] = sc.nextInt();
		}
		
		// 앞에 짧게 걸리는 사람이 서야 짧게 기다린다. 따라서 걸리는 시간이 짧은 것부터 정렬
		Arrays.sort(timePerPpl);	// 받은 배열 시간 짧은 순대로 정리
		
		// 앞시간까지 더한 값으로 다시 배열 만들기
		int[] waitAndDraw = totalPerPpl(timePerPpl);	
		
		int total = 0;	// 그래서 다 더하면?
		for(int i = 0 ; i < ppl ; i++) {
			total += waitAndDraw[i];		
		}
		
		System.out.println(total);
		
	}
	
	// 정렬한 배열에서 처음부터 자기자신까지 더한 값을 다시 배열로 만들어줄 메서드
	private static int[] totalPerPpl(int[] arr) {	
		int[] mePlusFormer = new int[arr.length];
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = 0 ; j <= i ; j++) {
				mePlusFormer[i] += arr[j];
			}				
		}
		return mePlusFormer;
	}

}
