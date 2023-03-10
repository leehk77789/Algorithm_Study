package test04;

public class Test4_2zinSearch {

	public static void main(String[] args) {
		int[] A = {2, 4, 7, 9, 11, 19, 23};
	}
	
	public static int binarySearch(int[] A, int key) {
		int n = A.length;
		
		//가장 처음에는 전체 구간을 대상으로 시작
		int start = 0;
		int end = n-1;
		
		while(start <= end) {
			//가운데가 우리가 찾는 값으로 가정한다
			int middle = (start+end) / 2;
			
			if(A[middle] == key) {
				return middle;
			} else if(A[middle] > key) {
				//범위를 middle기준 왼쪽으로 재지정
				end = middle - 1;
			} else {
				//범위를 middle기준 오른쪽으로 재지정
				start = middle + 1;
			}
		}
		//while문을 빠져나오면 start > end인 상황
		return -1;
	}
}
