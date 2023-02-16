package 백준;

import java.util.Scanner;

public class b2163 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int sum = (n-1) + (m-1)*n;
		System.out.println(sum);
	}
}