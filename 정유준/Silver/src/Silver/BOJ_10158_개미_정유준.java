package Silver;

import java.util.Scanner;

public class BOJ_10158_개미_정유준 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] map = new int[col][row];

        // 우상 좌상 우하 좌하
        int[] yMove = { -1, -1, 1, 1 };
        int[] xMove = { 1, -1, 1, -1 };
        int moveIdx = 0;

        // 시작점
        int nowX = sc.nextInt();
        int nowY = sc.nextInt();

        // 움직이는 시간
        int moveTime = sc.nextInt();

        while (moveTime != 0) {
            int nextY = nowY + yMove[moveIdx];
            int nextX = nowX + xMove[moveIdx];

            // 우상으로 이동중이면 좌상으로 꺾어야된다.
            if ((nextX == row - 1 || nextY == col - 1) && nextX > nowX) {
                moveIdx = 1;
            } else if (nextY == col - 1 && nextX < nowX) {
                // 좌상으로 이동중이라면 좌하로 꺾는다.
                moveIdx = 3;
            } else if (nextY == 0 && nextX > nowX) {
                // 우하로 이동중이라면
            }

            moveTime--;
        }

        sc.close();
    }
}
