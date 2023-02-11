package feb;

import java.util.Scanner;

public class _2292 {

	public static void main(String[] args) {
//
//		1
//		2-7
//		8-19 1 6 12
		Scanner sc = new Scanner(System.in);

		int room = sc.nextInt();
		int num = 1;
		int count = 1;
		

		for (int i = 1; true; i++) {
			num += 6 * i;
			if (room > num) {
				count++;
			}
			if(room==1) {
				System.out.println("1");
				break;
			}
			if (room <= num) {
				System.out.println(++count);
				break;
			}
		}

	}
}