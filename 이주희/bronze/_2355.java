import java.util.Scanner;

public class _2355 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long A = sc.nextLong();
		long B = sc.nextLong();
		long min = 0;
		long max = 0;

		if (A < B) {
			min = A;
			max = B;
		} else{
			min = B;
			max = A;
		}

		long result = (A+B) * (max-min+1) / 2;
        System.out.println(result);
	}
}
