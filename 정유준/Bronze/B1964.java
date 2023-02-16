import java.util.Scanner;

public class B1964 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        // 증가하는 점의 개수가 3씩 커지므로 증가량이 +3인 등차수열
        // 1번 점 개수
        double a = 5;
        // 증가하는 값
        double b = 7;

        // 마지막 증가량은 더해줄 필요가 없다. 증가량이기때문에 전 숫자에서 이미 증가
        for (int i = 1; i < N; i++) {
            a += b;
            b += 3;
        }
        // 45678로 나눈 나머지
        a %= 45678;
        if (N == 1) {
            System.out.println(5);
        } else {
            System.out.println((int) a);
        }
        sc.close();
    }
}
