package baekjoon;

import java.util.*;

public class B2745 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String givenNum = sc.next();
		int N = sc.nextInt();
		// String과 숫자를 입력받는다
		int dec = 0;
		// 최종 10진수 값 초기화
		char[] Char = givenNum.toCharArray();
		// 입력받은 String을 char배열로 만들고
		int[] givenList = new int[Char.length];
		// 그 길이만큼 int 배열을 만든다
		
		// 우리는 지금 char값을 갖고 있기 때문에 
		// 계산을 위해 int로 바꿔줘야 하는데
		// 문제는 알파벳들!!! 을 아스키코드값을 이용해 그대로 int 변환 후 뺴준다
		// A는 65, Z는 90이라고 한다
		for (int idx = 0; idx < Char.length; idx++) {
			if(Char[idx] >= 'A' && Char[idx] <= 'Z') {
				givenList[idx] = (int)Char[idx]-55;
			} else {
				// 숫자들은 그대로 int로 바꿔주는 함수를 이용했다
				givenList[idx] = Character.getNumericValue(Char[idx]);
			}
		}
		// 처음 풀 땐 노가다 그 잡채 스위치문을 썼더랬다...
		
//		for (int idx = 0; idx < Char.length; idx++) {
//			switch (Char[idx]) {
//			case 'A':
//				givenList[idx] = 10;
//				break;
//			case 'B':
//				givenList[idx] = 11;
//				break;
//			case 'C':
//				givenList[idx] = 12;
//				break;
//			case 'D':
//				givenList[idx] = 13;
//				break;
//			case 'E':
//				givenList[idx] = 14;
//				break;
//			case 'F':
//				givenList[idx] = 15;
//				break;
//			case 'G':
//				givenList[idx] = 16;
//				break;
//			case 'H':
//				givenList[idx] = 17;
//				break;
//			case 'I':
//				givenList[idx] = 18;
//				break;
//			case 'J':
//				givenList[idx] = 19;
//				break;
//			case 'K':
//				givenList[idx] = 20;
//				break;
//			case 'L':
//				givenList[idx] = 21;
//				break;
//			case 'M':
//				givenList[idx] = 22;
//				break;
//			case 'N':
//				givenList[idx] = 23;
//				break;
//			case 'O':
//				givenList[idx] = 24;
//				break;
//			case 'P':
//				givenList[idx] = 25;
//				break;
//			case 'Q':
//				givenList[idx] = 26;
//				break;
//			case 'R':
//				givenList[idx] = 27;
//				break;
//			case 'S':
//				givenList[idx] = 28;
//				break;
//			case 'T':
//				givenList[idx] = 29;
//				break;
//			case 'U':
//				givenList[idx] = 30;
//				break;
//			case 'V':
//				givenList[idx] = 31;
//				break;
//			case 'W':
//				givenList[idx] = 32;
//				break;
//			case 'X':
//				givenList[idx] = 33;
//				break;
//			case 'Y':
//				givenList[idx] = 34;
//				break;
//			case 'Z':
//				givenList[idx] = 35;
//				break;
//			default:
//				
//				givenList[idx] = Character.getNumericValue(Char[idx]);
//			}
//		}
		// 아무튼 그렇게 만들어진 int 배열로 10진수로 계산하면 끝
		for (int idx = 0; idx < givenList.length; idx++) {
		
			dec += (Math.pow(N, givenList.length - idx - 1) * givenList[idx]);
		}
	
		System.out.println(dec);
	}
}