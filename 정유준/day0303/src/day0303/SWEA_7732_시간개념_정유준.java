package day0303;

import java.util.Scanner;

public class SWEA_7732_시간개념_정유준 {
	static Scanner sc = new Scanner(System.in);
	static int[] nowTimeInt;
	static int[] promiseTimeInt;
	static int resultSi;
	static int resultBun;
	static int resultCho;
	static int nowTimeSum;
	static int promiseTimeSum;
	static int leftSum;
	static String time;

	static void input() {
		nowTimeInt = new int[3];
		promiseTimeInt = new int[3];
		resultSi = 0;
		resultBun = 0;
		resultCho = 0;
		leftSum = 86400;
		time = "";

		String nowTime = sc.next();
		String[] nowtimeArr = nowTime.split(":");
		String promiseTime = sc.next();
		String[] promiseTimeArr = promiseTime.split(":");
		nowTimeSum = (Integer.parseInt(nowtimeArr[0]) * 3600) + (Integer.parseInt(nowtimeArr[1]) * 60)
				+ (Integer.parseInt(nowtimeArr[2]));
		promiseTimeSum = (Integer.parseInt(promiseTimeArr[0]) * 3600) + (Integer.parseInt(promiseTimeArr[1]) * 60)
				+ (Integer.parseInt(promiseTimeArr[2]));

	}

	static boolean checkPromise() {
		if (promiseTimeSum < nowTimeSum) {
			return true;
		}
		return false;
	}

	static void meetToday() {
		int minus = promiseTimeSum - nowTimeSum;
		resultSi = minus / 3600;
		minus %= 3600;
		resultBun = minus / 60;
		minus %= 60;
		resultCho = minus;
		// System.out.println(resultSi + "시" + resultBun + "분" + resultCho + "초");
	}

	static void meetPromise() {
		int minus = leftSum - nowTimeSum + promiseTimeSum;
		resultSi = minus / 3600;
		minus %= 3600;
		resultBun = minus / 60;
		minus %= 60;
		resultCho = minus;
		// System.out.println(resultSi + "시" + resultBun + "분" + resultCho + "초");
	}

	static void makeTime() {
		if (resultSi < 10) {
			time += "0" + Integer.toString(resultSi) + ":";
		} else {
			time += Integer.toString(resultSi) + ":";
		}

		if (resultBun < 10) {
			time += "0" + Integer.toString(resultBun) + ":";
		} else {
			time += Integer.toString(resultBun) + ":";
		}
		if (resultCho < 10) {
			time += "0" + Integer.toString(resultCho);
		} else {
			time += Integer.toString(resultCho);
		}
	}

	static void solve() {
		int testCase = sc.nextInt();
		for (int idx = 1; idx <= testCase; idx++) {
			input();
			if (checkPromise()) {
				meetPromise();
			} else {
				meetToday();
			}
			makeTime();
			System.out.println("#" + idx + " " + time);
		}
	}

	public static void main(String[] args) {
		solve();
	}
}
