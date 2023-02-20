import java.util.Scanner;

public class BOJ_2851_슈퍼마리오_정유준 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int goal = 100;
        int result = 0;
        int[] mushroom = new int[10];
        for (int idx = 0; idx < 10; idx++) {
            mushroom[idx] = sc.nextInt();
        }

        for (int idx = 0; idx < 10; idx++) {
            sum += mushroom[idx];
            if (Math.abs(100 - sum) <= goal) {
                goal = Math.abs(100 - sum);
                result = sum;
            }
        }
        System.out.println(result);
        sc.close();
    }
}
