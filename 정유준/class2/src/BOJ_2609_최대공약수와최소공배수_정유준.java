import java.util.Scanner;

public class BOJ_2609_최대공약수와최소공배수_정유준 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int min = 0;
		int max = 0;
		for (int i = 1; i <= Math.max(a, b); i++) {
			if (a % i == 0 && b % i == 0) {
				min = i;
			}
		}
		for (int i = a * b; i >= 1; i--) {
			if (i % a == 0 && i % b == 0) {
				max = i;
			}
		}
		System.out.println(min);
		System.out.println(max);
	}
}
