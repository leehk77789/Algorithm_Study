package Silver;

import java.util.*;

public class BOJ_2941_크로아티아알파벳_정유준 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            char moonza = str.charAt(i);

            if (moonza == 'c') {
                if (i < str.length() - 1) {
                    if (str.charAt(i + 1) == '=') {
                        i++;
                    } else if (str.charAt(i + 1) == '-') {
                        i++;
                    }
                }
            }

            else if (moonza == 'd') {
                if (i < str.length() - 1) {
                    if (str.charAt(i + 1) == 'z') {
                        if (i < str.length() - 2) {
                            if (str.charAt(i + 2) == '=') {
                                i += 2;
                            }
                        }
                    }

                    else if (str.charAt(i + 1) == '-') {
                        i++;
                    }
                }
            }

            else if (moonza == 'l') {
                if (i < str.length() - 1) {
                    if (str.charAt(i + 1) == 'j') {
                        i++;
                    }
                }
            }

            else if (moonza == 'n') {
                if (i < str.length() - 1) {
                    if (str.charAt(i + 1) == 'j') {
                        i++;
                    }
                }
            }

            else if (moonza == 's') {
                if (i < str.length() - 1) {
                    if (str.charAt(i + 1) == '=') {
                        i++;
                    }
                }
            }

            else if (moonza == 'z') {
                if (i < str.length() - 1) {
                    if (str.charAt(i + 1) == '=') {
                        i++;
                    }
                }
            }

            count++;

        }

        System.out.println(count);
        sc.close();
    }
}
