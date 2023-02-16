package Silver;

import java.util.Scanner;

public class S2527 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int f_dx = 0;
        int f_dy = 0;
        int f_ux = 0;
        int f_uy = 0;
        int s_dx = 0;
        int s_dy = 0;
        int s_ux = 0;
        int s_uy = 0;

        for (int tc = 1; tc <= 4; tc++) {
            f_dx = sc.nextInt();
            f_dy = sc.nextInt();
            f_ux = sc.nextInt();
            f_uy = sc.nextInt();

            s_dx = sc.nextInt();
            s_dy = sc.nextInt();
            s_ux = sc.nextInt();
            s_uy = sc.nextInt();

            // 꼭지점이 하나 겹치는 경우
            if ((f_ux == s_dx && f_uy == s_dy) || (f_dx == s_ux && f_uy == s_dy) || (f_dx == s_ux && f_dy == s_uy)
                    || (f_ux == s_dx && f_dy == s_uy)) {
                System.out.println("c");
            } else if (f_uy < s_dy || f_ux < s_dx || s_uy < f_dy || s_ux < f_dx) {
                // 하나도 안겹치는 경우
                System.out.println("d");
            } else if (f_ux == s_dx || f_uy == s_dy || f_dx == s_ux || f_dy == s_uy) {
                // 한변이 겹치는 경우
                System.out.println("b");
            } else {
                // 다 제외하면 직사각형이 겹침
                System.out.println("a");
            }
        }
        sc.close();
    }
}
