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
            boolean condition = isInteresting(i);

            if (condition) cnt++;
        }

        bw.write(cnt + "");

        bw.flush();
        bw.close();
        br.close();
    }

    private static boolean isInteresting(int number) {

        int length = String.valueOf(number).length();
        int[] numArr = new int[length];
        int[] digit = new int[10];

        for (int i = length - 1; i >= 0; i--) {
            numArr[i] = number % 10;
            digit[number % 10]++;
            number /= 10;
        }

        int zeroCnt = 0;
        for (int i = 0; i < digit.length; i++) {
            if (digit[i] == 0) {
                zeroCnt++;
            }
        }

        if (zeroCnt != 8) return false;

        Arrays.sort(numArr);
        
        int target = numArr[0];
        int cnt = 0;
        for (int i = 1; i < length; i++) {
            if (target != numArr[i]) {
                cnt++;
            }
        }

        return (length - cnt == length - 1) || (length - 1) == cnt;
    }
}