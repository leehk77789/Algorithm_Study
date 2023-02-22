import java.util.HashSet;
import java.util.Scanner;

/**
 * BOJ_3052_나머지_정유준
 */
public class BOJ_3052_나머지_정유준 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> percnet = new HashSet<>();
        for (int idx = 1; idx <= 10; idx++) {
            int N = sc.nextInt();
            percnet.add(N % 42);
        }
        System.out.println(percnet.size());
        sc.close();
    }
}