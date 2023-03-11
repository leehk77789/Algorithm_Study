package Silver;

import java.util.Scanner;

public class BOJ_2839_설탕배달_정유준 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sugarAmout = sc.nextInt();
        int min = 210000000;
        int maxFive = sugarAmout / 5;
        int maxThree = sugarAmout / 3;
        for (int i = 0; i <= maxFive; i++) {
            for (int j = 0; j <= maxThree; j++) {
                if ((i * 5) + (j * 3) == sugarAmout) {
                    if (min > (i + j)) {
                        min = i + j;
                    }
                }
            }
        }
        if (min == 210000000) {
            System.out.println(-1);
        } else {
            System.out.println(min);
        }
        sc.close();
    }
}
