package feb;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class _2750 {


	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	
	
	int[] arr = new int[num];
	
	for(int i=0; i<num; i++) {
		arr[i]= sc.nextInt();
	}
	
	Arrays.sort(arr);
	
	for(int i=0; i<arr.length; i++) {
	System.out.println(arr[i]);
	
	long regNo =9807643223232L;
	System.out.println(regNo);
	}
	}
}
