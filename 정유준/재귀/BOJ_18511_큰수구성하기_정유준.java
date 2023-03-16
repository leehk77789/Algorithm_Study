import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_18511_큰수구성하기_정유준 {
	static String givenNum;
	static boolean flag;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		int maxNum = Integer.parseInt(input[0]);
		String[] numArr = br.readLine().split(" ");
		
		givenNum = "";
		
		for(int i = 0; i < numArr.length; i++) {
			givenNum += numArr[i];
		}
		
		for(int i = maxNum; i >= 0; i--) {
			checkNum(i);
			if(flag) {
				System.out.println(i);
				break;
			}
		}
	}
	
	static void checkNum(int a) {
		if(a < 10 && givenNum.contains(Integer.toString(a % 10))) {
			flag = true;
			return;
		}
		
		if(givenNum.contains(Integer.toString(a % 10))) {
			a /= 10;
			checkNum(a);
		} else {
			return;
		}
	}
}
