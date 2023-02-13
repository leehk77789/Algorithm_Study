import java.util.Scanner;

public class B23968 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        // 배열 만들기
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            // 끝에는 제일 큰 수가 이미 있기때문에 배열을 1씩 줄여서 돈다
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    cnt++;
                    if (cnt == k) {
                        System.out.println(a[j] + " " + a[j + 1]);
                        return;
                    }
                }
            }
        }
        System.out.println(-1);

        sc.close();
    }
}
