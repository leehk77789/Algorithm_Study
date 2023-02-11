package backJoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B1550 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String testLine = sc.next();
		int finalNumber = 0;
		for (int i = 0; i < testLine.length(); i++) {
			int n = (testLine.charAt(i)-'0');
			if ((testLine.charAt(i) > 0) && (10 > n)) {
				
				finalNumber += n * Math.pow(16, testLine.length()-1-i);
			} else if (testLine.charAt(i) == 'A') {
				finalNumber += 10 * Math.pow(16, testLine.length()-1-i);
			} else if (testLine.charAt(i) == 'B') {
				finalNumber += 11 * Math.pow(16, testLine.length()-1-i);
			} else if (testLine.charAt(i) == 'C') {
				finalNumber += 12 * Math.pow(16, testLine.length()-1-i);
			} else if (testLine.charAt(i) == 'D') {
				finalNumber += 13 * Math.pow(16, testLine.length()-1-i);
			} else if (testLine.charAt(i) == 'E') {
				finalNumber += 14 * Math.pow(16, testLine.length()-1-i);
			} else if (testLine.charAt(i) == 'F') {
				finalNumber += 15 * Math.pow(16, testLine.length()-1-i);
			}

		}
		System.out.println(finalNumber);
	}
}

//Scanner sc=new Scanner(System.in);
//String a=sc.next();
//System.out.println(Integer.parseInt(a,16));