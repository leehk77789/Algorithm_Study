import java.util.Scanner;

public class BOJ_2577_숫자의개수_정유준 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int sum = A * B * C;

		int[] count = new int[10];

		String stringSum = Integer.toString(sum);

		for (int i = 0; i < stringSum.length(); i++) {
			count[stringSum.charAt(i) - '0']++;
		}

		for (int i = 0; i < count.length; i++) {
			System.out.println(count[i]);
		}
	}
}
