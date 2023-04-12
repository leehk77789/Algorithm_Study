import java.util.Scanner;

public class S24060 {
	
	// 병합정렬
	static int N, K, cnt, ans;
	static int[] arr, sorted;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		K = sc.nextInt();
		arr = new int[N];
		
		// 실시간으로 정렬해줄 배열
		sorted = new int[N];
		
		cnt = 0; // 문제에서 주어진 K번째를 찾기 위한 카운트
		ans = 0; // 최종 답
		
		for(int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		mergeSort(0, N-1); // 제일 왼쪽 인덱스와 오른쪽 인덱스를 들고 mergeSort
		
		if(cnt > K) System.out.println(ans);
		else System.out.println(-1);
		
	}
	
	static void mergeSort(int left, int right) {
		// 쪼갤 수 있을 때 까지 반을 뚝 쪼개서 볼거야
		if(left < right) {
			int mid = (left + right)/2;
			mergeSort(left, mid); 
			mergeSort(mid + 1, right);
			// 이렇게 반반씩 계속 재귀를 돌려서 뚱깡뚱깡
			merge(left, mid, right);
			// 다 쪼갰으면 merge 보내기
		}
	}
	
	static void merge(int left, int mid, int right) {
		// 역시 절반으로 뚝 쪼개진 상태에서 
		// 각각의 뭉텅이를 왼쪽부터 오른쪽 방향으로 하나하나 비교할거야
		int L = left; // 왼쪽 뭉텅이 기준 인덱스
		int R = mid + 1; // 오른쪽 뭉텅이 기준 인덱스
		int idx = left; // 정렬용 인덱스
		
		// 어느 한쪽 뭉텅이의 인덱스가 중간에 도달하기 전까지 반복하기
		while(L <= mid && R <= right) {
			if(arr[L] < arr[R]) {
				// 만약 왼쪽 뭉텅이 원소보다 오른쪽이 더 크면?
				sorted[idx] = arr[L];
				// 작은쪽 애를 정렬 배열에 저장하고 각각 인덱스 증가시키고
				idx++; L++;
			} else {
				// 여기는 반대로
				sorted[idx] = arr[R];
				idx++; R++;
			}
			
		}
		// 반복문을 나왔다는건 왼쪽 뭉텅이나 오른쪽 뭉텅이 둘 중 하나의 인덱스가 mid에 도달했음을 의미
		// 그럼 나머지 도달하지 않은 부분들은 정렬 배열에 저장되지 못했을테니 저장해줘야대
		
		if(L <= mid) {
			// 왼쪽 인덱스가 도달을 못했다면 얘네를 쫘라락 저장하자
			for(int i = idx; i < right + 1; i++) {
				// 애초에 주어진 파라미터에서 right은 현재 정렬하는 부분의 제일 오른쪽을 의미하니까
				// 뚝 끊긴 인덱스부터 끝까지 착착 채워진다고 생각
				sorted[i] = arr[L];
				L++;
			}
		} else {
			// 여긴 반대로 마찬가지
			for(int i = idx; i < right + 1; i++) {
				sorted[i] = arr[R];
				R++;
			}
		}
		// 그럼 정렬배열이 다 채워졌다!
		// 그걸 다시 원래 배열에 돌려놓자
		// 그래야 우리가 얘네를 계속 사용하면서 점점 뭉탱이를 합친당
		// 바로 위에서 남은 부분을 쫘라락 저장한것도 지금 여기서 배열을 정렬된 상태로 지속해서 업데이트 하니까
		// 정렬된 상태로 쫘라락 저장 가능한거임
		for(int i = left; i <= right; i++) {
			arr[i] = sorted[i];
			cnt++;
			if(cnt == K) ans = arr[i];
		}
	}
}
