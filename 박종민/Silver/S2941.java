import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 특수 알파벳 배열
		String[] special = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };
		
		String text = sc.next();
		// 특수 문자 있으며면 replace로 바꿔준다
		for (int idx = 0; idx < special.length; idx++) {
			text = text.replaceAll(special[idx], "a");

		}
		int result = text.length();
		// 출력
		System.out.print(result);
		sc.close();
	}
}