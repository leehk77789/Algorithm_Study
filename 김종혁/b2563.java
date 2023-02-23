package baekjoon;

import java.util.Scanner;

public class b2563 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int[][] bigPaper = new int[100][100];

        int size = 0;
        for (int i = 0; i < num; i++) {
            int colorPaperX = sc.nextInt();
            int colorPaperY = sc.nextInt();
            for (int r = colorPaperX; r < colorPaperX + 10; r++) {
                for (int c = 90 - colorPaperY; c < 100 - colorPaperY; c++) {
                    bigPaper[r][c] = 1;
                }
            }
        }
        for(int r = 0; r < 100; r++) {
            for(int c = 0; c < 100; c++) {
                if(bigPaper[r][c] == 1) {
                    size++;
                }
            }
        }
        System.out.println(size);

    }
}