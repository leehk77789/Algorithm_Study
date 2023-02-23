package baekjoon;

import java.util.Scanner;

public class B2810 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		String seats = sc.next();
		
		char[] coke = seats.toCharArray();
		
		int holder = 0;
		
		for(int idx = 0; idx < coke.length; idx++) {
			if(coke[idx] == 'S') {
				holder++;
			} else if(coke[idx] == 'L'){
				holder++;
				idx++;
			}
			if(idx == coke.length - 1) {
				holder++;
			}
		}
		if(holder > num) {
			System.out.println(num);
		} else {
			System.out.println(holder);
		}
	}

}
