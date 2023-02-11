package feb;

import java.util.Scanner;

public class _1297 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int D = sc.nextInt();
		int H = sc.nextInt();
		int W = sc.nextInt();
		
		double d=Math.sqrt(Math.pow(H, 2)+Math.pow(W, 2));
	
	
		int A =(int)(H*(D/d));
		int B = (int)(W*(D/d));
		
		System.out.println(A+" "+B);
	}
}
