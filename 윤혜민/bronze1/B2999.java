package baekjoon;

import java.util.Scanner;

public class B2999 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        String message = sc.next();
        char[] sanggeun = message.toCharArray();

        int N = (int) Math.sqrt(sanggeun.length);
        int num = 1;
        for (int i = N; i > 0; i--) {
            if (sanggeun.length % i == 0) {
                num = i;
                break;
            }
        }
        for(int i = 0; i < num; i++) {
        	for(int j = 0; j < sanggeun.length/num; j++) {
        		System.out.print(sanggeun[i + num * j]);
        	}
        }
	}
}
