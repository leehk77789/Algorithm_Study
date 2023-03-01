import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// 변수들 받기
		int colSize = sc.nextInt();
		int rowSize = sc.nextInt();
		
		int colStart = sc.nextInt();
		int rowStart = sc.nextInt();
		
		int time = sc.nextInt();
		
		int rowFinal;
		int colFinal;
		// x, y 좌표를 따로 생각해서 나눠준 수 만큼 계산
		int rowTime= time-(rowSize-rowStart);
		int colTime= time-(colSize-colStart);
		// 만약 나눠준 수가 2의 배수가 아니면 마지막에는 왼쪽에서 출발하므로
		if ((rowTime/rowSize)%2 == 1) {
			rowFinal = rowTime%rowSize; 
		} else {// 만약 나눠준 수가 2의 배수이면 마지막에는 오른쪽에서 출발하므로
			rowFinal = rowSize -rowTime%rowSize;
		}
		
		if ((colTime/colSize)%2 == 1) {
			colFinal = colTime%colSize; 
		} else {
			colFinal = colSize -colTime%colSize;
		}

		System.out.printf("%d %d",colFinal, rowFinal);;
		
		
		
		sc.close();
	}
	
}