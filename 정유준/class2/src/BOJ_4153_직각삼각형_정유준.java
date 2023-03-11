package class2;

import java.util.Scanner;

public class BOJ_4153_직각삼각형_정유준 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();

			if(a == 0 && b == 0 && c == 0) {
				break;
			}
				
			if ((int)Math.pow(a, 2) + (int)Math.pow(b, 2) == (int)Math.pow(c, 2)) {
				System.out.println("right");
			} else if((int)Math.pow(a, 2) + (int)Math.pow(c, 2) == (int)Math.pow(b, 2)) { 
				System.out.println("right");
			} else if((int)Math.pow(c, 2) + (int)Math.pow(b, 2) == (int)Math.pow(a, 2)) {
				System.out.println("right");
			} else {
				System.out.println("wrong");
			}
			
		}
	}
}
