package 백준;

import java.util.Scanner;

public class b2355 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long A = sc.nextLong();
		long B = sc.nextLong();
		long sum = 0;

		if (B >= A) {
			if (((B - A) + 1) % 2 == 0) {
				sum = (A + B) * (((B - A) + 1) / 2);
				System.out.println(sum);
			} else if(((A - B) + 1) % 2 != 0){
				sum = ((A + B) * ((((B - A) + 1) / 2)/1) + ((A + B) / 2));
				System.out.println(sum);
			}
		} else {
			if (((A - B) + 1) % 2 == 0) {
				sum = (A + B) * (((A - B) + 1) / 2);
				System.out.println(sum);
			} else if (((A - B) + 1) % 2 != 0){
				sum = ((A + B) * ((((A - B) + 1) / 2)/1) + ((A + B) / 2));
				System.out.println(sum);
			}
		}
	}
}
