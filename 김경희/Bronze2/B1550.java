package bronze2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B1550 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String hexa = sc.next();
		char[] ch = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };

		List<Integer> hexaList = new ArrayList<>(); // 16진수 수의 각 자릿 수를 리스트로 넣어주기.

		for (int i = hexa.length() - 1; i >= 0; i--) { // 몇자리 수일지 모르기 때문에 일의 자리부터 거꾸로 넣어준다
			for (int j = 0; j < ch.length; j++) { // 16진수의 배열 중에 맞는 경우를 찾아 해당 인덱스를 숫자로 넣어준다.
				if (hexa.charAt(i) == ch[j]) {
					hexaList.add(j);
				}
			}
		}
		int decimal = 0;
		for (int i = 0; i < hexaList.size(); i++) {
			int mag = (int) Math.pow(16, i);
			decimal += hexaList.get(i) * mag;
		}
		System.out.println(decimal);

	}
}
