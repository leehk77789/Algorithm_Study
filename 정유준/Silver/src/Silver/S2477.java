package Silver;

import java.util.Scanner;

public class S2477 {
    static Scanner sc = new Scanner(System.in);

    static int chamwae;
    static int[] chamwaeMap = new int[6];

    // 가로, 세로
    static int width = 0;
    static int height = 0;

    // 가로, 세로 최대값
    static int widMax = 0;
    static int heiMax = 0;

    static void input() {
        chamwae = sc.nextInt();
        for (int idx = 0; idx < 6; idx++) {
            // 번호
            sc.nextInt();
            chamwaeMap[idx] = sc.nextInt();
        }
    }

    static void compare() {
        // 가로 최대값의 인덱스 찾기
        for (int idx = 0; idx < 6; idx++) {
            if(idx % 2 == 0)
        }

    }

    public static void main(String[] args) {
        solve();
        sc.close();
    }
}
