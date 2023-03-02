import java.util.Scanner;

public class _2839 {

		// 설탕배달
		// 정확히 N킬로그램 배달
		// 봉지는 3킬로짜리랑 5킬로짜리
		// 최대한 적은 봉지

		// 정확히 N킬로가 안되면 -1


		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int N = sc.nextInt();

			int result=0;
			int min = 1000000;

			for (int i = 0; i<N/3+1; i++) {
				for (int j = 0; j<N/3+1; j++) {
					if (N - 3 * i - 5 * j == 0) {
						result = i + j;
						if (min > result) {
							min = result;
						}
					}
				}
			}
			
			if(result==0)
				min=-1;

			System.out.println(min);
		}
	}
