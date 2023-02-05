import java.util.Scanner;

public class B17496 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int I = sc.nextInt();
		int C = sc.nextInt();
		int P = sc.nextInt();
		int total = 0;
		
		while(true) {
			total += C * P;
			N -= I;
			if(N - I <= 0) {
				break;
			}
		}
		System.out.println(total);
		sc.close();
    }
}
