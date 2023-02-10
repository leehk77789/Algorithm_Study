import java.util.Scanner;

​
public class 2525 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int hour = sc.nextInt();

		int minute = sc.nextInt();

		int makingTime = sc.nextInt();

		int newMakingTimeHour=0;

		int newMakingTimeMinute=0;

		int overMinute = 0;

​

		if (makingTime >=60) {

			newMakingTimeHour = makingTime/60;

			newMakingTimeMinute = makingTime%60;

		} else {

			newMakingTimeMinute = makingTime;

		}

​

		if (minute+newMakingTimeMinute>=60) {

			overMinute+=1;

			newMakingTimeMinute = minute+newMakingTimeMinute-60;

		} else {

			newMakingTimeMinute += minute;

		}

​

		if (hour+newMakingTimeHour+overMinute>=24 ) {

			newMakingTimeHour=hour+newMakingTimeHour+overMinute-24;

		} else {

			newMakingTimeHour = hour+newMakingTimeHour+overMinute;

		}

​

		System.out.printf("%d %d",newMakingTimeHour,newMakingTimeMinute);

	}

}