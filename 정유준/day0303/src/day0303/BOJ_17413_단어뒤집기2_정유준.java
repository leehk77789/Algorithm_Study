package day0303;

import java.util.Scanner;
import java.util.Stack;

public class BOJ_17413_단어뒤집기2_정유준 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Character> st = new Stack<>();
		String s = sc.nextLine();
		char[] reverseArr = new char[s.length()];
		for (int i = 0; i < reverseArr.length; i++) {
			st.push(s.charAt(i));
		}
		String reverseString = "";
		for (int i = 0; i < reverseArr.length; i++) {
			if (reverseArr[i] == '<') {
				while (true) {
					reverseString += reverseArr[i];
					if (reverseArr[i] == '>') {
						break;
					}
					i++;
				}
			}
			if (reverseArr[i] != '<' && reverseArr[i] != '>') {
				String reversePoint = "";
				while (true) {
					if (reverseArr[i] != '<' && reverseArr[i] != '>') {
						reversePoint += reverseArr[i];
					}
					if (i == reverseArr.length - 1) {
						break;
					}
					if (reverseArr[i] == '<') {
						i--;
						break;
					}
					i++;
				}
				for (int j = reversePoint.length() - 1; j >= 0; j--) {
					reverseString += reversePoint.charAt(j);
				}
			}
		}
		System.out.println(reverseString);
	}
}
