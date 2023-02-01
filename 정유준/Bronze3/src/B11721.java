import java.util.Scanner;

public class B11721 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String N = sc.nextLine();
		int cnt = 0;
		for(int i = 0; i < N.length(); i++) {
			System.out.print(N.charAt(i));
			cnt++;
			
			if(cnt == 10) {
				System.out.println();
				cnt = 0;
				continue;
			}
		}
	}
}