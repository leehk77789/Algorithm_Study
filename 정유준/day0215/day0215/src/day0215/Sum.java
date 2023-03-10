package day0215;

import java.util.Scanner;

public class Sum {

static Scanner sc= new Scanner(System.in);
static int arr[][] = new int[100][100];
static int max;

static void input() {
	for(int col = 0; col < 100; col++) {
		for(int row = 0; row < 100; row++) {
			arr[col][row] = sc.nextInt();
		}
	}
}

static int sum() {
	max = 0;
	//가로 합 비교
	for(int col = 0; col < 100; col++) {
		int tempMax = 0;
		for(int row = 0; row < 100; row++) {
			tempMax += arr[col][row];
		}
		if(tempMax > max) {
			max = tempMax;
		}
	}
	
	//세로 합 비교
	for(int row = 0; row < 100; row++) {
		int tempMax = 0;
		for(int col = 0; col < 100; col++) {
			tempMax += arr[col][row];
		}
		if(tempMax > max) {
			max = tempMax;
		}
	}
	int row = 0;
	int col = 0;
	int tempMax = 0;
	//좌상우하 대각선
	while(row <= 99) {
		tempMax += arr[col][row];
		col++; row++;
	}
	if(tempMax > max) {
		max = tempMax;
	}
	
	row = 99;
	col = 0;
	tempMax = 0;
	//우상좌하 대각선
	while(row >= 0) {
		tempMax += arr[col][row];
		col++; row--;
	}
	if(tempMax > max) {
		max = tempMax;
	}
	
	return max;
}

	public static void main(String[] args) {

		for(int i = 1; i <= 10; i++) {
			int testCase = sc.nextInt();
			input();
			sum();
			System.out.println("#" + testCase + " " + max);
		}
		
	}
}
