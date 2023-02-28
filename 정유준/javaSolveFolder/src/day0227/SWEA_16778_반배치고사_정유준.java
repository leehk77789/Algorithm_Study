package day0227;

import java.util.Scanner;

/*
 * A, B, C3개의 분반
 * 분반 S1 > C, S1<= B < S2, S2<= A
 * 각 분반별 최소 인원과 최대 인원 만족해야함
 * 임의의 점수 S1, S2를 통해 배치했을 때 학생수 MAX와 학생수 MIN의 최솟값
 * 만약 최소, 최대인원 만족하는 S1, S2가 없으면 -1
 * 
 * 테케
 * 학생 수, 최소 인원, 최대 인원
 * 각 학생 점수
 */
public class SWEA_16778_반배치고사_정유준 {
	static Scanner sc = new Scanner(System.in);
	static int S1, S2;
	static int minGrade, maxGrade;
	static int[] studentGrade;
	static int minValue;

	static void input() {
		int studentNum = sc.nextInt();

		S1 = sc.nextInt();
		S2 = sc.nextInt();

		// 학생 수 넣을 배열 생성
		studentGrade = new int[studentNum];

		// 배열에 학생 점수 넣기
		for (int i = 0; i < studentNum; i++) {
			studentGrade[i] = sc.nextInt();
		}

		// 학생 최대점수 최소점수
		minGrade = 101;
		maxGrade = 0;

		// 최대 점수 최소점수 찾기
		for (int i = 0; i < studentNum; i++) {
			if (studentGrade[i] < minGrade) {
				minGrade = studentGrade[i];
			}
			if (studentGrade[i] > maxGrade) {
				maxGrade = studentGrade[i];
			}
		}
	}

	static void getGradeFromLow() {
		// 기준 점수 초기화(이전에 구했던 학생 점수 최소값 최대값으로)
		int S1 = minGrade, S2 = maxGrade;

		// 학생 수 차이
		int studentGap = 0;

		// 최소값
		minValue = studentGrade.length;

		while (minGrade != maxGrade) {
			int cClass = 0;
			int bClass = 0;
			int aClass = 0;
			for (int i = 0; i < studentGrade.length; i++) {
				if (studentGrade[i] < minGrade) {
					cClass++;
				} else if (studentGrade[i] >= minGrade && studentGrade[i] < maxGrade) {
					bClass++;
				} else {
					aClass++;
				}
			}
			if (aClass >= S1 && bClass >= S1 && cClass >= S1 && aClass <= S2 && bClass <= S2 && cClass <= S2) {
				// 최소값
				int min = Math.min(Math.min(aClass, bClass), cClass);
				int max = Math.max(Math.max(aClass, bClass), cClass);
				if (minValue > max - min) {
					minValue = max - min;
				}
			}
			S1++;
		}
	}

	static void getGradeFromMax() {
		// 기준 점수 초기화(이전에 구했던 학생 점수 최소값 최대값으로)
		int S1 = minGrade, S2 = maxGrade;

		// 학생 수 차이
		int studentGap = 0;

		while (minGrade != maxGrade) {
			int cClass = 0;
			int bClass = 0;
			int aClass = 0;
			for (int i = 0; i < studentGrade.length; i++) {
				if (studentGrade[i] < minGrade) {
					cClass++;
				} else if (studentGrade[i] >= minGrade && studentGrade[i] < maxGrade) {
					bClass++;
				} else {
					aClass++;
				}
			}
			if (aClass >= S1 && bClass >= S1 && cClass >= S1 && aClass <= S2 && bClass <= S2 && cClass <= S2) {
				// 최소값
				int min = Math.min(Math.min(aClass, bClass), cClass);
				int max = Math.max(Math.max(aClass, bClass), cClass);
				if (minValue > max - min) {
					minValue = max - min;
				}
			}
			S2--;
		}
	}

	static void getGradeFromBoth() {
		// 기준 점수 초기화(이전에 구했던 학생 점수 최소값 최대값으로)
		int S1 = minGrade, S2 = maxGrade;

		// 학생 수 차이
		int studentGap = 0;

		while (minGrade != maxGrade) {
			int cClass = 0;
			int bClass = 0;
			int aClass = 0;
			for (int i = 0; i < studentGrade.length; i++) {
				if (studentGrade[i] < minGrade) {
					cClass++;
				} else if (studentGrade[i] >= minGrade && studentGrade[i] < maxGrade) {
					bClass++;
				} else {
					aClass++;
				}
			}
			if (aClass >= S1 && bClass >= S1 && cClass >= S1 && aClass <= S2 && bClass <= S2 && cClass <= S2) {
				// 최소값
				int min = Math.min(Math.min(aClass, bClass), cClass);
				int max = Math.max(Math.max(aClass, bClass), cClass);
				if (minValue > max - min) {
					minValue = max - min;
				}
			}
			S1++;
			S2--;
		}
	}

	static void solve() {
		int testCase = sc.nextInt();
		for (int idx = 1; idx <= testCase; idx++) {
			input();
			getGradeFromLow();
			getGradeFromMax();
			getGradeFromBoth();
			if (minValue >= 1 && minValue != studentGrade.length) {
				System.out.println("#" + idx + " " + minValue);
			} else {
				System.out.println("#" + idx + " " + -1);
			}
		}
	}

	public static void main(String[] args) {
		solve();
	}
}
