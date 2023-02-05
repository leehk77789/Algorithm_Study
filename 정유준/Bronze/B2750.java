import java.util.Scanner;
import java.util.Arrays;

public class B2750 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
            int[] arr = new int[N];
            
            for(int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
     
            // 정렬 메소드
            Arrays.sort(arr);
            
            for(int val : arr) {
                System.out.println(val);
            }
            
        sc.close();
    }
}
