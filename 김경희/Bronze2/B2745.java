package bronze2s;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B2745 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String numOfNo = sc.next();
        int no = sc.nextInt();
        char[] ch = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        
        List<Integer> numList = new ArrayList<>();
        
        for (int i = numOfNo.length() - 1; i >= 0; i--) { // 몇자리 수일지 모르기 때문에 일의 자리부터 거꾸로 넣어준다
            for (int j = 0; j < ch.length; j++) { // 땡땡진수의 배열 중에 맞는 경우를 찾아 해당 인덱스를 숫자로 넣어준다.
                if (numOfNo.charAt(i) == ch[j]) {
                    numList.add(j);
                }
            }
        }
        
        
        int decimal = 0;
        for (int i = 0; i < numList.size(); i++) {
            int mag = (int) Math.pow(no, i);
            decimal += numList.get(i) * mag;
        }
        System.out.println(decimal);

    }

}