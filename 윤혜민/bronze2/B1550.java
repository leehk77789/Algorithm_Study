package baekjoon;

import java.util.*;

public class B1550 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String hex = sc.next();

//		int dec = Integer.valueOf(hex, 16);
		// 16진수를 10진수로 변환하는 함수 
		// 그치만 셀프로 계산해보겠습니다 롸잇나우

		// 최종 10진수 변환값 초기화
		int dec = 0;
		
		// String으로 받아온 16진수 값을 char 배열로 만들어줍니다
		char[] hexChar = hex.toCharArray();
		
		// 계산에 용이하도록 16진수와 원소 수가 같은 int배열을 만들어줍니다
		int[] hexList = new int[hexChar.length];

		// 이제 16진수의 각 자리수 값을 10진수로 변환하여
		// 위에서 만들어준 int배열에 넣어줍니다
		for (int idx = 0; idx < hexChar.length; idx++) {
			switch (hexChar[idx]) {
			case 'A':
				hexList[idx] = 10;
				break;
			case 'B':
				hexList[idx] = 11;
				break;
			case 'C':
				hexList[idx] = 12;
				break;
			case 'D':
				hexList[idx] = 13;
				break;
			case 'E':
				hexList[idx] = 14;
				break;
			case 'F':
				hexList[idx] = 15;
				break;
			default:
				// 위에서 변환한 알파벳을 제외하고는 모두 숫자이므로				
				// default를 이용하여 char를 int로 변환하는 함수를 검색해봤어용
				// 만약 char를 그냥 int로 형변환하면 아스키코드값이 나와버립니다 조심
				hexList[idx] = Character.getNumericValue(hexChar[idx]);
			}
		}
		for (int idx = 0; idx < hexList.length; idx++) {
			// 각 자리수를 대입하여 10진수 변환값에 더해줍니다
			// 16을 거듭제곱하고, 본인의 자릿수를 곱해줍니다
			// ex) 4A2 의 경우 (16^2)*4 + (16^1)*10 + (16^0)*2 = 1186
			dec += (Math.pow(16, hexList.length - idx - 1) * hexList[idx]);
		}
		// 히히 끝
		System.out.println(dec);
	}
}