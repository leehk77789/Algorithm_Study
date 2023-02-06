package feb;

import java.util.Scanner;

public class _1152 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String line = sc.nextLine().trim();
		
		
		String[] arr = line.split(" ");
		
		int count=0;
		
		for(int i=0; i<arr.length;i++ ) {
			if(arr[i].length()!=0)
				count++;
		}
		System.out.println(count);	
	}
}
	    