import java.util.Scanner;

public class BOJ_8320_직사각형을만드는방법_정유준 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int square = sc.nextInt();
        int count = 0;

        for (int row = 1; row <= square; row++) {
            for (int col = row; row * col <= square; col++) {
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
