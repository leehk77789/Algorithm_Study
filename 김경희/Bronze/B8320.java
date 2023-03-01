import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(); // 정사각형의 개수 = 최종 직사각형의 넓이

		// n의 약수를 구한다.
		// 예를들어, 12의 약수를 구하면 3*4 = 4*3 = 12이면 같은 짝으로 본다.
		// 그래서 가로변만 구한다고 생각하고 약수를 반만 뽑으면 됨.
		int widthCount = 0;
		for (int m = 1; m <= n; m++) {	// 넓이 종류.
			for (int i = 1; i <= Math.sqrt(m); i++) {	// 각 넓이별로 제곱근 이하의 약수를 구한다.
				if (m % i == 0)
					widthCount++;
			}
		}	
		System.out.println(widthCount++);
    }
}