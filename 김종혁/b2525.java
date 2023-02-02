import java.util.Scanner;

public class b2525 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 현재 시간 입력
		int hour = sc.nextInt();
		int minute = sc.nextInt();
		
		// 요리 시간 입력
		int cookingTime = sc.nextInt();
		
		// 끝나는 시간 (분)
		int finishTime = minute + cookingTime;
		
		// 끝나는 시간(분)이 60을 초과하지 않을 시 바로 출력
		if((finishTime) < 60) {
			System.out.println(hour + " " + finishTime);
			// 60분을 초과할 시 초과한 시간만큼 현 시간에 추가
		} else {
			int cookingHour = finishTime/60;
			int finishMinute = finishTime%60;
			int finishHour = hour + cookingHour;
			// 끝나는 시간이 24를 초과할 시 -24
			if(finishHour < 24) {
				System.out.println(finishHour + " " + finishMinute);
			} else {
				System.out.println((finishHour-24) + " " + finishMinute);
			}
		}
	}
}
