import java.util.Scanner;

​

public class 2588 {

	public static void main(String[] args) {

		// Scanner 사용하여 변수 받기

		Scanner sc = new Scanner(System.in);

		int input1 = sc.nextInt();

		int input2 = sc.nextInt();

​

		// 자리수를 대로 나눠 곱할 input2를 각 자리수 마다 배열에 넣어줌 for문 활용

		String newInput2 = Integer.toString(input2); // Integer.toString()을 사용하여 정수를 문자열로 바꿔줌

​

		int[] arrNum2 = new int[newInput2.length()]; // 문자열을 집어넣을 배열을 만듬

​

		for (int i = 0; i < newInput2.length(); i++) { // for문으로 각 자리 숫자를 배열에 넣음

			arrNum2[i] = newInput2.charAt(i) - '0'; // .charAt(i)-'0'사용, 아스키코드값 48빼줌

		}

​

		// input1과 input2의 각 자리수를 곱해서 출력 

		System.out.println(input1*arrNum2[2]);

		System.out.println(input1*arrNum2[1]);

		System.out.println(input1*arrNum2[0]);

		// input1과 input2의 곱 출력

		System.out.println(input1*input2);


	}

}