
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main
{	
	// 문제를 풀기위한 변수들
	static int n, k;
	// 최대한계가 100000이라 거기까지 visited 크기 잡아줌
	static int visited[] = new int[100001];
	// bfs메서드
	private static int  bfs(int node)
	{	
		// Queue를 사용함	
		Queue<Integer> queue = new LinkedList<Integer>();
		// queue에 자신의 위치를 넣고
		queue.add(node);
		int index = node; // 인덱스도 받은 노드로 지정
		int n = 0; // queue에서 나올 인자를 받을 변수 초기화
		visited[index] = 1; // 본인 자리 1로 만들기
		
		// queue에 아무것도 없을 때까지 빼기 혹은 값을 찾으면 종료
		while (queue.isEmpty() == false)
		{	// 인자를 뺴서 저장
			n = queue.remove();
			// 만약 값을 찾으면
			if (n == k)
			{	
				// 본인까지 온 숫자 1개 빼서 (시작할때 1로 시작했으므로) return
				return visited[n]-1;
			}
			
			// -1이동
			if (n-1>=0 && visited[n-1] == 0)
			{	
				// 전에 것에서 이동수 +1 해서 저장
				visited[n-1] = visited[n]+1;
				queue.add(n-1); // 위치 queue에 담기
			}
			
			// 1이동
			if (n+1 <= 100000 && visited[n+1] == 0)
			{	
				// 전에 것에서 이동수 +1 해서 저장
				visited[n+1] = visited[n]+1;
				queue.add(n+1); // 위치 queue에 담기
			}
			
			// 2곱하기 이동
			if (2*n <= 100000 && visited[2*n] == 0)
			{
				// 전에 것에서 이동수 +1 해서 저장
				visited[2*n] = visited[n] + 1;
				queue.add(2*n); // 위치 queue에 담기
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 입력받기
		n = sc.nextInt();
		k = sc.nextInt();
		// 메서드 사용
		int result = bfs(n);
		// 출력
		System.out.println(result);
	}
}