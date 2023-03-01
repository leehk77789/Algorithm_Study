package silver;

import java.util.Scanner;

public class 참외밭2477 {
	public static void main(String[] args) {
		// 전체 사각형 넓이에서 작은 사각형 부분의 넓이를 빼줄 것입니다. 
		// 전체 넓이를 구할 때, 주어진 길이 중 가장 긴 길이와 그 옆의 길이(둘 중 긴 애겠죠?)를 곱해줍니다.
		// 작은 부분의 넓이를 구할 때, 가장 긴 길이와 그에 곱한 길이의 '인덱스' 에서 3을 더한 위치에 있는 길이가 작은 부분의 가로와 세로입니다.
		
		
		Scanner sc = new Scanner(System.in);

		int perUnit = sc.nextInt(); // 1제곱미터 당 들어있는 참외 수 입력받기.

		int[] dir = new int[6];
		int[] length = new int[6];

		for (int i = 0; i < 6; i++) { // 방향과 길이 모두 배열에 집어넣는다. 여기서의 풀이에서 방향은 크게 의미가 없다. 
			dir[i] = sc.nextInt();
			length[i] = sc.nextInt();
		}

		int longest = 0;
		int longestIdx = 0;
		for (int i = 0; i < 6; i++) { // 길이 배열에 대하여, 최댓값과 그 인덱스를 구해볼 것이다.
			if (length[i] > longest) {
				longest = length[i];
				longestIdx = i;
			}
		}
		// longest(가장 긴 변)과 longestIdx가 구해졌다.
		// 방향에서 이 인덱스가 가리키는 방향은?  dir[longestIdx]
		// 가장 긴 변은 온전한 변이므로, 그 옆에 붙어있는 변 중 긴 변이 또 다른 온전한 변이다.
		
		int ontheLeft = ((longestIdx-1)+6)%6; // 가장 긴 변의 좌측인덱스
		int ontheRight = (longestIdx+1)%6; // 가장 긴 변의 우측인덱스 좌, 우 중 뭐가 당첨될까나~
		// 인덱스의 좌, 우로 움직였을 때 범위를 벗어나지 않게 조치를 취함.(나머지값으로 구하기)
		int restElofTotal = 0; // 위 둘 중  더 긴 변 인덱스로 구해진 값~~
		int oneofSmall = 0; // 작은 사각형의 두 변 초기화 
		int theOtherofSmall = 0;
		 if(length[ontheLeft] < length[ontheRight]) {	// 가장 긴 변의 양 옆 중 어떤 변이 더 기니?
			 restElofTotal = length[ontheRight];	 // 이것이 전체 넓이를 구할 또다른 변의 길이.
			 // 이때의 작은 사각형의 두 변을 구해보자. 방금 구해진 두 변에서 세 칸 더한 값.
			 oneofSmall = length[(longestIdx+3)%6];
			 theOtherofSmall = length[(ontheRight+3)%6];
			 
		 }else {
			 restElofTotal = length[ontheLeft];	
			 oneofSmall = length[(ontheLeft+3)%6];
			 theOtherofSmall = length[(longestIdx+3)%6];
		 }
		 
		 int area = (longest*restElofTotal) - (oneofSmall*theOtherofSmall);	// 드디어 구했다 넓이
		 
		 
		 System.out.println(area * perUnit);
		
		
	}

}
