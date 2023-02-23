package bronze2;

import java.util.Scanner;

public class B1152 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();
		String trimmed = str.trim();

		int a = 0;
		for (int i = 0; i < trimmed.length(); i++) {
			if (trimmed.charAt(i) == ' ') {
				a++;

			}
		}

		if (trimmed.length() == 0) {
			System.out.println(0);
		} else if (trimmed.length() != 0) {
			System.out.println(a + 1);
		}
	}
}