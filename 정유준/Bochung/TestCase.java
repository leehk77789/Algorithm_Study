package Bochung;

import java.util.Scanner;

public class TestCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();

        int elementCount = sc.nextInt();

        int[] numList = new int[elementCount];

        for (int idx = 0; idx < elementCount; idx++) {
            numList[idx] = sc.nextInt();
        }
    }
}
