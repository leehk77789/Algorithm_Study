import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		int P = sc.nextInt();
		int bcom = 0;
		
		int acom = A * P;
		
		if(P >= C) {
			bcom = B + (D * (P-C));
		} else {
			bcom = B;
		}
		
		if(acom < bcom) {
			System.out.println(acom);
		} else {
			System.out.println(bcom);
		}
		sc.close();
    }
}
