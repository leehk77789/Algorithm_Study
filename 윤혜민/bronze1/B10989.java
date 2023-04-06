import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
        
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
        // 값 입력받기

		int k = -1;
		for (int i = 0; i < N; i++) {
			if (k < arr[i])
				k = arr[i];
		}
        // 배열의 최댓값을 k로 설정하기

        // 얻은 최댓값을 길이로 삼아 카운팅 배열 만들고 원소 세기
		int[] count = new int[k + 1];
		for (int i = 0; i < N; i++) {
			count[arr[i]]++;
		}

        // 누적합으로 만들기
		for (int i = 1; i <= k; i++) {
			count[i] += count[i - 1];
		}
        // 결과배열 만들기
		int[] arr2 = new int[N];
        // 기존 배열의 값을 하나하나 보면서 카운팅 배열에서 그걸 인덱스로 하는 값을 찾고
        // 그 값을 인덱스로 하여 결과 배열에 넣자
        // 카운팅 배열의 값을 마이너스 해주자
		for (int i = 0; i < arr.length; i++) {
			arr2[count[arr[i]] - 1] = arr[i];
			count[arr[i]]--;
		}

		for (int i = 0; i < N; i++) {
			bw.write(arr2[i] + "\n");
		}
		bw.flush();
		bw.close();
	}
}
