import java.util.Scanner;

public class BOJ_1436_영화감독숌_정유준 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count = 0;
		for (int i = 1; i <= Integer.MAX_VALUE; i++) {
			if (Integer.toString(i).contains("666")) {
				count++;
			}
			if (count == N) {
				System.out.println(i);
				break;
			}
		}
	}
}
