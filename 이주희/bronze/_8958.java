import java.util.Scanner;

public class _8958 {

		// ox퀴즈
		// x가 나오면 점수 1로 리셋

		// 점수 받는 메소드
		static void score(String ox) {
			char[] arr = ox.toCharArray();
			int cnt = 0;
			int result = 0;
			for (int i = 0; i < ox.length(); i++) {
				if (arr[i] == 'O') {
					cnt++;
					result+=cnt;
				} else {
				cnt = 0;
				}
			}
			System.out.println(result);
		}

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			// ����
			int T = sc.nextInt();
			for (int tc = 1; tc <= T; tc++) {
				String str = sc.next();
				score(str);
			}
		}
	}

