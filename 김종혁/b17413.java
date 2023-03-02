package baekjoon;

import java.util.Scanner;
import java.util.Stack;

public class b17413 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Stack<Character> stack = new Stack<>();

		String str = sc.nextLine();

		StringBuilder sb = new StringBuilder();

		int i = 0;

		while (i < str.length()) {
			// <이 아니면 다 스택에 넣고 꽉차거나 <이 나오거나, 공백이 나올 때까지 스택에 넣기
			if (str.charAt(i) != '<') {
				while (i < str.length()) {
				stack.push(str.charAt(i));
				i++;
				if (i == str.length() || str.charAt(i) == '<' || str.charAt(i) == ' ')
					break;
				}
				// 다 나오면 빼기
				while (!stack.isEmpty()) {
					sb.append(stack.pop());
				}
				// 뺀 뒤 이후 공백이 있으면 바로 추가
				if(i < str.length() && str.charAt(i) == ' ') {
					sb.append(str.charAt(i));
					i++;
				}
				// <일 시 >이 나올때까지 그냥 추가
			} else if (str.charAt(i) == '<') {
				while (i < str.length()) {
					if (str.charAt(i) == '>') {
						sb.append(str.charAt(i));
						i++;
						break;
					}
					sb.append(str.charAt(i));
					i++;
				}
			}
		}
		System.out.println(sb);
	}
}
