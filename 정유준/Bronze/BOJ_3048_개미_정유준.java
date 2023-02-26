import java.util.Arrays;
import java.util.Scanner;

public class BOJ_3048_개미_정유준 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1Size = sc.nextInt();
        int n2Size = sc.nextInt();

        int[][] ants = new int[2][n1Size + n2Size];

        String n1Ants = sc.next();
        String n2Ants = sc.next();

        char[] allAnts = new char[n1Size + n2Size];

        sc.close();
    }
}
