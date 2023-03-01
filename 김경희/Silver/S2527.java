import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] rec1 = new int[8];	// 하나하나의 경우를 배열로 만들어서 입력받는다.
		int[] rec2 = new int[8];
		int[] rec3 = new int[8];
		int[] rec4 = new int[8];
		
		for(int i = 0 ; i<8 ; i++) {
			rec1[i]= sc.nextInt();
		}
		
		for(int i = 0 ; i<8 ; i++) {
			rec2[i]= sc.nextInt();
		}
		
		for(int i = 0 ; i<8 ; i++) {
			rec3[i]= sc.nextInt();
		}

		for(int i = 0 ; i<8 ; i++) {
			rec4[i]= sc.nextInt();
		}

		
		// 배열로 생성된 각 경우는 아래에서 static으로 생성한 메서드로 확인해보겠다.
		System.out.println(overlapCheck(rec1));
		System.out.println(overlapCheck(rec2));
		System.out.println(overlapCheck(rec3));
		System.out.println(overlapCheck(rec4));
		
	}
	// 겹치고 말고의 경우가 너무 길어지므로 하나하나 정리해보겟다.
	static boolean xOverlap (int[] arr) {	// 이건 x축 좌표들이 겹치는 것(가로로 겹치는 것)
		return ((arr[0]<=arr[4] && arr[4]<arr[2])|| (arr[0]<arr[6] && arr[6]<=arr[2])) || (arr[4]<=arr[0] && arr[2]<=arr[6]);
	}
	static boolean yOverlap (int[] arr) {	// 이건 y축 좌표들이 겹치는 것(가로로 겹치는 것)
		return ((arr[1]<=arr[5] && arr[5]<arr[3])|| (arr[1]<arr[7] && arr[7]<=arr[3])) || (arr[5]<=arr[1] && arr[3]<=arr[7]);
	}
	static boolean xCon  (int[] arr) {	// 이건 x축 좌표가 일치하는 것.(한쪽만 일치하도록. 옆으로 붙게)
		return (arr[0]==arr[6])|| (arr[2]==arr[4]);
	}
	static boolean YCon  (int[] arr) {	// 이건 y축 좌표가 일치하는 것.(한쪽만 일치하도록. 위아래로 붙게)
		return (arr[1]==arr[7])|| (arr[3]==arr[5]);
	}
	static String overlapCheck(int[] arr) {	// 위에서 구한 아이들을 가지고 중첩이 얼마나 되는지 확인
		if(xOverlap(arr) && yOverlap(arr)) {	// x도 y도 동시에 겹치면 직사각형이 나옴 ==a
			return "a";
		}
		else if((xOverlap(arr) && YCon(arr)) || (xCon(arr) && yOverlap(arr))) {	// x나 y 중 하나만 겹치고 나머지 하나는 일치하면 선분겹침 ==b
			return "b";
		} 
		else if(xCon(arr) && YCon(arr)) {	// 한쪽면끼리 붙는 것이 x,y축 모두 일어나면 점만 만난다. ==c
			return "c";
		}else {		// 그 어떤 경우에도 만나지 않는다면 떨어져있는 거지 뭐 == d
			return "d";
		}
	}
}
