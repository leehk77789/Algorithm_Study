import java.util.Scanner;

public class B2525 {

	public static void main(String[] args) {
		//14 30
		//20
		//17 40
		//80
		//23 48
		//25
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int time = B+C;
		
		if(A + (time/60) >= 24) {
			A += (time / 60);
			A -= 24;
			time %= 60;
		} else {
			A += (time / 60);
			time %= 60; 
		}
		System.out.println(A + " " + time);
		
		sc.close();
	}
}
