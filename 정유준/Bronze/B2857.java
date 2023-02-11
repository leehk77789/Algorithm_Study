import java.util.Scanner;

public class B2857 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		String[] fbi = new String[5];
		int count = 0;
		for(int i = 0; i < 5; i++) {
			fbi[i] = sc.nextLine();
		}
		for(int i = 0; i < 5; i++) {
			if (fbi[i].contains("FBI")) {
				System.out.print((i+1) + " ");
				count++;
			}
		}
		if(count == 0) {
			System.out.println("HE GOT AWAY!");
		}
		sc.close();
    }
}
