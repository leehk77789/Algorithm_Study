import java.util.Scanner;

public class B4344 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] N;
        // 케이스 개수
        int C = sc.nextInt();
        for (int i = 0; i < C; i++) {
            double result = 0;
            double count = 0;
            // 학생 수만큼 배열 만들기
            int student = sc.nextInt();
            N = new int[student];
            for (int j = 0; j < N.length; j++) {
                N[j] = sc.nextInt();
                result += N[j];
            }

            // 평균값
            double percent = result / student;

            // 평균값 이상인 학생 수 구하기
            for (int j = 0; j < N.length; j++) {
                if (N[j] > percent) {
                    count++;
                }
            }
            // 소수 3번째 자리까지 출력
            System.out.printf("%.3f%%\n", (count / student) * 100);
        }
        sc.close();
    }
}
