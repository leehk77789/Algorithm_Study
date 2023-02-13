import java.util.Scanner;

public class B1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        // 배열 주소 저장
        int save = 0;

        // 최빈값
        int max = 0;

        // 최대개수 2개인지 확인용 count
        int count = 0;

        // 알파벳 개수 확인용 배열
        int apbcount[] = new int[26];

        // 전부다 대문자로 변환
        str = str.toUpperCase();

        for (int i = 0; i < str.length(); i++) {
            // 기본값인 A를 빼줌으로써 A가 나오면 apbcount[0] 1증가
            apbcount[str.charAt(i) - 'A']++;
        }

        for (int i = 0; i < apbcount.length; i++) {
            if (max < apbcount[i]) {
                max = apbcount[i];
                save = i;
            }
        }

        // 최대값 구한 뒤 해당 최대값 계수랑 비슷한 개수 확인
        for (int i = 0; i < apbcount.length; i++) {
            if (max == apbcount[i]) {
                count++;
            }
        }

        // 최대값 2개면 ?출력
        if (count >= 2) {
            System.out.println("?");
        } else {
            // 아스키코드 출력 A로 부터 save번째 알파벳
            System.out.println((char) (save + 65));
        }
        sc.close();
    }
}
