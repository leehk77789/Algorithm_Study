import java.util.Scanner;

public class B2442 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for(int i = 0; i < a; i++) {
			for(int j = 1; j < a-i; j++) {
				System.out.print(" ");
			}
			for(int k = 1; k < 2*(i+1); k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
    }
}
