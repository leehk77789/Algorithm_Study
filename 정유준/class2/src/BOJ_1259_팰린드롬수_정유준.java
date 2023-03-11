package class2;

import java.util.Scanner;

public class BOJ_1259_팰린드롬수_정유준 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String a = sc.next();
			boolean flag = true;
			if (a.equals("0")) {
				break;
			}
			for (int i = 0; i < a.length(); i++) {
				if (a.charAt(i) != a.charAt(a.length() - i - 1)) {
					flag = false;
				}
			}
			if (flag) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		}
	}
}
