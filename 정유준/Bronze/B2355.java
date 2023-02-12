import java.util.Scanner;

public class B2355 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
        long B = sc.nextLong();
        long nums = 0;
        long result = 0;
        if (A > B) {
        	nums = A - B + 1;
        } else {
        	nums = B - A + 1;
        }
        if (nums % 2 == 0) {
        	result = (A+B) * (nums / 2);
        } else {
        	result = (A+B) * (nums / 2) + (A+B) / 2;
        }
        
        System.out.println(result);
        
		sc.close();
    }
}


