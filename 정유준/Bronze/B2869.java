import java.util.Scanner;

public class B2869 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int V = sc.nextInt();

        // 걸리는 기간(마지막날 하루가 더 필요할 경우를 생각해)
        // 내려오는걸 미리 빼고 시작
        int count = (V - B) / (A - B);

        // 나머지가 남으면 하루 더 올라가야함
        if ((V - B) % (A - B) != 0) {
            System.out.println(count + 1);
        } else {
            System.out.println(count);
        }

        sc.close();
    }
}
