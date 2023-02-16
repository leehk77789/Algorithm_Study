import java.util.Scanner;

public class B2292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int count = 1;
        // 1은 기본값이기 때문에 2부터 시작
        int min = 2;
        if (N == 1) {
            System.out.println(1);
        } else {
            while (min <= N) {
                min = min + (6 * count);
                count++;
            }
            System.out.println(count);
        }
        // 2번풀이 이거 왜틀림?
        // int N = sc.nextInt();
        // int count = 1;
        // if (N == 1) {
        // System.out.println(1);
        // } else {
        // while (N >= 7) {
        // N = N - (6 * count);
        // count++;
        // }
        // System.out.println(count);
        // }

        sc.close();
    }
}
