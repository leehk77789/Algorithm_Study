package baekjoon;

import java.util.Scanner;

public class B8320 {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 int N = sc.nextInt();
		 int cnt = 0;
		 for(int idx = 1; idx <= N ; idx++) {
			 for(int i = 1; i <= Math.sqrt(idx); i++) {
				 if(idx % i == 0) {
					 cnt++;
				 }
			 }		 
		 }
		 System.out.println(cnt);
	}
}