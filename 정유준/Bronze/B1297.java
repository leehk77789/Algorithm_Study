import java.util.Scanner;

public class B1297 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
        int D = sc.nextInt();
        int H = sc.nextInt();
        int W = sc.nextInt();

        //높이와 넓이. 소수점이 나오면 그 수보다 작은 정수
        //Math.sqrt = 제곱근 Math.floor = 버림값 Math.pow = 제곱값
        double an = Math.pow(D, 2) / (Math.pow(H, 2) + Math.pow(W, 2));
        System.out.println((int)Math.sqrt(an * Math.pow(H, 2)) + " " + (int)Math.sqrt(an * Math.pow(W, 2)));
		sc.close();
    }
}

