import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 스캐너 받기
		Scanner sc = new Scanner(System.in);
		
		// 스위치 갯수 받기
		int numSwitch = sc.nextInt();
		// 스위치 정보를 받을 배열
		int[] switchArr = new int[numSwitch];
		// for문으로 스위치 배열에 넣기
		for(int idx=0; idx<switchArr.length; idx++) {
			switchArr[idx] = sc.nextInt();
		}
		// 학생수 받기
		int studentNum = sc.nextInt();
		
		// for문으로 학생 정보 받기
		for (int stu=1; stu<=studentNum; stu++) {
			// 남자인지 여자인지 받기
			int BOrG = sc.nextInt();
			// 숫자 받기
			int num = sc.nextInt();
			
        // 풀이 방법
        // 1. 남자인지 여자인지 판별하고
        // 2. 남자는 배수 만큼 바꿔주기 위해 %를 사용
        // 3. 여자는 본인 스위칭 해준 후, 
        //    중심을 기준으로 왼쪽인지 오른쪽인지 판별후 양쪽 확인하여 같은 만큼 바꾸기
            
            
			// if문으로 각 성별마다 역할 지정 후 실행
			if (BOrG == 1) { // 남자면
				for (int idx=0; idx<switchArr.length; idx++) { // 각 스위치 마다 배수 확인
					if (idx%num == num-1) {
						if (switchArr[idx] == 0) { // if문으로 0이면 1로 1이면 0으로
							switchArr[idx] = 1;
						} else {
							switchArr[idx] = 0;
						}
					}
				}
			} else { // 여자면
				if (numSwitch/2 < num) { // 여자가 받은 수가 중간값보다 크면
					if (switchArr[num-1] == 1) { // 본인 스위칭 해주기
						switchArr[num-1] = 0;
						switchArr[num-1] = 0;
					} else {
						switchArr[num-1] = 1;
						switchArr[num-1] = 1;
					}
					for (int idx=1; idx<=switchArr.length-num;idx++) { // 끝 값을 max로
						if(switchArr[num-1-idx] == switchArr[num-1+idx]) { // 양쪽값을 비교후
							if (switchArr[num-1-idx] == 1) { // 스위칭 해주기
								switchArr[num-1-idx] = 0;
								switchArr[num-1+idx] = 0;
							} else {
								switchArr[num-1-idx] = 1;
								switchArr[num-1+idx] = 1;
							}
						} else {
							break;
						}
					}
				} else { // 여자가 받은 수가 중간값보다 작으면
					if (switchArr[num-1] == 1) { // 본인 스위칭 해주기
						switchArr[num-1] = 0;
						switchArr[num-1] = 0;
					} else {
						switchArr[num-1] = 1;
						switchArr[num-1] = 1;
					}
					for (int idx=1; idx<num;idx++) { // 끝 값을 max로
						if(switchArr[num-1-idx] == switchArr[num-1+idx]) { // 양쪽값을 비교후
							if (switchArr[num-1-idx] == 1) { // 스위칭 해주기
								switchArr[num-1-idx] = 0;
								switchArr[num-1+idx] = 0;
							} else {
								switchArr[num-1-idx] = 1;
								switchArr[num-1+idx] = 1;
							}
						} else {
							break;
						}
					}
				}
			} 
		}
		
		for (int idx=0; idx<switchArr.length;idx++) { // 맨끝만 스페이스 없기
			if(idx==0) {
				System.out.printf("%d ",switchArr[idx]);
				continue;
			}
			
			if (idx == switchArr.length-1) {
				System.out.printf("%d",switchArr[idx]);
			} else {
				if (idx%20==19) {
					System.out.printf("%d\n",switchArr[idx]);
				} else {
					System.out.printf("%d ",switchArr[idx]);
				}
				
			}
		}
		
	}
}