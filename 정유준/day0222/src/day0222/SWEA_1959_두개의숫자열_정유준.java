package day0222;

import java.util.Scanner;

public class SWEA_1959_두개의숫자열_정유준 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        for (int idx = 1; idx <= testCase; idx++) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int[] num1 = new int[N];
            int[] num2 = new int[M];
            int max = 0;
            for (int i = 0; i < num1.length; i++) {
                num1[i] = sc.nextInt();
            }
            for (int i = 0; i < num2.length; i++) {
                num2[i] = sc.nextInt();
            }
            if (N < M) {
                for (int i = 0; i < M - N + 1; i++) {
                    int sum = 0;
                    for (int j = 0; j < N; j++) {
                        sum += num1[j] * num2[i + j];
                    }
                    max = Math.max(max, sum);
                }
            } else if (N > M) {
                for (int i = 0; i < N - M + 1; i++) {
                    int sum = 0;
                    for (int j = 0; j < M; j++) {
                        sum += num1[i + j] * num2[j];
                    }
                    max = Math.max(max, sum);
                }
            } else {
                int sum = 0;
                for (int i = 0; i < N; i++) {
                    sum += num1[i] * num2[i];
                }
                max = Math.max(max, sum);
            }
            System.out.println("#" + idx + " " + max);
        }
    }
}
