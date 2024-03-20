import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        int cnt = 0;
        for (int i = x; i <= y; i++) {
            if (isPalindrome(i)) {
                cnt++;
            }
        }

        bw.write(cnt + "");

        bw.flush();
        bw.close();
        br.close();
    }

    private static boolean isPalindrome(int number) {

        int length = String.valueOf(number).length();

        String[] palindrome = new String[length];

        for (int i = length - 1; i >= 0; i--) {
            palindrome[i] = String.valueOf(number % 10);
            number /= 10;
        }

        boolean condition = true;
        int lastIdx = length - 1;
        for (int i = 0; i <= length / 2; i++) {
            if (!palindrome[i].equals(palindrome[lastIdx - i])) {
                condition = false;
                break;
            }
        }

        return condition;
    }
}