package day0222;

import java.util.HashSet;
import java.util.Scanner;

/**
 * SWEA_1288_새로운불면증치료법_정유준
 */
public class SWEA_1288_새로운불면증치료법_정유준 {
    static boolean check(int[] arr) {
        for (int idx = 0; idx < 10; idx++) {
            if (arr[idx] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        for (int idx = 1; idx <= testCase; idx++) {
            int N = sc.nextInt();
            int k = 1;
            int answer = 0;
            HashSet<Integer> number = new HashSet<>();
            while (number.size() != 10) {
                answer = N * k++;

                String strNum = answer + "";
                for (int i = 0; i < strNum.length(); i++) {
                    number.add(strNum.charAt(i) - 48);
                }
            }
            System.out.println("#" + idx + " " + k);
        }
        sc.close();
    }
}