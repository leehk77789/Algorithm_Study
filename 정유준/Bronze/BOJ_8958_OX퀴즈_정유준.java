import java.util.Scanner;

public class BOJ_8958_OX퀴즈_정유준 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testCase = sc.nextInt();
        for (int idx = 1; idx <= testCase; idx++) {
            int count = 0;
            int sum = 0;
            String ox = sc.next();
            for (int i = 0; i < ox.length(); i++) {
                if (ox.charAt(i) == 'O') {
                    count++;
                    sum += count;
                } else if (ox.charAt(i) == 'X') {
                    count = 0;
                }
            }
            System.out.println(sum);
        }
        sc.close();
    }
}
