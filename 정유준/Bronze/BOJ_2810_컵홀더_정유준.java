import java.util.Scanner;

public class BOJ_2810_컵홀더_정유준 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int seat = sc.nextInt();
        String str = sc.next();
        int count = 1;
        for (int i = 0; i < seat; i++) {
            char whatSeat = str.charAt(i);

            if (whatSeat == 'S') {
                count++;
            } else if (whatSeat == 'L') {
                i++;
                count++;
            }
        }
        if (count > seat) {
            System.out.println(seat);
        } else {
            System.out.println(count);
        }
        sc.close();
    }
}
