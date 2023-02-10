package backJoon;

import java.util.Scanner;

public class B2745 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String lineNumber = sc.next();
		int jinBub = sc.nextInt();
		int chaSu= 1;
		int result = 0;
		
		for (int i = lineNumber.length()-1; i >= 0; i--) {
			char jari = lineNumber.charAt(i);
			
			if('A'<= jari && jari <= 'Z') {
				result += (jari-'A'+10)*chaSu;
			}else {
				result += (jari-'0')*chaSu;
			}
			chaSu *= jinBub;
		}
		
		System.out.println(result);
		
	}
}