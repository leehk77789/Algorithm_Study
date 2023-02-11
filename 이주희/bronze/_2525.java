package feb;

import java.util.Scanner;

public class _2525 {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
	    int C = sc.nextInt();
	    
	    int min =A*60+B+C;
	    
	    if(min<1440) {
	    	A=min/60;
	    	B=min%60;
	    }
	    if(min>=1440) {
	    	A=min/60-24;
	    	B=min%60;
	    }
	    
	    System.out.println(A+" "+B);

	}
}

	    