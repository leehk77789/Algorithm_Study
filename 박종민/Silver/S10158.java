import java.util.Scanner;

public class Main {	
	public static void main(String[] args) {
		// 입력값 받기
		Scanner sc = new Scanner(System.in);
		int W = sc.nextInt();
		int H = sc.nextInt();
		int x =  sc.nextInt();
		int y = sc.nextInt();
		int t = sc.nextInt();
		// x, y 따로 생각해서 입력
		x = move(x, t % (2*W), '+', W); // 횟수마에 있을 x좌표 계산
		y = move(y, t % (2*H), '+', H); // 횟수에 있을 y좌표 계산
		System.out.println(x + " " + y); // 출력
	}

	// 이동하는 메소드
	public static int move(int x, int t, char direction, int size) {
		if (direction == '+') {
			if (t <= size-x) return x + t;
			return move(size, t-size+x, '-', size);
		}
		else {
			if (t <= x) return x - t;
			return move(0, t-x, '+', size);
		}
    }
}