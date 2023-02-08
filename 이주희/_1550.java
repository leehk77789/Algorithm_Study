package feb;

import java.util.Arrays;
import java.util.Scanner;

public class _1550 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num = sc.next();
		char[] arr = num.toCharArray();
		int [] arr2 =  new int[num.length()];
		int sum = 0;
		
	

		for (int i = arr.length - 1; i >= 0; i--) {
			switch (arr[i]) {
			case 'A'  :
				arr2[i] = 10;
				break;
			case 'B':
				arr2[i] = 11;
				break;
			case 'C':
				arr2[i] = 12;
				break;
			case 'D':
				arr2[i] = 13;
				break;
			case 'E':
				arr2[i] = 14;
				break;
			case 'F':
				arr2[i] = 15;
				break;
			
			default : arr2[i]=arr[i]-48;
			break;
			
			}
//	System.out.println(arr2[i]);
			sum+=arr2[i]*Math.pow(16,arr.length-1-i);
			//System.out.println(sum);
			
		}		
		System.out.println(sum);
	}

}
