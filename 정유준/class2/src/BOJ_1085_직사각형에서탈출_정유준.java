
import java.util.Scanner;

public class BOJ_1085_직사각형에서탈출_정유준 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nowCol = sc.nextInt();
		int nowRow = sc.nextInt();
		int col = sc.nextInt();
		int row = sc.nextInt();

		int x_min = Math.min(nowCol, col - nowCol);
		int y_min = Math.min(nowRow, row - nowRow);

		System.out.println(Math.min(x_min, y_min));

	}
}
