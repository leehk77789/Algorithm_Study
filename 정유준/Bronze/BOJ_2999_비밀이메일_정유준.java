import java.util.Scanner;

/**
 * BOJ_2999_비밀이메일_정유준
 */
public class BOJ_2999_비밀이메일_정유준 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int max = str.length();
        int R = 0, C = 0;
        for (int idx = 1; idx < max; idx++) {
            if (max % idx == 0 && idx <= max / idx) {
                R = idx;
                C = max / idx;
            }
        }

        int charCount = 0;
        char[][] map = new char[R][C];
        for (int col = 0; col < C; col++) {
            for (int row = 0; row < R; row++) {
                map[row][col] = str.charAt(charCount++);
            }
        }

        for (int row = 0; row < R; row++) {
            for (int col = 0; col < C; col++) {
                System.out.print(map[row][col]);
            }
        }
        sc.close();
    }
}