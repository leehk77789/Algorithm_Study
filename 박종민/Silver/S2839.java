import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
    		// 스캐너로 입력받기
		Scanner in = new Scanner(System.in);
        
		int N = in.nextInt();
		
		// 상황에 맞춰 출력
		if (N == 4 || N == 7) { // 이 두가지는 만들 수 없다
			System.out.println(-1);
		}
		else if (N % 5 == 0) { // 만약 5로 나눠지면 몫만큼 봉지수를 구함
			System.out.println(N / 5);
		}
		else if (N % 5 == 1 || N % 5 == 3) { // 나머지가 1,3이면 그 봉지에다 3kg봉지로 채워줌
			System.out.println((N / 5) + 1);
		}
		else if (N % 5 == 2 || N % 5 == 4) { // 나머지가 2,4이면 2개를 더해야함
			System.out.println((N / 5) + 2);
		}
	}
}