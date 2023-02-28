import java.util.Scanner;

public class BOJ_10163_색종이_정유준 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int seakjong2Amount = sc.nextInt();

        // 100 100만큼의 배열
        int[][] map = new int[101][101];

        for (int i = 1; i <= seakjong2Amount; i++) {
            int xStart = sc.nextInt(); // x시작점
            int yStart = sc.nextInt(); // y시작점
            int width = sc.nextInt(); // 넓이
            int hight = sc.nextInt(); // 높이

            // 몇번째 사각형인지
            for (int col = yStart; col < yStart + hight; col++) {
                for (int row = xStart; row < xStart + width; row++) {
                    map[col][row] = i;
                }
            }
        }
        // i번째까지 다 덮었으니 1부터 차례대로 넓이 구해서 출력
        for (int idx = 1; idx <= seakjong2Amount; idx++) {
            // 넓이 합
            int sum = 0;

            // 맵 전체탐색
            for (int col = 0; col < 101; col++) {
                for (int row = 0; row < 101; row++) {
                    if (map[col][row] == idx) {
                        sum++;
                    }
                }
            }
            System.out.println(sum);
        }

    }
}
