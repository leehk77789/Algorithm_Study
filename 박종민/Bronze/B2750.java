package backJoon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Bronze2750 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int howManyNumber = sc.nextInt();
		
		int[] numberArr = new int[howManyNumber];
		
		for (int i=0; i<howManyNumber; i++) {
			numberArr[i] = sc.nextInt();
		}
		
		for(int i = 0; i < howManyNumber - 1; i++) {
			for(int j = i + 1; j < howManyNumber; j++) {
				if(numberArr[i] > numberArr[j]) {
					int temp = numberArr[j];
					numberArr[j] = numberArr[i];
					numberArr[i] = temp;
				}
			}
		}
		
		for(int i : numberArr) {
			System.out.println(i);
		}
	}
}
