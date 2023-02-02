import java.util.Scanner;

public class b2525 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int hour = sc.nextInt();
		int minute = sc.nextInt();
		
		int cookingTime = sc.nextInt();
		
		int finishTime = minute + cookingTime;
		
		if((finishTime) < 60) {
			System.out.println(hour + " " + finishTime);
		} else {
			int cookingHour = finishTime/60;
			int finishMinute = finishTime%60;
			int finishHour = hour + cookingHour;
			if(finishHour < 24) {
				System.out.println(finishHour + " " + finishMinute);
			} else {
				System.out.println((finishHour-24) + " " + finishMinute);
			}
		}
	}
}
