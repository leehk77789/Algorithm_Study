package 재귀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1074_Z_정유준 {
    static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken()); // 행
        int c = Integer.parseInt(st.nextToken()); // 열
        int size = (int) Math.pow(2, N); // 한 변의 사이즈

        find(size, r, c);
        System.out.println(count);
    }

    private static void find(int size, int r, int c) {
        if (size == 1)
            return;
        int a = size / 2;
        // 1
        if (r < a && c < a) {
            find(a, r, c);
        }
        // 2
        else if (r < a && c >= a) {
            count += size * size / 4;
            find(a, r, c - a);
        }
        // 3
        else if (r >= a && c < a) {
            count += (size * size / 4) * 2;
            find(a, r - a, c);
        }
        // 4
        else {
            count += (size * size / 4) * 3;
            find(a, r - a, c - a);
        }
    }
}
