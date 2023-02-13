import java.util.Scanner;

public class B1110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        // 값 비교를 위한 복사
        int temp = N;
        // 횟수 count
        int count = 0;

        // 최소 1번은 해야 하니깐 do를 쓴다.
        do {
            N = ((N % 10) * 10) + (((N / 10) + (N % 10)) % 10);
            count++;
        } while (temp != N);

        System.out.println(count);

        sc.close();
    }
}
