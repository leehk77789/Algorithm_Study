import java.util.Scanner;

public class B2446 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		for(int line = 0; line < a; line++) {
			for(int empty = 0; empty < line; empty++) {
				System.out.print(" ");
			}
			for(int star = 0; star < 2*(a - line)-1; star++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int line = 1; line < a; line++) {
			for(int empty = 0; empty < a - line -1; empty++) {
				System.out.print(" ");
			}
			for(int star = 0; star < 2 * line+1; star++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		sc.close();
    }
}
