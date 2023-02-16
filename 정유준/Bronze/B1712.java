import java.util.Scanner;

public class B1712 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A = sc.nextInt();
        double B = sc.nextInt();
        double C = sc.nextInt();

        // 생산비가 이득보다 비싸면 영원히 손익분기점 못넘음
        if (B >= C) {
            System.out.println("-1");
        } else {
            // 이득 - 생산비 = 순이익
            System.out.println((int) (A / (C - B)) + 1);
        }

        // 해당 브레이크 지점에서 1을 더하는 순간부터 이득
        sc.close();
    }
}