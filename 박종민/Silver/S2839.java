import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
    	// 스캐너 받기
		Scanner in = new Scanner(System.in);
        // 옮겨야 되는 무게 받기
		int N = in.nextInt();
		
		// 만약 4,7 이면 안되므로 -1출력
		if (N == 4 || N == 7) {
			System.out.println(-1);
		}
		else if (N % 5 == 0) { // 만약 나눠서 5이면
			System.out.println(N / 5); // 5로 나눈 것으로 출력
		}
		else if (N % 5 == 1 || N % 5 == 3) { // 만약 나눠서 1이나 3이 남으면
			System.out.println((N / 5) + 1); // 5나눈 것에 1 더하기, 나머지가 1이면 3kg 2개
		}
		else if (N % 5 == 2 || N % 5 == 4) { //만약 나눠서 2나 4가 남으면
			System.out.println((N / 5) + 2); // 5나눈것에 2 더하기, 3kg 4개 혹은, 3kg 2개
		}
	}
}