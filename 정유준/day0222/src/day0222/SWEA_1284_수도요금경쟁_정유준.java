package day0222;

import java.util.Scanner;

public class SWEA_1284_수도요금경쟁_정유준 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        for (int idx = 1; idx <= testCase; idx++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            int D = sc.nextInt();
            int P = sc.nextInt();
            int bcom = 0;

            int acom = A * P;

            if (P >= C) {
                bcom = B + (D * (P - C));
            } else {
                bcom = B;
            }

            if (acom < bcom) {
                System.out.println("#" + idx + " " + acom);
            } else {
                System.out.println("#" + idx + " " + bcom);
            }
        }
        sc.close();
    }
}
