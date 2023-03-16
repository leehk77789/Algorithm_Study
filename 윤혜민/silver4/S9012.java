package baekjoon;

import java.util.Scanner;

public class S9012 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int tc = sc.nextInt();
		for(int t = 0; t < tc; t++) {
			String parenthesis = sc.next();
			char[] string = parenthesis.toCharArray();
			
			boolean yon = true;
			int cnt = 0;
		
			for(int idx = 0; idx < string.length; idx++){
				if(string[idx] == '(') {
					cnt++;
				} else {
					cnt--;
				}
				
				if(cnt < 0 || cnt > string.length/2) {
					yon = false;
					break;
				}
			}
			if(cnt == 0) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}

	}
}
