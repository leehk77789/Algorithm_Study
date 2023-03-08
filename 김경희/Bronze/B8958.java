package Bronze;

import java.util.Scanner;

public class ox퀴즈8958 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int testCase = sc.nextInt();
		for (int tc = 1; tc <= testCase; tc++) {
			char[] ox = sc.next().toCharArray();
			int count = 0; // 'O'갯수 세어줄 변수
			int sum = 0; // O이 1,2,3,,, 하고 커지니까 가우스의 덧셈으로 매번 더해줄 것임.
			for (int i = 0; i < ox.length; i++) {
				if (ox[i] == 'O') { // O세는 중
					count++;
					// 줄줄이 O 중 마지막인 경우( 뒤에 X가 오거나, 마지막 인덱스였거나)
					if((i == ox.length - 1 || (ox[i + 1] == 'X' && i<ox.length-1)))
					sum += gauss(count);
				} else { // X를 만났다??
					count = 0; // 다시 세어줄 거니까 count초기화
				}				
			}
			System.out.println(sum);
		}
	}

	public static int gauss(int n) {
		int g = n * (n + 1) / 2;
		return g;
	}
}
