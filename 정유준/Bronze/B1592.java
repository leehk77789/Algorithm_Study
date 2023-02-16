import java.util.Scanner;

public class B1592 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int L = sc.nextInt();
        int[] ballCount = new int[N + 1];
        int nowplace = 1;
        // 1번친구 공 받은 횟수
        ballCount[1] = 1;
        // 공 던진 횟수
        int count = 0;

        while (true) {
            // 공받은 횟수 M 이면 break
            if (ballCount[nowplace] == M) {
                break;
            }
            // 홀수면 왼쪽 짝수면 오른쪽으로 L
            if (ballCount[nowplace] % 2 == 0) {
                nowplace = nowplace - L;
            } else {
                nowplace = nowplace + L;
            }
            // index 범위 초과시 N에서 인덱스를 나눈 나머지만큼 재설정
            // 몫이 1이 나오고 나머지만큼 다시 위치 설정
            if (nowplace > N) {
                nowplace %= N;
            } else if (nowplace < 1) {
                nowplace += N;
            }

            ballCount[nowplace]++;
            count++;
        }
        System.out.println(count);
        sc.close();
    }
}
