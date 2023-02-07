import java.util.Scanner;

public class B1550 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        //16진수 to 10진수
        //decode (0x로 시작) parseInt (0x로 시작안하는거)
        int result = Integer.parseInt(str, 16);
        System.out.println(result);
        sc.close();
    }
}