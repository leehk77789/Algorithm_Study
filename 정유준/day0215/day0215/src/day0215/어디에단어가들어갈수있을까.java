package day0215;

import java.util.Scanner;

public class 어디에단어가들어갈수있을까 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 테스트 케이스 개수
		int testCase = sc.nextInt();
		// 배열
		int[][] arr;

		for (int idx = 1; idx <= testCase; idx++) {
			// 퍼즐 사이즈 선언
			int puzzleSize = sc.nextInt();

			// 배열 선언
			arr = new int[puzzleSize][puzzleSize];

			// 단어의 길이
			int wordLength = sc.nextInt();

			// 조건을 만족하는 개수
			int canAnswerCount = 0;

			// 만들어진 퍼즐에 흰색, 검은색 넣기
			for (int puzzlecol = 0; puzzlecol < puzzleSize; puzzlecol++) {
				for (int puzzlerow = 0; puzzlerow < puzzleSize; puzzlerow++) {
					arr[puzzlecol][puzzlerow] = sc.nextInt();
				}
			}

			// 배열 제대로 들어갔는지 확인
//			for(int puzzleidxcol = 0; puzzleidxcol < puzzleSize; puzzleidxcol++) {
//				for(int puzzleidxrow = 0; puzzleidxrow < puzzleSize; puzzleidxrow++) {
//					System.out.print(arr[puzzleidxcol][puzzleidxrow]);    
//				}
//				System.out.println();
//			}

			// 만들어진 퍼즐에 단어 개수 확인
			for (int puzzlecol = 0; puzzlecol < puzzleSize; puzzlecol++) {
				for (int puzzlerow = 0; puzzlerow < puzzleSize; puzzlerow++) {
					//true, false 제대로 작동되는지 확인
//					System.out.printf("%6s ", checkEast(puzzlecol, puzzlerow, arr, wordLength, puzzleSize)||checkSouth(puzzlecol, puzzlerow, arr, wordLength, puzzleSize));
					if (checkEast(puzzlecol, puzzlerow, arr, wordLength, puzzleSize)) {
						canAnswerCount++;
					}
					if (checkSouth(puzzlecol, puzzlerow, arr, wordLength, puzzleSize)) {
						canAnswerCount++;
					}
				}
//				System.out.println();
			}
			System.out.println("#" + idx + " " + canAnswerCount);

		}
		sc.close();
	}

	public static boolean checkEast(int i, int j, int[][] arr, int wordLegnth, int puzzleSize) {
		int count = 0;
		if(arr[i][j]==0) return false;
		if (arr[i][j] == 1) {
			//시작점 여부 파악
			if ((j > 0 && arr[i][j - 1] == 0) || j == 0) {
				count++;
			} else {
				return false;
			}
		}

		while (j <= puzzleSize - 1) {
			if ((j + 1 <= puzzleSize - 1) && (arr[i][j + 1] == 1)) {
				count++;
				j++;
			} else {
				break;
			}
		}

		if ((j == puzzleSize - 1 || arr[i][j + 1] == 0) && count == wordLegnth) {
			return true;
		} else {
			return false;
		}
	}   

	public static boolean checkSouth(int i, int j, int[][] arr, int wordLegnth, int puzzleSize) {
		int count = 0;
		if(arr[i][j]==0) return false;
		if (arr[i][j] == 1) {
			if ((i > 0 && arr[i - 1][j] == 0) || i == 0) {
				count++;
			} else {
				return false;
			}
		}

		while (i <= puzzleSize - 1) {
			if ((i + 1 <= puzzleSize - 1) && (arr[i + 1][j] == 1)) {
				count++;
				i++;
			} else {
				break;
			}
		}

		if ((i == puzzleSize - 1 || arr[i + 1][j] == 0) && count == wordLegnth) {
			return true;
		} else {
			return false;
		}
	}

}
