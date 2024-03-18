import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        int maxSum = 0;
        for (int i = x; i <= y; i++) {
            maxSum = Math.max(maxSum, digitSum(i));
        }

        bw.write(maxSum + "");

        bw.flush();
        bw.close();
        br.close();
    }

    private static int digitSum(int digit) {

        int sum = 0;
        int length = String.valueOf(digit).length();

        for (int i = 0; i < length; i++) {
            sum += digit % 10;
            digit /= 10;
        }

        return sum;
    }

}