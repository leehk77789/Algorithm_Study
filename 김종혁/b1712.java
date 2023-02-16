import java.util.Scanner;

public class b1712 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		for(int i = 0; i < Integer.MAX_VALUE ; i++) {
			if(B >= C) {
				System.out.println("-1");
				break;
			}else{
				System.out.println((A/(C-B))+1);
				break;
			}
		}
	}
}
